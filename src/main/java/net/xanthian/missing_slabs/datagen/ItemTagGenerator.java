package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;

import net.xanthian.missing_slabs.block.*;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.ItemTags.*;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(SLABS)
                    .add(MissingSlabs.AMETHYST_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.CRYING_OBSIDIAN_SLAB.asItem())
                    .add(MissingSlabs.GLOWSTONE_SLAB.asItem())
                    .add(MissingSlabs.MAGMA_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.SCULK_SLAB.asItem())
                    .add(MissingSlabs.SEA_LANTERN_SLAB.asItem())
                    .add(MissingSlabs.SHROOMLIGHT_SLAB.asItem())

                    .add(MissingSlabs.BASALT_SLAB.asItem())
                    .add(MissingSlabs.CALCITE_SLAB.asItem())
                    .add(MissingSlabs.END_STONE_SLAB.asItem())
                    .add(MissingSlabs.NETHERRACK_SLAB.asItem())
                    .add(MissingSlabs.POLISHED_BASALT_SLAB.asItem())
                    .add(MissingSlabs.SMOOTH_BASALT_SLAB.asItem())
                    .add(MissingSlabs.TUFF_SLAB.asItem())

                    .add(MissingSlabs.DIAMOND_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.EMERALD_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.GOLD_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.IRON_BLOCK_SLAB.asItem())
                    .add(MissingSlabs.LAPIS_BLOCK_SLAB.asItem())

                    .add(MissingSlabs.NETHERITE_BLOCK_SLAB.asItem())


                    .add(MissingSlabs.OCHRE_FROGLIGHT_SLAB.asItem())
                    .add(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB.asItem())
                    .add(MissingSlabs.VERDANT_FROGLIGHT_SLAB.asItem())

                    .add(MissingSlabs.ACACIA_LOG_SLAB.asItem())
                    .add(MissingSlabs.BIRCH_LOG_SLAB.asItem())
                    .add(MissingSlabs.CHERRY_LOG_SLAB.asItem())
                    .add(MissingSlabs.CRIMSON_STEM_SLAB.asItem())
                    .add(MissingSlabs.DARK_OAK_LOG_SLAB.asItem())
                    .add(MissingSlabs.JUNGLE_LOG_SLAB.asItem())
                    .add(MissingSlabs.MANGROVE_LOG_SLAB.asItem())
                    .add(MissingSlabs.OAK_LOG_SLAB.asItem())
                    .add(MissingSlabs.SPRUCE_LOG_SLAB.asItem())
                    .add(MissingSlabs.WARPED_STEM_SLAB.asItem());

            getOrCreateTagBuilder(PIGLIN_LOVED)
                    .add(MissingSlabs.GOLD_BLOCK_SLAB.asItem());

        }
    }