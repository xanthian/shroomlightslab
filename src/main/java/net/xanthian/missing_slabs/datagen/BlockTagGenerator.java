package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;

import net.xanthian.missing_slabs.block.*;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.*;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(SLABS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.GLOWSTONE_SLAB)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB)
                .add(MissingSlabs.SCULK_SLAB)
                .add(MissingSlabs.SEA_LANTERN_SLAB)
                .add(MissingSlabs.SHROOMLIGHT_SLAB)

                .add(MissingSlabs.BASALT_SLAB)
                .add(MissingSlabs.CALCITE_SLAB)
                .add(MissingSlabs.END_STONE_SLAB)
                .add(MissingSlabs.NETHERRACK_SLAB)
                .add(MissingSlabs.POLISHED_BASALT_SLAB)
                .add(MissingSlabs.SMOOTH_BASALT_SLAB)
                .add(MissingSlabs.TUFF_SLAB)

                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.EMERALD_BLOCK_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.IRON_BLOCK_SLAB)
                .add(MissingSlabs.LAPIS_BLOCK_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB)

                .add(MissingSlabs.OCHRE_FROGLIGHT_SLAB)
                .add(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB)
                .add(MissingSlabs.VERDANT_FROGLIGHT_SLAB)

                .add(MissingSlabs.ACACIA_LOG_SLAB)
                .add(MissingSlabs.BIRCH_LOG_SLAB)
                .add(MissingSlabs.CHERRY_LOG_SLAB)
                .add(MissingSlabs.CRIMSON_STEM_SLAB)
                .add(MissingSlabs.DARK_OAK_LOG_SLAB)
                .add(MissingSlabs.JUNGLE_LOG_SLAB)
                .add(MissingSlabs.MANGROVE_LOG_SLAB)
                .add(MissingSlabs.OAK_LOG_SLAB)
                .add(MissingSlabs.SPRUCE_LOG_SLAB)
                .add(MissingSlabs.WARPED_STEM_SLAB);

        getOrCreateTagBuilder(PICKAXE_MINEABLE)
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
                .add(MissingSlabs.POLISHED_BASALT_SLAB)
                .add(MissingSlabs.SMOOTH_BASALT_SLAB)
                .add(MissingSlabs.TUFF_SLAB);

        getOrCreateTagBuilder(HOE_MINEABLE)
                .add(MissingSlabs.SHROOMLIGHT_SLAB)
                .add(MissingSlabs.SCULK_SLAB);

        getOrCreateTagBuilder(AXE_MINEABLE)
                .add(MissingSlabs.ACACIA_LOG_SLAB)
                .add(MissingSlabs.BIRCH_LOG_SLAB)
                .add(MissingSlabs.CHERRY_LOG_SLAB)
                .add(MissingSlabs.CRIMSON_STEM_SLAB)
                .add(MissingSlabs.DARK_OAK_LOG_SLAB)
                .add(MissingSlabs.JUNGLE_LOG_SLAB)
                .add(MissingSlabs.MANGROVE_LOG_SLAB)
                .add(MissingSlabs.OAK_LOG_SLAB)
                .add(MissingSlabs.SPRUCE_LOG_SLAB)
                .add(MissingSlabs.WARPED_STEM_SLAB);

        getOrCreateTagBuilder(CRYSTAL_SOUND_BLOCKS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB);

        getOrCreateTagBuilder(VIBRATION_RESONATORS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB);

        getOrCreateTagBuilder(DRAGON_IMMUNE)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.END_STONE_SLAB);

        getOrCreateTagBuilder(GUARDED_BY_PIGLINS)
                .add(MissingSlabs.GOLD_BLOCK_SLAB);

        getOrCreateTagBuilder(INFINIBURN_OVERWORLD)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB);

        getOrCreateTagBuilder(NEEDS_DIAMOND_TOOL)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB);

        getOrCreateTagBuilder(NEEDS_IRON_TOOL)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.EMERALD_BLOCK_SLAB);

        getOrCreateTagBuilder(NEEDS_STONE_TOOL)
                .add(MissingSlabs.IRON_BLOCK_SLAB)
                .add(MissingSlabs.LAPIS_BLOCK_SLAB);
    }
}