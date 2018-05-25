package vliegenier04.playerLocator.main.client.world;

import com.github.lunatrius.core.util.math.BlockPosHelper;
import com.github.lunatrius.core.util.math.MBlockPos;
import vliegenier04.playerLocator.main.api.IPlayerLocator;
import vliegenier04.playerLocator.main.client.renderer.chunk.ChunkProviderPL;
import vliegenier04.playerLocator.main.client.world.storage.playerLocator;

import vliegenier04.playerLocator.main.util.Names;
import vliegenier04.playerLocator.main.util.Reference;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateMatcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.profiler.Profiler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Map;

public class playerLocatorWorld extends WorldClient {
    public playerLocatorWorld(NetHandlerPlayClient netHandler, WorldSettings settings, int dimension,
			EnumDifficulty difficulty, Profiler profilerIn) {
		super(netHandler, settings, dimension, difficulty, profilerIn);
	}

    public static enum LayerMode {
        ALL(Names.Gui.Control.MODE_ALL) {
            @Override
            public boolean shouldUseLayer(final playerLocatorWorld world, final int layer) {
                return true;
            }
        },
        SINGLE_LAYER(Names.Gui.Control.MODE_LAYERS) {
            @Override
            public boolean shouldUseLayer(final playerLocatorWorld world, final int layer) {
                return layer == world.renderingLayer;
            }
        },
        ALL_BELOW(Names.Gui.Control.MODE_BELOW) {
            @Override
            public boolean shouldUseLayer(final playerLocatorWorld world, final int layer) {
                return layer <= world.renderingLayer;
            }
        };
    	
        public boolean shouldUseLayer(playerLocatorWorld world, int layer) {
			// TODO Auto-generated method stub
			return false;
		}

		private LayerMode(String name) {
            this.name = name;
        }

        public final String name;

        public static LayerMode next(final LayerMode mode) {
            LayerMode[] values = values();
            return values[(mode.ordinal() + 1) % values.length];
        }
    }

    public final MBlockPos position = new MBlockPos();
    public boolean isRendering = false;
    public LayerMode layerMode = LayerMode.ALL;
    public int renderingLayer = 0;
	private static final WorldSettings WORLD_SETTINGS = new WorldSettings(0, GameType.CREATIVE, false, false, WorldType.FLAT);

	private IPlayerLocator pLW;
	
    @Override
    public Biome getBiome(final BlockPos pos) {
        return Biomes.JUNGLE;
    }

    public int getWidth() {
        return this.pLW.getWidth();
    }

    public int getLength() {
        return this.pLW.getLength();
    }

    @Override
    public int getHeight() {
        return this.pLW.getHeight();
    }

    @Override
    protected IChunkProvider createChunkProvider() {
        this.chunkProvider = new ChunkProviderPL(this);
        return this.chunkProvider;
    }

    @Override
    public Entity getEntityByID(final int id) {
        return null;
    }

    @Override
    public boolean isSideSolid(final BlockPos pos, final EnumFacing side) {
        return isSideSolid(pos, side, false);
    }

    @Override
    public boolean isSideSolid(final BlockPos pos, final EnumFacing side, final boolean _default) {
        return getBlockState(pos).isSideSolid(this, pos, side);
    }


    public void initializeTileEntity(final TileEntity tileEntity) {
        tileEntity.setWorld(this);
        tileEntity.getBlockType();
        try {
            tileEntity.invalidate();
            tileEntity.validate();
        } catch (final Exception e) {
            Reference.logger.error("TileEntity validation for {} failed!", tileEntity.getClass(), e);
        }
    }

    public void setIcon(final ItemStack icon) {
        this.pLW.setIcon(icon);
    }

    public ItemStack getIcon() {
        return this.pLW.getIcon();
    }

    public List<TileEntity> getTileEntities() {
        return this.pLW.getTileEntities();
    }

    public String getDebugDimensions() {
        return "WHL: " + getWidth() + " / " + getHeight() + " / " + getLength();
    }

    public boolean isInside(final BlockPos pos) {
        final int x = pos.getX();
        final int y = pos.getY();
        final int z = pos.getZ();

        return !(x < 0 || y < 0 || z < 0 || x >= getWidth() || y >= getHeight() || z >= getLength());
    }
}