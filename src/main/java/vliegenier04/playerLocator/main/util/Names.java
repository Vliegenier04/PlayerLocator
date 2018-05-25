package vliegenier04.playerLocator.main.util;

public final class Names {
		public static final class Config {
			public final class Category {

			public static final String DEBUG = "debug";
            public static final String RENDER = "render";
            public static final String GENERAL = "general";
            public static final String SERVER = "server";
			
            public static final String DUMP_BLOCK_LIST = "dumpBlockList";
            public static final String DUMP_BLOCK_LIST_DESC = "Dump all block states on startup.";
            public static final String SHOW_DEBUG_INFO = "showDebugInfo";
            public static final String SHOW_DEBUG_INFO_DESC = "Display extra information on the debug screen (F3).";

            public static final String ALPHA_ENABLED = "alphaEnabled";
            public static final String ALPHA_ENABLED_DESC = "Enable transparent textures.";
            public static final String ALPHA = "alpha";
            public static final String ALPHA_DESC = "Alpha value used when rendering the schematic (1.0 = opaque, 0.5 = half transparent, 0.0 = transparent).";
            public static final String HIGHLIGHT = "highlight";
            public static final String HIGHLIGHT_DESC = "Highlight invalid placed blocks and to be placed blocks.";
            public static final String HIGHLIGHT_AIR = "highlightAir";
            public static final String HIGHLIGHT_AIR_DESC = "Highlight blocks that should be air.";
            public static final String BLOCK_DELTA = "blockDelta";
            public static final String BLOCK_DELTA_DESC = "Delta value used for highlighting (if you experience z-fighting increase this).";
            public static final String RENDER_DISTANCE = "renderDistance";
            public static final String RENDER_DISTANCE_DESC = "Schematic render distance.";

            public static final String PLACE_DELAY = "placeDelay";
            public static final String PLACE_DELAY_DESC = "Delay between placement attempts (in ticks).";
            public static final String TIMEOUT = "timeout";
            public static final String TIMEOUT_DESC = "Timeout before re-trying failed blocks.";
            public static final String PLACE_DISTANCE = "placeDistance";
            public static final String PLACE_DISTANCE_DESC = "Maximum placement distance.";
            public static final String PLACE_INSTANTLY = "placeInstantly";
            public static final String PLACE_INSTANTLY_DESC = "Place all blocks that can be placed in one tick.";
            public static final String DESTROY_BLOCKS = "destroyBlocks";
            public static final String DESTROY_BLOCKS_DESC = "The printer will destroy blocks (creative mode only).";
            public static final String DESTROY_INSTANTLY = "destroyInstantly";
            public static final String DESTROY_INSTANTLY_DESC = "Destroy all blocks that can be destroyed in one tick.";
            public static final String PLACE_ADJACENT = "placeAdjacent";
            public static final String PLACE_ADJACENT_DESC = "Place blocks only if there is an adjacent block next to them.";
            public static final String SWAP_SLOT = "swapSlot";
            public static final String SWAP_SLOT_DESC = "Allow the printer to use this hotbar slot.";

            public static final String playerlocator_DIRECTORY = "playerlocatorDirectory";
            public static final String playerlocator_DIRECTORY_DESC = "PlayerLocator directory.";
            public static final String EXTRA_AIR_BLOCKS = "extraAirBlocks";
            public static final String EXTRA_AIR_BLOCKS_DESC = "Extra blocks to consider as air for the schematic renderer.";
            public static final String SORT_TYPE = "sortType";
            public static final String SORT_TYPE_DESC = "Default sort type for the material list.";

            public static final String SAVE_ENABLED = "saveEnabled";
            public static final String SAVE_ENABLED_DESC = "Allow players to save schematics.";
            public static final String LOAD_ENABLED = "loadEnabled";
            public static final String LOAD_ENABLED_DESC = "Allow players to load schematics.";

            public static final String PLAYER_QUOTA_KILOBYTES = "playerQuotaKilobytes";
            public static final String PLAYER_QUOTA_KILOBYTES_DESC = "Amount of storage provided per-player for schematics on the server.";

            public static final String LANG_PREFIX = Reference.MODID + ".config";
			
			}
		public static final class Gui {
			public static final class Load {
				public static final String LOAD_SONG = "loadSong";
				public static final String LOAD_SONG_DESC = "Load a song or audiofile into the database";
				public static final String LOAD_AREA = "loadArea";
				public static final String LOAD_AREA_DESC = "Load an area into your PlayerLocator";
				
				
			}
			public static final class Control {
				public static final String POSITIONX = "positionX";
				public static final String POSITIONX_DESC = "Set the X position";
				public static final String POSITIONY = "positionY";
				public static final String POSITIONY_DESC = "Set the Y position";
				public static final String POINT_BLACK = "PLMain.gui.point.black";
				public static final String POINT_WHITE = "PLMain.gui.point.black";
				public static final String SAVE = "PLMain.gui.save";
				public static final String SAVE_SELECTION = "PLMain.gui.saveselection";
				public static final String MODE_ALL = "PLMain.gui.all";
				public static final String MODE_LAYERS = "PLMain.gui.layers";
				public static final String MODE_BELOW = "PLMain.gui.below";
				
				
						}
			public static final String X = "PLMain.gui.x";
			public static final String Y = "PLMain.gui.y";
		}
		public static final class Extensions {
			public static final String PLAYERLOC = ".playerlocator";
			
		}
		}
}

