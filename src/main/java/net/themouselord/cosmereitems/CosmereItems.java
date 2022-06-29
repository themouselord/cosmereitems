package net.themouselord.cosmereitems;

import net.fabricmc.api.ModInitializer;
import net.themouselord.cosmereitems.block.ModBlocks;
import net.themouselord.cosmereitems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CosmereItems implements ModInitializer {
	public static final String MOD_ID = "cosmereitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
