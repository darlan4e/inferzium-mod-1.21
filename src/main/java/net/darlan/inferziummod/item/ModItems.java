package net.darlan.inferziummod.item;

import net.darlan.inferziummod.InferziumMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KIKIMOND = registerItem("kikimond", new Item(new Item.Settings()));
    public static final Item RAW_KIKIMOND = registerItem("raw_kikimond", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(InferziumMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        InferziumMod.LOGGER.info("Registering Mod Items for " + InferziumMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(KIKIMOND);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_KIKIMOND);
        });
    }
}
