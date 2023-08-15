package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.xanthian.missing_slabs.Initialise;
import net.xanthian.missing_slabs.block.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Initialise.ITEM_GROUP, "The Missing Slabs");

        translationBuilder.add(MissingSlabs.AMETHYST_BLOCK_SLAB, "Amethyst Block Slab");
        translationBuilder.add(MissingSlabs.CRYING_OBSIDIAN_SLAB, "Crying Obsidian Slab");
        translationBuilder.add(MissingSlabs.GLOWSTONE_SLAB, "Glowstone Slab");
        translationBuilder.add(MissingSlabs.MAGMA_BLOCK_SLAB, "Magma Block Slab");
        translationBuilder.add(MissingSlabs.SCULK_SLAB, "Sculk Slab");
        translationBuilder.add(MissingSlabs.SEA_LANTERN_SLAB, "Sea Lantern Slab");
        translationBuilder.add(MissingSlabs.SHROOMLIGHT_SLAB, "Shroomlight Slab");

        translationBuilder.add(MissingSlabs.BASALT_SLAB, "Basalt Slab");
        translationBuilder.add(MissingSlabs.CALCITE_SLAB, "Calcite Slab");
        translationBuilder.add(MissingSlabs.END_STONE_SLAB, "End Stone Slab");
        translationBuilder.add(MissingSlabs.NETHERRACK_SLAB, "Netherrack Slab");
        translationBuilder.add(MissingSlabs.POLISHED_BASALT_SLAB, "Polished Basalt Slab");
        translationBuilder.add(MissingSlabs.SMOOTH_BASALT_SLAB, "Smooth Basalt Slab");
        translationBuilder.add(MissingSlabs.TUFF_SLAB, "Tuff Slab");

        translationBuilder.add(MissingSlabs.DIAMOND_BLOCK_SLAB, "Diamond Block Slab");
        translationBuilder.add(MissingSlabs.EMERALD_BLOCK_SLAB, "Emerald Block Slab");
        translationBuilder.add(MissingSlabs.GOLD_BLOCK_SLAB, "Gold Block Slab");
        translationBuilder.add(MissingSlabs.IRON_BLOCK_SLAB, "Iron Block Slab");
        translationBuilder.add(MissingSlabs.LAPIS_BLOCK_SLAB, "Lapis Lazuli Block Slab");
        translationBuilder.add(MissingSlabs.NETHERITE_BLOCK_SLAB, "Netherite Block Slab");


        translationBuilder.add(MissingSlabs.OCHRE_FROGLIGHT_SLAB, "Ochre Froglight Slab");
        translationBuilder.add(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, "Pearlescent Froglight Slab");
        translationBuilder.add(MissingSlabs.VERDANT_FROGLIGHT_SLAB, "Verdant Froglight Slab");

        translationBuilder.add(MissingSlabs.ACACIA_LOG_SLAB, "Acacia Log Slab");
        translationBuilder.add(MissingSlabs.BIRCH_LOG_SLAB, "Birch Log Slab");
        translationBuilder.add(MissingSlabs.CHERRY_LOG_SLAB, "Cherry Log Slab");
        translationBuilder.add(MissingSlabs.CRIMSON_STEM_SLAB, "Crimson Stem Slab");
        translationBuilder.add(MissingSlabs.DARK_OAK_LOG_SLAB, "Dark Oak Log Slab");
        translationBuilder.add(MissingSlabs.JUNGLE_LOG_SLAB, "Jungle Log Slab");
        translationBuilder.add(MissingSlabs.MANGROVE_LOG_SLAB, "Mangrove Log Slab");
        translationBuilder.add(MissingSlabs.OAK_LOG_SLAB, "Oak Log Slab");
        translationBuilder.add(MissingSlabs.SPRUCE_LOG_SLAB, "Spruce Log Slab");
        translationBuilder.add(MissingSlabs.WARPED_STEM_SLAB, "Warped Stem Slab");

    }
}