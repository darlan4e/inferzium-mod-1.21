package net.darlan.inferziummod;

import net.darlan.inferziummod.block.ModBlocks;
import net.darlan.inferziummod.item.ModItemGroups;
import net.darlan.inferziummod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//very important comment
public class InferziumMod implements ModInitializer {
	public static final String MOD_ID = "inferziummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARDUST, 25000);
	}
}