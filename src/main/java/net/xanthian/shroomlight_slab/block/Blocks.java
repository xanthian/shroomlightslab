package net.xanthian.shroomlight_slab.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.xanthian.shroomlight_slab.ShroomlightSlabs;

//Blocks
public class Blocks {

    public static final Block SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.SHROOMLIGHT).nonOpaque()));
    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.GLOWSTONE).nonOpaque()));
    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.SEA_LANTERN).nonOpaque()));
    public static final Block OCHRE_FROGLIGHT_SLAB = registerBlock("ochre_froglight_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.OCHRE_FROGLIGHT).nonOpaque()));
    public static final Block PEARLESCENT_FROGLIGHT_SLAB = registerBlock("pearlescent_froglight_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PEARLESCENT_FROGLIGHT).nonOpaque()));
    public static final Block VERDANT_FROGLIGHT_SLAB = registerBlock("verdant_froglight_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.VERDANT_FROGLIGHT).nonOpaque()));
    public static final Block MAGMA_BLOCK_SLAB = registerBlock("magma_block_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.MAGMA_BLOCK).nonOpaque()));
    public static final Block CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.CRYING_OBSIDIAN).nonOpaque()));

//Register Blocks
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ShroomlightSlabs.MOD_ID, name), block);
    }
//Register Items
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(ShroomlightSlabs.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
//Console Print
    public static void registerModBlocks(){
        System.out.println("Registering Blocks for "+ ShroomlightSlabs.MOD_ID);
    }
}