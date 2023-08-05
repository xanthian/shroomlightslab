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
        generateSlabs(MissingSlabs.AMETHYST_BLOCK_SLAB, Blocks.AMETHYST_BLOCK, ModTextureMap.slabsides(Blocks.AMETHYST_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN, ModTextureMap.slabsides(Blocks.CRYING_OBSIDIAN), blockStateModelGenerator);
        generateSlabs(MissingSlabs.DIAMOND_BLOCK_SLAB, Blocks.DIAMOND_BLOCK, ModTextureMap.slabsides(Blocks.DIAMOND_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.GLOWSTONE_SLAB, Blocks.GLOWSTONE, ModTextureMap.slabsides(Blocks.GLOWSTONE), blockStateModelGenerator);
        generateSlabs(MissingSlabs.GOLD_BLOCK_SLAB, Blocks.GOLD_BLOCK, ModTextureMap.slabsides(Blocks.GOLD_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.NETHERITE_BLOCK_SLAB, Blocks.NETHERITE_BLOCK, ModTextureMap.slabsides(Blocks.NETHERITE_BLOCK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SCULK_SLAB, Blocks.SCULK, ModTextureMap.slabsides(Blocks.SCULK), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN, ModTextureMap.slabsides(Blocks.SEA_LANTERN), blockStateModelGenerator);
        generateSlabs(MissingSlabs.SHROOMLIGHT_SLAB, Blocks.SHROOMLIGHT, ModTextureMap.slabsides(Blocks.SHROOMLIGHT), blockStateModelGenerator);

        generateSlabs(MissingSlabs.MAGMA_BLOCK_SLAB, Blocks.MAGMA_BLOCK, TextureMap.all(ModelIds.getMinecraftNamespacedBlock("magma")), blockStateModelGenerator);

        // Froglights
        generateSlabs(MissingSlabs.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT, ModTextureMap.froglightslabsides(Blocks.OCHRE_FROGLIGHT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT, ModTextureMap.froglightslabsides(Blocks.PEARLESCENT_FROGLIGHT), blockStateModelGenerator);
        generateSlabs(MissingSlabs.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT, ModTextureMap.froglightslabsides(Blocks.VERDANT_FROGLIGHT), blockStateModelGenerator);

        // Logs
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