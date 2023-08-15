package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.xanthian.missing_slabs.block.MissingSlabs;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(MissingSlabs.AMETHYST_BLOCK_SLAB, slabDrops(MissingSlabs.AMETHYST_BLOCK_SLAB));
        addDrop(MissingSlabs.CRYING_OBSIDIAN_SLAB, slabDrops(MissingSlabs.CRYING_OBSIDIAN_SLAB));
        addDrop(MissingSlabs.GLOWSTONE_SLAB, slabDrops(MissingSlabs.GLOWSTONE_SLAB));
        addDrop(MissingSlabs.MAGMA_BLOCK_SLAB, slabDrops(MissingSlabs.MAGMA_BLOCK_SLAB));
        addDrop(MissingSlabs.SCULK_SLAB, slabDrops(MissingSlabs.SCULK_SLAB));
        addDrop(MissingSlabs.SEA_LANTERN_SLAB, slabDrops(MissingSlabs.SEA_LANTERN_SLAB));
        addDrop(MissingSlabs.SHROOMLIGHT_SLAB, slabDrops(MissingSlabs.SHROOMLIGHT_SLAB));

        addDrop(MissingSlabs.BASALT_SLAB, slabDrops(MissingSlabs.BASALT_SLAB));
        addDrop(MissingSlabs.CALCITE_SLAB, slabDrops(MissingSlabs.CALCITE_SLAB));
        addDrop(MissingSlabs.END_STONE_SLAB, slabDrops(MissingSlabs.END_STONE_SLAB));
        addDrop(MissingSlabs.NETHERRACK_SLAB, slabDrops(MissingSlabs.NETHERRACK_SLAB));
        addDrop(MissingSlabs.POLISHED_BASALT_SLAB, slabDrops(MissingSlabs.POLISHED_BASALT_SLAB));
        addDrop(MissingSlabs.SMOOTH_BASALT_SLAB, slabDrops(MissingSlabs.SMOOTH_BASALT_SLAB));
        addDrop(MissingSlabs.TUFF_SLAB, slabDrops(MissingSlabs.TUFF_SLAB));

        addDrop(MissingSlabs.DIAMOND_BLOCK_SLAB, slabDrops(MissingSlabs.DIAMOND_BLOCK_SLAB));
        addDrop(MissingSlabs.EMERALD_BLOCK_SLAB, slabDrops(MissingSlabs.EMERALD_BLOCK_SLAB));
        addDrop(MissingSlabs.GOLD_BLOCK_SLAB, slabDrops(MissingSlabs.GOLD_BLOCK_SLAB));
        addDrop(MissingSlabs.IRON_BLOCK_SLAB, slabDrops(MissingSlabs.IRON_BLOCK_SLAB));
        addDrop(MissingSlabs.LAPIS_BLOCK_SLAB, slabDrops(MissingSlabs.LAPIS_BLOCK_SLAB));
        addDrop(MissingSlabs.NETHERITE_BLOCK_SLAB, slabDrops(MissingSlabs.NETHERITE_BLOCK_SLAB));

        addDrop(MissingSlabs.OCHRE_FROGLIGHT_SLAB, slabDrops(MissingSlabs.OCHRE_FROGLIGHT_SLAB));
        addDrop(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, slabDrops(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB));
        addDrop(MissingSlabs.VERDANT_FROGLIGHT_SLAB, slabDrops(MissingSlabs.VERDANT_FROGLIGHT_SLAB));

        addDrop(MissingSlabs.ACACIA_LOG_SLAB, slabDrops(MissingSlabs.ACACIA_LOG_SLAB));
        addDrop(MissingSlabs.BIRCH_LOG_SLAB, slabDrops(MissingSlabs.BIRCH_LOG_SLAB));
        addDrop(MissingSlabs.CHERRY_LOG_SLAB, slabDrops(MissingSlabs.CHERRY_LOG_SLAB));
        addDrop(MissingSlabs.CRIMSON_STEM_SLAB, slabDrops(MissingSlabs.CRIMSON_STEM_SLAB));
        addDrop(MissingSlabs.DARK_OAK_LOG_SLAB, slabDrops(MissingSlabs.DARK_OAK_LOG_SLAB));
        addDrop(MissingSlabs.JUNGLE_LOG_SLAB, slabDrops(MissingSlabs.JUNGLE_LOG_SLAB));
        addDrop(MissingSlabs.MANGROVE_LOG_SLAB, slabDrops(MissingSlabs.MANGROVE_LOG_SLAB));
        addDrop(MissingSlabs.OAK_LOG_SLAB, slabDrops(MissingSlabs.OAK_LOG_SLAB));
        addDrop(MissingSlabs.SPRUCE_LOG_SLAB, slabDrops(MissingSlabs.SPRUCE_LOG_SLAB));
        addDrop(MissingSlabs.WARPED_STEM_SLAB, slabDrops(MissingSlabs.WARPED_STEM_SLAB));
    }
}