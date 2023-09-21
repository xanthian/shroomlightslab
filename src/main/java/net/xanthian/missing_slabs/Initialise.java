package net.xanthian.missing_slabs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Block;
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
                    for (Block slab : MissingSlabs.MOD_SLABS.values()) {
                        entries.add(slab);
                    }
                })
                .build());

        MissingSlabs.registerMissingSlabs();
        ModRegistries.registerFuels();
    }
}