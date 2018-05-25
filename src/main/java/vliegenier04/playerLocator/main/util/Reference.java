package vliegenier04.playerLocator.main.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.nbt.NBTTagCompound;

public class Reference {

		public static final String MODID = "pl";
		public static final String NAME = "PlayerLocator";
		public static final String VERSION = "1.0";
		public static final String ACCEPTED_VERSIONS = "[1.12.2]";
		public static final String CLIENT_PROXY_CLASS = "vliegenier04.playerLocator.main.proxy.ClientProxy";
		public static final String COMMON_PROXY_CLASS = "vliegenier04.playerLocator.main.proxy.CommonProxy";
		public static final String GUI_FACTORY = "com.github.lunatrius.schematica.client.gui.config.GuiFactory";
		public static final String FORGE = "${forgeversion}";

	    public static Logger logger = LogManager.getLogger(Reference.MODID);
		
}
