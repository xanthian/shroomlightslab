package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import net.xanthian.missing_slabs.block.MissingSlabs;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Decorations
        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.AMETHYST_BLOCK_SLAB, Blocks.AMETHYST_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, MissingSlabs.AMETHYST_BLOCK_SLAB,Blocks.AMETHYST_BLOCK,2);
        offerUncraftingRecipe(exporter,Blocks.AMETHYST_BLOCK, MissingSlabs.AMETHYST_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN,2);
        offerUncraftingRecipe(exporter,Blocks.CRYING_OBSIDIAN, MissingSlabs.CRYING_OBSIDIAN_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.GLOWSTONE_SLAB, Blocks.GLOWSTONE);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.GLOWSTONE_SLAB, Blocks.GLOWSTONE,2);
        offerUncraftingRecipe(exporter,Blocks.GLOWSTONE, MissingSlabs.GLOWSTONE_SLAB);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, MissingSlabs.GLOWSTONE_SLAB, 1)
                .input('#', Items.GLOWSTONE_DUST).pattern("##")
                .criterion("has_glowstone_dust", VanillaRecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST)).offerTo(exporter,RecipeProvider.convertBetween(MissingSlabs.GLOWSTONE_SLAB,Items.GLOWSTONE_DUST));

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.MAGMA_BLOCK_SLAB, Blocks.MAGMA_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.MAGMA_BLOCK_SLAB, Blocks.MAGMA_BLOCK, 2);
        offerUncraftingRecipe(exporter,Blocks.MAGMA_BLOCK, MissingSlabs.MAGMA_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SCULK_SLAB, Blocks.SCULK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SCULK_SLAB, Blocks.SCULK, 2);
        offerUncraftingRecipe(exporter,Blocks.SCULK, MissingSlabs.SCULK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN, 2);
        offerUncraftingRecipe(exporter,Blocks.SEA_LANTERN, MissingSlabs.SEA_LANTERN_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SHROOMLIGHT_SLAB, Blocks.SHROOMLIGHT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SHROOMLIGHT_SLAB, Blocks.SHROOMLIGHT, 2);
        offerUncraftingRecipe(exporter,Blocks.SHROOMLIGHT, MissingSlabs.SHROOMLIGHT_SLAB);

        // Stones
        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.BASALT_SLAB, Blocks.BASALT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.BASALT_SLAB, Blocks.BASALT,2);
        offerUncraftingRecipe(exporter,Blocks.BASALT, MissingSlabs.BASALT_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CALCITE_SLAB, Blocks.CALCITE);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CALCITE_SLAB, Blocks.CALCITE,2);
        offerUncraftingRecipe(exporter,Blocks.CALCITE, MissingSlabs.CALCITE_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.END_STONE_SLAB, Blocks.END_STONE);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.END_STONE_SLAB, Blocks.END_STONE,2);
        offerUncraftingRecipe(exporter,Blocks.END_STONE, MissingSlabs.END_STONE_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.NETHERRACK_SLAB, Blocks.NETHERRACK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.NETHERRACK_SLAB, Blocks.NETHERRACK,2);
        offerUncraftingRecipe(exporter,Blocks.NETHERRACK, MissingSlabs.NETHERRACK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT,2);
        offerUncraftingRecipe(exporter,Blocks.POLISHED_BASALT, MissingSlabs.POLISHED_BASALT_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT,2);
        offerUncraftingRecipe(exporter,Blocks.SMOOTH_BASALT, MissingSlabs.SMOOTH_BASALT_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.TUFF_SLAB, Blocks.TUFF);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.TUFF_SLAB, Blocks.TUFF,2);
        offerUncraftingRecipe(exporter,Blocks.TUFF, MissingSlabs.TUFF_SLAB);

        // Precious Metals
        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.DIAMOND_BLOCK_SLAB, Blocks.DIAMOND_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.DIAMOND_BLOCK_SLAB, Blocks.DIAMOND_BLOCK,2);
        offerUncraftingRecipe(exporter,Blocks.DIAMOND_BLOCK, MissingSlabs.DIAMOND_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.EMERALD_BLOCK_SLAB, Blocks.EMERALD_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.EMERALD_BLOCK_SLAB, Blocks.EMERALD_BLOCK,2);
        offerUncraftingRecipe(exporter,Blocks.EMERALD_BLOCK, MissingSlabs.EMERALD_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.GOLD_BLOCK_SLAB, Blocks.GOLD_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.GOLD_BLOCK_SLAB, Blocks.GOLD_BLOCK, 2);
        offerUncraftingRecipe(exporter,Blocks.GOLD_BLOCK, MissingSlabs.GOLD_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.IRON_BLOCK_SLAB, Blocks.IRON_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.IRON_BLOCK_SLAB, Blocks.IRON_BLOCK,2);
        offerUncraftingRecipe(exporter,Blocks.IRON_BLOCK, MissingSlabs.IRON_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.LAPIS_BLOCK_SLAB, Blocks.LAPIS_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.LAPIS_BLOCK_SLAB, Blocks.LAPIS_BLOCK,2);
        offerUncraftingRecipe(exporter,Blocks.LAPIS_BLOCK, MissingSlabs.LAPIS_BLOCK_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.NETHERITE_BLOCK_SLAB, Blocks.NETHERITE_BLOCK);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.NETHERITE_BLOCK_SLAB, Blocks.NETHERITE_BLOCK, 2);
        offerUncraftingRecipe(exporter,Blocks.NETHERITE_BLOCK, MissingSlabs.NETHERITE_BLOCK_SLAB);


        // Froglights
        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT, 2);
        offerUncraftingRecipe(exporter,Blocks.OCHRE_FROGLIGHT, MissingSlabs.OCHRE_FROGLIGHT_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT, 2);
        offerUncraftingRecipe(exporter,Blocks.PEARLESCENT_FROGLIGHT, MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT, 2);
        offerUncraftingRecipe(exporter,Blocks.VERDANT_FROGLIGHT, MissingSlabs.VERDANT_FROGLIGHT_SLAB);

        // Logs
        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.ACACIA_LOG, MissingSlabs.ACACIA_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.BIRCH_LOG, MissingSlabs.BIRCH_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.CHERRY_LOG, MissingSlabs.CHERRY_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, 2);
        offerUncraftingRecipe(exporter,Blocks.CRIMSON_STEM, MissingSlabs.CRIMSON_STEM_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.DARK_OAK_LOG, MissingSlabs.DARK_OAK_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.JUNGLE_LOG, MissingSlabs.JUNGLE_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.MANGROVE_LOG, MissingSlabs.MANGROVE_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.OAK_LOG_SLAB, Blocks.OAK_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.OAK_LOG_SLAB, Blocks.OAK_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.OAK_LOG, MissingSlabs.OAK_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, 2);
        offerUncraftingRecipe(exporter,Blocks.SPRUCE_LOG, MissingSlabs.SPRUCE_LOG_SLAB);

        FabricRecipeProvider.offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.WARPED_STEM_SLAB, Blocks.WARPED_STEM);
        FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, MissingSlabs.WARPED_STEM_SLAB, Blocks.WARPED_STEM, 2);
        offerUncraftingRecipe(exporter,Blocks.WARPED_STEM, MissingSlabs.WARPED_STEM_SLAB);

    }
    public static void offerUncraftingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .input('#', input)
                .pattern("#").pattern("#")
                .criterion("has_item", VanillaRecipeProvider.conditionsFromItem(input)).offerTo(exporter);
    }
}