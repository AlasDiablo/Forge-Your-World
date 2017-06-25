package alasdiablo_rom279.forgeworld.init;

import alasdiablo_rom279.forgeworld.modinfo;
import alasdiablo_rom279.forgeworld.items.food.ItemFlour;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class inititems {
	
	public static Item flour;
	
	public static void init() {
		flour = new ItemFlour();
	}
	
	public static void register() {
		GameRegistry.register(flour);
	}
	
	public static void registerRenders() {
		registerRender(flour);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
