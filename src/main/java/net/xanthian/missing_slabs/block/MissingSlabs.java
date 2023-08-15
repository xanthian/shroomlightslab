package net.xanthian.missing_slabs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.missing_slabs.Initialise;

public class MissingSlabs {

    // Decoration
    public static final SlabBlock AMETHYST_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK).nonOpaque());
    public static final SlabBlock CRYING_OBSIDIAN_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.CRYING_OBSIDIAN).nonOpaque());
    public static final SlabBlock GLOWSTONE_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.GLOWSTONE).nonOpaque());
    public static final SlabBlock MAGMA_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.MAGMA_BLOCK).nonOpaque());
    public static final SlabBlock SCULK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.SCULK).nonOpaque());
    public static final SlabBlock SEA_LANTERN_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.SEA_LANTERN).nonOpaque());
    public static final SlabBlock SHROOMLIGHT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.SHROOMLIGHT).nonOpaque());

    // Stones
    public static final SlabBlock BASALT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.BASALT).nonOpaque());
    public static final SlabBlock CALCITE_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE).nonOpaque());
    public static final SlabBlock END_STONE_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.END_STONE).nonOpaque());
    public static final SlabBlock NETHERRACK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).nonOpaque());
    public static final SlabBlock POLISHED_BASALT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_BASALT).nonOpaque());
    public static final SlabBlock SMOOTH_BASALT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.SMOOTH_BASALT).nonOpaque());
    public static final SlabBlock TUFF_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.TUFF).nonOpaque());

    // Precious Metals
    public static final SlabBlock DIAMOND_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).nonOpaque());
    public static final SlabBlock EMERALD_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK).nonOpaque());
    public static final SlabBlock GOLD_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.GOLD_BLOCK).nonOpaque());
    public static final SlabBlock IRON_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK).nonOpaque());
    public static final SlabBlock NETHERITE_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.NETHERITE_BLOCK).nonOpaque());
    public static final SlabBlock LAPIS_BLOCK_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.LAPIS_BLOCK).nonOpaque());

    // Froglights
    public static final SlabBlock OCHRE_FROGLIGHT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.OCHRE_FROGLIGHT).nonOpaque());
    public static final SlabBlock PEARLESCENT_FROGLIGHT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.PEARLESCENT_FROGLIGHT).nonOpaque());
    public static final SlabBlock VERDANT_FROGLIGHT_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.VERDANT_FROGLIGHT).nonOpaque());

    // Logs
    public static final SlabBlock ACACIA_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS).nonOpaque());
    public static final SlabBlock BIRCH_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS).nonOpaque());
    public static final SlabBlock CHERRY_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.CHERRY_PLANKS).nonOpaque());
    public static final SlabBlock CRIMSON_STEM_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.CRIMSON_STEM).nonOpaque());
    public static final SlabBlock DARK_OAK_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque());
    public static final SlabBlock JUNGLE_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS).nonOpaque());
    public static final SlabBlock MANGROVE_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS).nonOpaque());
    public static final SlabBlock OAK_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS).nonOpaque());
    public static final SlabBlock SPRUCE_LOG_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.SPRUCE_PLANKS).nonOpaque());
    public static final SlabBlock WARPED_STEM_SLAB =
            new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_STEM).nonOpaque());

    public static void registerMissingSlabs(){
        registerSlabs("amethyst_block_slab", AMETHYST_BLOCK_SLAB);
        registerSlabs("crying_obsidian_slab", CRYING_OBSIDIAN_SLAB);
        registerSlabs("glowstone_slab", GLOWSTONE_SLAB);
        registerSlabs("magma_block_slab", MAGMA_BLOCK_SLAB);
        registerSlabs("sculk_slab", SCULK_SLAB);
        registerSlabs("sea_lantern_slab", SEA_LANTERN_SLAB);
        registerSlabs("shroomlight_slab", SHROOMLIGHT_SLAB);

        registerSlabs("basalt_slab", BASALT_SLAB);
        registerSlabs("calcite_slab", CALCITE_SLAB);
        registerSlabs("end_stone_slab", END_STONE_SLAB);
        registerSlabs("netherrack_slab", NETHERRACK_SLAB);
        registerSlabs("polished_basalt_slab", POLISHED_BASALT_SLAB);
        registerSlabs("smooth_basalt_slab", SMOOTH_BASALT_SLAB);
        registerSlabs("tuff_slab", TUFF_SLAB);

        registerSlabs("diamond_block_slab", DIAMOND_BLOCK_SLAB);
        registerSlabs("emerald_block_slab", EMERALD_BLOCK_SLAB);
        registerSlabs("gold_block_slab", GOLD_BLOCK_SLAB);
        registerSlabs("iron_block_slab", IRON_BLOCK_SLAB);
        registerSlabs("lapis_block_slab", LAPIS_BLOCK_SLAB);
        registerSlabs("netherite_block_slab", NETHERITE_BLOCK_SLAB);

        registerSlabs("ochre_froglight_slab", OCHRE_FROGLIGHT_SLAB);
        registerSlabs("pearlescent_froglight_slab", PEARLESCENT_FROGLIGHT_SLAB);
        registerSlabs("verdant_froglight_slab", VERDANT_FROGLIGHT_SLAB);

        registerSlabs("acacia_log_slab", ACACIA_LOG_SLAB);
        registerSlabs("birch_log_slab", BIRCH_LOG_SLAB);
        registerSlabs("cherry_log_slab", CHERRY_LOG_SLAB);
        registerSlabs("crimson_stem_slab", CRIMSON_STEM_SLAB);
        registerSlabs("dark_oak_log_slab", DARK_OAK_LOG_SLAB);
        registerSlabs("jungle_log_slab", JUNGLE_LOG_SLAB);
        registerSlabs("mangrove_log_slab", MANGROVE_LOG_SLAB);
        registerSlabs("oak_log_slab", OAK_LOG_SLAB);
        registerSlabs("spruce_log_slab", SPRUCE_LOG_SLAB);
        registerSlabs("warped_stem_slab", WARPED_STEM_SLAB);

    }
    private static void registerSlabs(String Id, SlabBlock block){
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}