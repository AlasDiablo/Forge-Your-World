package alasdiablo_rom279.forgeworld;

import alasdiablo_rom279.forgeworld.init.inititems;
import alasdiablo_rom279.forgeworld.proxy.common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = modinfo.MOD_ID, name = modinfo.NAME, version = modinfo.VERSION, acceptedMinecraftVersions = modinfo.ACCEPTED_VERSION)
public class fw {
	
	@Instance
	public static fw instance;
	
	@SidedProxy(clientSide = modinfo.CLIENT_PROXY_CLASSE, serverSide = modinfo.SERVER_PROXY_CLASSE)
	public static common proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Initialization of Forge Your World Done");
		
		inititems.init();
		inititems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Initialization of Forge Your World Done");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Initialization of Forge Your World Done");
	}

}
