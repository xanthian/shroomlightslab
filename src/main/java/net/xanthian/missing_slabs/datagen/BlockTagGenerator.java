package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import net.minecraft.registry.tag.BlockTags;
import net.xanthian.missing_slabs.block.*;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){


        for (Block slab : MissingSlabs.MOD_SLABS.values()) {
            getOrCreateTagBuilder(BlockTags.SLABS)
                    .add(slab);
        }

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB)
                .add(MissingSlabs.BASALT_SLAB)
                .add(MissingSlabs.CALCITE_SLAB)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.EMERALD_BLOCK_SLAB)
                .add(MissingSlabs.END_STONE_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.IRON_BLOCK_SLAB)
                .add(MissingSlabs.LAPIS_BLOCK_SLAB)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB)
                .add(MissingSlabs.NETHERRACK_SLAB)
                .add(MissingSlabs.OBSIDIAN_SLAB)
                .add(MissingSlabs.PACKED_MUD_SLAB)
                .add(MissingSlabs.POLISHED_BASALT_SLAB)
                .add(MissingSlabs.SMOOTH_BASALT_SLAB)
                .add(MissingSlabs.TUFF_SLAB);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(MissingSlabs.SHROOMLIGHT_SLAB)
                .add(MissingSlabs.SCULK_SLAB);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(MissingSlabs.ACACIA_LOG_SLAB)
                .add(MissingSlabs.BIRCH_LOG_SLAB)
                .add(MissingSlabs.CHERRY_LOG_SLAB)
                .add(MissingSlabs.CRIMSON_STEM_SLAB)
                .add(MissingSlabs.DRIPSTONE_BLOCK_SLAB)
                .add(MissingSlabs.DARK_OAK_LOG_SLAB)
                .add(MissingSlabs.JUNGLE_LOG_SLAB)
                .add(MissingSlabs.MANGROVE_LOG_SLAB)
                .add(MissingSlabs.OAK_LOG_SLAB)
                .add(MissingSlabs.SPRUCE_LOG_SLAB)
                .add(MissingSlabs.WARPED_STEM_SLAB);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(MissingSlabs.CLAY_SLAB)
                .add(MissingSlabs.MUD_SLAB)
                .add(MissingSlabs.SOUL_SAND_SLAB);

        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB);

        getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB);

        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.END_STONE_SLAB)
                .add(MissingSlabs.OBSIDIAN_SLAB);

        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .add(MissingSlabs.GOLD_BLOCK_SLAB);

        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB);

        getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
                .add(MissingSlabs.SOUL_SAND_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB)
                .add(MissingSlabs.OBSIDIAN_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.EMERALD_BLOCK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(MissingSlabs.IRON_BLOCK_SLAB)
                .add(MissingSlabs.LAPIS_BLOCK_SLAB);
    }
}