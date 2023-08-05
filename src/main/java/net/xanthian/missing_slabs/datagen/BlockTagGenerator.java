package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.missing_slabs.block.*;

import java.util.concurrent.CompletableFuture;


public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> MINEABLE_PICKAXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> MINEABLE_HOE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/hoe"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> CRYSTAL_SOUND_BLOCKS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:crystal_sound_blocks"));
    private static final TagKey<Block> VIBRATION_RESONATORS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:vibration_resonators"));
    private static final TagKey<Block> DRAGON_IMMUNE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:dragon_immune"));
    private static final TagKey<Block> GUARDED_BY_PIGLINS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:guarded_by_piglins"));
    private static final TagKey<Block> INFINIBURN_OVERWORLD = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:infiniburn_overworld"));
    private static final TagKey<Block> NEEDS_DIAMOND_TOOL = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:needs_diamond_tool"));
    private static final TagKey<Block> NEEDS_IRON_TOOL = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:needs_iron_tool"));
    private static final TagKey<Block> SLABS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:slabs"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(SLABS)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.GLOWSTONE_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB)
                .add(MissingSlabs.SCULK_SLAB)
                .add(MissingSlabs.SEA_LANTERN_SLAB)
                .add(MissingSlabs.SHROOMLIGHT_SLAB)

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

        getOrCreateTagBuilder(MINEABLE_PICKAXE)
                .add(MissingSlabs.AMETHYST_BLOCK_SLAB)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB);

        getOrCreateTagBuilder(MINEABLE_HOE)
                .add(MissingSlabs.SHROOMLIGHT_SLAB)
                .add(MissingSlabs.SCULK_SLAB);

        getOrCreateTagBuilder(MINEABLE_AXE)
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
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB);

        getOrCreateTagBuilder(GUARDED_BY_PIGLINS)
                .add(MissingSlabs.GOLD_BLOCK_SLAB);

        getOrCreateTagBuilder(INFINIBURN_OVERWORLD)
                .add(MissingSlabs.MAGMA_BLOCK_SLAB);

        getOrCreateTagBuilder(NEEDS_DIAMOND_TOOL)
                .add(MissingSlabs.CRYING_OBSIDIAN_SLAB)
                .add(MissingSlabs.NETHERITE_BLOCK_SLAB);

        getOrCreateTagBuilder(NEEDS_IRON_TOOL)
                .add(MissingSlabs.DIAMOND_BLOCK_SLAB)
                .add(MissingSlabs.GOLD_BLOCK_SLAB);


    }
}