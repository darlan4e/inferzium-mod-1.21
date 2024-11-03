package net.darlan.inferziummod.item;

import net.darlan.inferziummod.InferziumMod;
import net.darlan.inferziummod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup KIKIMOND_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(InferziumMod.MOD_ID, "kikimond_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KIKIMOND))
                    .displayName(Text.translatable("itemgroup.inferziummod.kikimond_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KIKIMOND);
                        entries.add(ModItems.RAW_KIKIMOND);
                        //entries.add(ModItems.[Имя предмета]); чтобы добавить в список еще предметы
                    }).build());

    public static final ItemGroup KIKIMOND_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(InferziumMod.MOD_ID, "kikimond_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.KIKIMOND_BLOCK))
                    .displayName(Text.translatable("itemgroup.inferziummod.kikimond_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.KIKIMOND_BLOCK);
                        //entries.add(ModBlocks.[Имя предмета]); чтобы добавить в список еще блоки
                    }).build());

    public static void registerItemGroups(){
        InferziumMod.LOGGER.info("Restering Item Groups for " + InferziumMod.MOD_ID);
    }
}
