package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import net.xanthian.missing_slabs.block.MissingSlabs;
import net.xanthian.missing_slabs.util.ModTextureMap;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateSlabs(MissingSlabs.AMETHYST_BLOCK_SLAB, Blocks.AMETHYST_BLOCK, ModTextureMap.threesideSlab(Blocks.AMETHYST_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CLAY_SLAB, Blocks.CLAY, ModTextureMap.threesideSlab(Blocks.CLAY), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN, ModTextureMap.threesideSlab(Blocks.CRYING_OBSIDIAN), blockStateModelGenerator);
        generateSlabs(MissingSlabs.DRIPSTONE_BLOCK_SLAB, Blocks.DRIPSTONE_BLOCK, ModTextureMap.threesideSlab(Blocks.DRIPSTONE_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.GLOWSTONE_SLAB, Blocks.GLOWSTONE, ModTextureMap.threesideSlab(Blocks.GLOWSTONE), blockStateModelGenerator);
        generateSlabs(MissingSlabs.MAGMA_BLOCK_SLAB, Blocks.MAGMA_BLOCK, TextureMap.all(ModelIds.getMinecraftNamespacedBlock("magma")), blockStateModelGenerator);
        generateSlabs(MissingSlabs.MUD_SLAB, Blocks.MUD, ModTextureMap.threesideSlab(Blocks.MUD), blockStateModelGenerator);
        generateSlabs(MissingSlabs.OBSIDIAN_SLAB, Blocks.OBSIDIAN, ModTextureMap.threesideSlab(Blocks.OBSIDIAN), blockStateModelGenerator);
        generateSlabs(MissingSlabs.PACKED_MUD_SLAB, Blocks.PACKED_MUD, ModTextureMap.threesideSlab(Blocks.PACKED_MUD), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SCULK_SLAB, Blocks.SCULK, ModTextureMap.threesideSlab(Blocks.SCULK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN, ModTextureMap.threesideSlab(Blocks.SEA_LANTERN), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SHROOMLIGHT_SLAB, Blocks.SHROOMLIGHT, ModTextureMap.threesideSlab(Blocks.SHROOMLIGHT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SOUL_SAND_SLAB, Blocks.SOUL_SAND, ModTextureMap.threesideSlab(Blocks.SOUL_SAND), blockStateModelGenerator);

        generateSlabs(MissingSlabs.BASALT_SLAB, Blocks.BASALT, ModTextureMap.sidetopSlab(Blocks.BASALT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CALCITE_SLAB, Blocks.CALCITE, ModTextureMap.threesideSlab(Blocks.CALCITE), blockStateModelGenerator);
        generateSlabs(MissingSlabs.END_STONE_SLAB, Blocks.END_STONE, ModTextureMap.threesideSlab(Blocks.END_STONE), blockStateModelGenerator);
        generateSlabs(MissingSlabs.NETHERRACK_SLAB, Blocks.NETHERRACK, ModTextureMap.threesideSlab(Blocks.NETHERRACK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, ModTextureMap.sidetopSlab(Blocks.POLISHED_BASALT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, ModTextureMap.threesideSlab(Blocks.SMOOTH_BASALT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.TUFF_SLAB, Blocks.TUFF, ModTextureMap.threesideSlab(Blocks.TUFF), blockStateModelGenerator);

        generateSlabs(MissingSlabs.DIAMOND_BLOCK_SLAB, Blocks.DIAMOND_BLOCK, ModTextureMap.threesideSlab(Blocks.DIAMOND_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.EMERALD_BLOCK_SLAB, Blocks.EMERALD_BLOCK, ModTextureMap.threesideSlab(Blocks.EMERALD_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.GOLD_BLOCK_SLAB, Blocks.GOLD_BLOCK, ModTextureMap.threesideSlab(Blocks.GOLD_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.IRON_BLOCK_SLAB, Blocks.IRON_BLOCK, ModTextureMap.threesideSlab(Blocks.IRON_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.LAPIS_BLOCK_SLAB, Blocks.LAPIS_BLOCK, ModTextureMap.threesideSlab(Blocks.LAPIS_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.NETHERITE_BLOCK_SLAB, Blocks.NETHERITE_BLOCK, ModTextureMap.threesideSlab(Blocks.NETHERITE_BLOCK), blockStateModelGenerator);

        generateSlabs(MissingSlabs.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT, ModTextureMap.sidetopSlab(Blocks.OCHRE_FROGLIGHT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT, ModTextureMap.sidetopSlab(Blocks.PEARLESCENT_FROGLIGHT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT, ModTextureMap.sidetopSlab(Blocks.VERDANT_FROGLIGHT), blockStateModelGenerator);

        generateSlabs(MissingSlabs.ACACIA_LOG_SLAB, Blocks.ACACIA_LOG, ModTextureMap.logSlabs(Blocks.ACACIA_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.BIRCH_LOG_SLAB, Blocks.BIRCH_LOG, ModTextureMap.logSlabs(Blocks.BIRCH_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CHERRY_LOG_SLAB, Blocks.CHERRY_LOG, ModTextureMap.logSlabs(Blocks.CHERRY_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CRIMSON_STEM_SLAB, Blocks.CRIMSON_STEM, ModTextureMap.logSlabs(Blocks.CRIMSON_STEM), blockStateModelGenerator);
        generateSlabs(MissingSlabs.DARK_OAK_LOG_SLAB, Blocks.DARK_OAK_LOG, ModTextureMap.logSlabs(Blocks.DARK_OAK_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.JUNGLE_LOG_SLAB, Blocks.JUNGLE_LOG, ModTextureMap.logSlabs(Blocks.JUNGLE_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.MANGROVE_LOG_SLAB, Blocks.MANGROVE_LOG, ModTextureMap.logSlabs(Blocks.MANGROVE_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.OAK_LOG_SLAB, Blocks.OAK_LOG, ModTextureMap.logSlabs(Blocks.OAK_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SPRUCE_LOG_SLAB, Blocks.SPRUCE_LOG, ModTextureMap.logSlabs(Blocks.SPRUCE_LOG), blockStateModelGenerator);
        generateSlabs(MissingSlabs.WARPED_STEM_SLAB, Blocks.WARPED_STEM, ModTextureMap.logSlabs(Blocks.WARPED_STEM), blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    void generateSlabs(Block slab, Block fullBlock, TextureMap texture, BlockStateModelGenerator blockStateModelGenerator) {
        var slabUpper = Models.SLAB_TOP.upload(slab, texture, blockStateModelGenerator.modelCollector);
        var slabLower = Models.SLAB.upload(slab, texture, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slab, slabLower, slabUpper, ModelIds.getBlockModelId(fullBlock)));
        blockStateModelGenerator.registerParentedItemModel(slab, slabLower);
    }
}