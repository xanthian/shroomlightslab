package net.xanthian.missing_slabs.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.missing_slabs.Initialise;
import net.xanthian.missing_slabs.block.blocktypes.*;
import net.xanthian.missing_slabs.item.ModItems;

import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class MissingSlabs {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    // Functional Blocks
    public static final RegistryObject<Block> SEA_LANTERN_SLAB = register("sea_lantern_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), 0);
    public static final RegistryObject<Block> GLOWSTONE_SLAB = register("glowstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE)), 0);
    public static final RegistryObject<Block> SHROOMLIGHT_SLAB = register("shroomlight_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SHROOMLIGHT)), 0);
    public static final RegistryObject<Block> OCHRE_FROGLIGHT_SLAB = register("ochre_froglight_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OCHRE_FROGLIGHT)), 0);
    public static final RegistryObject<Block> PEARLESCENT_FROGLIGHT_SLAB = register("pearlescent_froglight_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT)), 0);
    public static final RegistryObject<Block> VERDANT_FROGLIGHT_SLAB = register("verdant_froglight_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT)), 0);
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab",
            () -> new CryingObsidianBlockSlab(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), 0);
    public static final RegistryObject<Block> MAGMA_BLOCK_SLAB = register("magma_block_slab",
            () -> new MagmaBlockSlab(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK)), 0);

    // Natural Blocks
    public static final RegistryObject<Block> MUD_SLAB = register("mud_slab",
            () -> new MudSlab(BlockBehaviour.Properties.copy(Blocks.MUD)), 0);
    public static final RegistryObject<Block> CLAY_SLAB = register("clay_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)), 0);
    public static final RegistryObject<Block> CALCITE_SLAB = register("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), 0);
    public static final RegistryObject<Block> TUFF_SLAB = register("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), 0);
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_SLAB = register("dripstone_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), 0);
    public static final RegistryObject<Block> OBSIDIAN_SLAB = register("obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), 0);
    public static final RegistryObject<Block> SOUL_SAND_SLAB = register("soul_sand_slab",
            () -> new SoulSandSlab(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND)), 0);
    public static final RegistryObject<Block> SCULK_SLAB = register("sculk_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SCULK)), 0);

    // Building Blocks
    public static final RegistryObject<Block> ACACIA_LOG_SLAB = register("acacia_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), 150);
    public static final RegistryObject<Block> BIRCH_LOG_SLAB = register("birch_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), 150);
    public static final RegistryObject<Block> CHERRY_LOG_SLAB = register("cherry_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)), 150);
    public static final RegistryObject<Block> CRIMSON_STEM_SLAB = register("crimson_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), 0);
    public static final RegistryObject<Block> DARK_OAK_LOG_SLAB = register("dark_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), 150);
    public static final RegistryObject<Block> JUNGLE_LOG_SLAB = register("jungle_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), 150);
    public static final RegistryObject<Block> MANGROVE_LOG_SLAB = register("mangrove_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), 150);
    public static final RegistryObject<Block> OAK_LOG_SLAB = register("oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 150);
    public static final RegistryObject<Block> SPRUCE_LOG_SLAB = register("spruce_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), 150);
    public static final RegistryObject<Block> WARPED_STEM_SLAB = register("warped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), 0);

    public static final RegistryObject<Block> PACKED_MUD_SLAB = register("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), 0);
    public static final RegistryObject<Block> BASALT_SLAB = register("basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)), 0);
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = register("polished_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT)), 0);
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT)), 0);
    public static final RegistryObject<Block> NETHERRACK_SLAB = register("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 0);
    public static final RegistryObject<Block> END_STONE_SLAB = register("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)), 0);
    public static final RegistryObject<Block> IRON_BLOCK_SLAB = register("iron_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), 0);
    public static final RegistryObject<Block> GOLD_BLOCK_SLAB = register("gold_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), 0);
    public static final RegistryObject<Block> EMERALD_BLOCK_SLAB = register("emerald_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), 0);
    public static final RegistryObject<Block> LAPIS_BLOCK_SLAB = register("lapis_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK)), 0);
    public static final RegistryObject<Block> DIAMOND_BLOCK_SLAB = register("diamond_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), 0);
    public static final RegistryObject<Block> NETHERITE_BLOCK_SLAB = register("netherite_block_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), 0);
    public static final RegistryObject<Block> AMETHYST_BLOCK_SLAB = register("amethyst_block_slab",
            () -> new AmethystBlockSlab(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), 0);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }
}