package vliegenier04.playerLocator.main.client.gui;

import com.github.lunatrius.core.client.gui.GuiNumericField;
import com.github.lunatrius.core.client.gui.GuiScreenBase;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiButton.*;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import vliegenier04.playerLocator.main.util.Names;
import vliegenier04.playerLocator.main.proxy.*;
import vliegenier04.playerLocator.main.proxy.ClientProxy;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import vliegenier04.playerLocator.main.PLMain;
import vliegenier04.playerLocator.main.client.world.playerLocatorWorld;
import net.minecraftforge.fml.client.config.GuiUnicodeGlyphButton;
import net.minecraft.client.Minecraft;


import java.io.IOException;


public class PLOPTIONSGUI extends GuiScreenBase {
	
	private GuiButton mButtonClose;
	private GuiButton mButtonSetPosition1;
	private GuiButton mButtonSetPosition2;
	private GuiButton mButtonLoad_Area;
	private GuiButton mButtonLoad_Song;
	
	
	private final String strX = I18n.format(Names.Gui.X);
	private final String strY = I18n.format(Names.Gui.Y);
	private final String strLoad_Area = I18n.format(Names.Gui.Load.LOAD_AREA);
	private final String strLoad_Song = I18n.format(Names.Gui.Load.LOAD_SONG);
	private final String strSetPointX = I18n.format(Names.Gui.X);
	private final String strSetPointY = I18n.format(Names.Gui.Y);
	
	
	private final String COMMAND_NAME = "PLGUI";
	private final String COMMAND_HELP = "Help for PlayerLocator OptionsGUI";
	private int centerX = 0;
	private int centerY = 0;
	
	private GuiTextField numericX = null;
	private GuiTextField numericY = null;
	
	private final playerLocatorWorld plW;
	
	
	@Override
	public void initGui() {
		this.centerX  = this.width / 2;
		this.centerY = this.height / 2;
	
		this.buttonList.clear();
		
		int id = 0;
		
		this.numericX = new GuiNumericField(this.fontRenderer, id++, this.centerX - 50, this.centerY - 30, 100, 20);
		this.buttonList.add(this.numericX);
		
        this.numericY = new GuiNumericField(this.fontRenderer, id++, this.centerX - 50, this.centerY - 5, 100, 20);
        this.buttonList.add(this.numericY);
        
        this.mButtonLoad_Area = new GuiButton(this.fontRenderer, id++, this.height - 200, 80, 20, this.strLoad);
        this.buttonList.add(this.mButtonLoad_Area);
        
        this.mButtonLoad_Song = new GuiButton(this.fontRenderer, id++, this.height - 150 - 25, 80, 20, I18n.format(strLoad_Song);
        this.buttonList.add(this.mButtonLoad_Song);
        
        this.mButtonSetPosition1 = new GuiButton(this.fontRenderer, id++,this.width - 90, this.height - 80, 80, 20, I18n.format(Names.Gui.Control.POINT_BLACK);
        this.buttonList.add(this.mButtonSetPosition1);
        
        this.mButtonSetPosition2 = new GuiButton(this.fontRenderer, id++, this.width - 90, this.height - 55, 80, 20, I18n.format(Names.Gui.Control.POINT_WHITE);
        this.buttonList.add(this.mButtonSetPosition2);
        
        private void setPoint(final GuiNumericField numX, final GuiNumericField numY, final BlockPos point)
        {
        	numX.setValue(point.GetX());
        	numY.setValue(point.getY());
        
        }
        
        @Override
        protected void actionPeformed(final GuiButton guiButton)
        {
        	if (guiButton.enabled 
        	{
        		if (this.pLW == null) 
        		{
        			return;
        		}
        		if (guiButton.id == this.numericX.id) {
        			this.plW.position.x = this.numericX.getValue();
        			RenderPL.INSTANCE.refresh();
        		}
        		else if (guiButton.id == this.numericY.id) 
        		{
        			this.plW.position.y = this.numericY.getValue();
        			RenderPL.INSTANCE.refresh();
        		}
        		else if (guiButton.id == this.mButtonClose.id) {
        			PLMain.proxy.closeGui();
        			this.mc.displayGuiScreen(this.parentScreen);
        		}
        		
        			
        		}
        	}
        }
        @Override
        public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) 
        {
        	//drawDefaultBackground();
        	
        	drawString(this.fontRenderer, this.strX, this.centerX - 65, this.centerY - 24, 0xFFFFFF);
        	drawString(this.fontRenderer, this.strY, this.centerX - 65, this.centerY + 1, 0xFFFFFF);
        	
        	super.drawScreen(mouseX, mouseY, partialTicks);
        }
        
        
	

	}
