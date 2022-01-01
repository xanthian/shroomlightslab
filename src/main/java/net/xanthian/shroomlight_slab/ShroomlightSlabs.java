package net.xanthian.shroomlight_slab;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.piston.PistonBehavior.BLOCK;


public class ShroomlightSlabs implements ModInitializer {
    public static final Identifier namespace = new Identifier("shroomlight_slab", "shroomlight_slab");

    public static final Block SHROOMLIGHT_SLAB = Registry.register(Registry.BLOCK, namespace, new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(1.0F, 1.0F)));
    public static final Item SHROOMLIGHT_SLAB_ITEM = Registry.register(Registry.ITEM, namespace, new BlockItem(SHROOMLIGHT_SLAB, new Item.Settings().group(ItemGroup.REDSTONE)));

    @Override
	public void onInitialize() {}
}
