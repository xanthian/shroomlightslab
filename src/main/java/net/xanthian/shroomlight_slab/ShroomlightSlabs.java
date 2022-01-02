package net.xanthian.shroomlight_slab;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ShroomlightSlabs implements ModInitializer {
    public static final Identifier namespace = new Identifier("shroomlight_slab", "shroomlight_slab");

    public static final Block SHROOMLIGHT_SLAB = Registry.register(Registry.BLOCK, namespace, new SlabBlock(FabricBlockSettings.of(Material.GRASS).strength(1.0f, 1.0f).luminance(15)));
    public static final Item SHROOMLIGHT_SLAB_ITEM = Registry.register(Registry.ITEM, namespace, new BlockItem(SHROOMLIGHT_SLAB, new Item.Settings().group(ItemGroup.DECORATIONS)));

    @Override
	public void onInitialize() {}
}
