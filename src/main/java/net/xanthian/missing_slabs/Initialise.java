package net.xanthian.missing_slabs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.missing_slabs.block.MissingSlabs;
import net.xanthian.missing_slabs.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "missing_slabs";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "missing_slabs"));

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("missing_slabs.group.missing_slabs"))
                .icon(() -> new ItemStack(MissingSlabs.SHROOMLIGHT_SLAB))
                .entries((context, entries) -> {

                    entries.add(MissingSlabs.AMETHYST_BLOCK_SLAB);
                    entries.add(MissingSlabs.CRYING_OBSIDIAN_SLAB);
                    entries.add(MissingSlabs.GLOWSTONE_SLAB);
                    entries.add(MissingSlabs.MAGMA_BLOCK_SLAB);
                    entries.add(MissingSlabs.SCULK_SLAB);
                    entries.add(MissingSlabs.SEA_LANTERN_SLAB);
                    entries.add(MissingSlabs.SHROOMLIGHT_SLAB);

                    entries.add(MissingSlabs.BASALT_SLAB);
                    entries.add(MissingSlabs.CALCITE_SLAB);
                    entries.add(MissingSlabs.END_STONE_SLAB);
                    entries.add(MissingSlabs.NETHERRACK_SLAB);
                    entries.add(MissingSlabs.POLISHED_BASALT_SLAB);
                    entries.add(MissingSlabs.SMOOTH_BASALT_SLAB);
                    entries.add(MissingSlabs.TUFF_SLAB);

                    entries.add(MissingSlabs.DIAMOND_BLOCK_SLAB);
                    entries.add(MissingSlabs.EMERALD_BLOCK_SLAB);
                    entries.add(MissingSlabs.GOLD_BLOCK_SLAB);
                    entries.add(MissingSlabs.IRON_BLOCK_SLAB);
                    entries.add(MissingSlabs.LAPIS_BLOCK_SLAB);
                    entries.add(MissingSlabs.NETHERITE_BLOCK_SLAB);

                    entries.add(MissingSlabs.OCHRE_FROGLIGHT_SLAB);
                    entries.add(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB);
                    entries.add(MissingSlabs.VERDANT_FROGLIGHT_SLAB);

                    entries.add(MissingSlabs.ACACIA_LOG_SLAB);
                    entries.add(MissingSlabs.BIRCH_LOG_SLAB);
                    entries.add(MissingSlabs.CHERRY_LOG_SLAB);
                    entries.add(MissingSlabs.CRIMSON_STEM_SLAB);
                    entries.add(MissingSlabs.DARK_OAK_LOG_SLAB);
                    entries.add(MissingSlabs.JUNGLE_LOG_SLAB);
                    entries.add(MissingSlabs.MANGROVE_LOG_SLAB);
                    entries.add(MissingSlabs.OAK_LOG_SLAB);
                    entries.add(MissingSlabs.SPRUCE_LOG_SLAB);
                    entries.add(MissingSlabs.WARPED_STEM_SLAB);
                })
                .build());

        MissingSlabs.registerMissingSlabs();
        ModRegistries.registerFuels();
    }
}