package net.zexa.boundlesshorizons;

import net.fabricmc.api.ModInitializer;

import net.zexa.boundlesshorizons.block.ModBlocks;
import net.zexa.boundlesshorizons.item.ModItemGroups;
import net.zexa.boundlesshorizons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonBoundlessHorizons implements ModInitializer {
	public static final String MOD_ID = "boundlesshorizons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}