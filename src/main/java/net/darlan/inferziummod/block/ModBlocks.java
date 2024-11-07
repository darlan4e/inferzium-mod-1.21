package net.darlan.inferziummod.block;

import net.darlan.inferziummod.InferziumMod;
import net.darlan.inferziummod.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
//добавление блоков
public class ModBlocks {
    public static final Block KIKIMOND_BLOCK = registerBlock("kikimond_block",
            new Block(AbstractBlock.Settings.create().strength(3f, 3f)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block KIKIMOND_ORE = registerBlock("kikimond_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(2f, 2f)
                            .requiresTool()));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(InferziumMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(InferziumMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        InferziumMod.LOGGER.info("Registering Mod Blocks for " + InferziumMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(KIKIMOND_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(KIKIMOND_ORE);
        });
    }
}
