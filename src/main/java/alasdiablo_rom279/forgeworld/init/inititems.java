package alasdiablo_rom279.forgeworld.init;

import alasdiablo_rom279.forgeworld.modinfo;
import alasdiablo_rom279.forgeworld.items.food.ItemFlour;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class inititems {
	
	public static Item flour;
	public static Item toast;
	
	public static void init() {
		flour = new ItemFlour();
		toast = new ItemToast();
	}
	
	public static void register() {
		GameRegistry.register(flour);
		GameRegistry.register(toast);
	}
	
	public static void registerRenders() {
		registerRender(flour);
		registerRender(toast);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
