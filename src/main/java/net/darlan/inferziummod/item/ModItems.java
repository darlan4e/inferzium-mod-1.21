package net.darlan.inferziummod.item;

import net.darlan.inferziummod.InferziumMod;
import net.darlan.inferziummod.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item KIKIMOND = registerItem("kikimond", new Item(new Item.Settings()));
    public static final Item RAW_KIKIMOND = registerItem("raw_kikimond", new Item(new Item.Settings()));

    public static final Item SANDWICH = registerItem("sandwich", new Item(new Item.Settings().food(ModFoodComponents.SANDWICH)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.inferziummod.sandwich.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item STARDUST = registerItem("stardust", new Item(new Item.Settings()));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(64)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(InferziumMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        InferziumMod.LOGGER.info("Registering Mod Items for " + InferziumMod.MOD_ID);
//добавление предметов в ванильные группы
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}
