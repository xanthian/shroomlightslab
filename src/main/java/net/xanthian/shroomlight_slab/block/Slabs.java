package net.xanthian.shroomlight_slab.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.xanthian.shroomlight_slab.ShroomlightSlabs;

//Slabs
public class Slabs {

    public static final Block SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.SHROOMLIGHT).nonOpaque()));

    public static final Block GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GLOWSTONE).nonOpaque()));

    public static final Block SEA_LANTERN_SLAB = registerBlock("sea_lantern_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.SEA_LANTERN).nonOpaque()));


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