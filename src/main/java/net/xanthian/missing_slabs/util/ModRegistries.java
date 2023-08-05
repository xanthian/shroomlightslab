package net.xanthian.missing_slabs.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.xanthian.missing_slabs.block.MissingSlabs;


public class ModRegistries {

    public static void registerFuels() {
        registerFuel();
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(MissingSlabs.ACACIA_LOG_SLAB,5,5);
        registry.add(MissingSlabs.BIRCH_LOG_SLAB,5,5);
        registry.add(MissingSlabs.CHERRY_LOG_SLAB,5,5);
        registry.add(MissingSlabs.DARK_OAK_LOG_SLAB,5,5);
        registry.add(MissingSlabs.JUNGLE_LOG_SLAB,5,5);
        registry.add(MissingSlabs.MANGROVE_LOG_SLAB,5,5);
        registry.add(MissingSlabs.OAK_LOG_SLAB,5,5);
        registry.add(MissingSlabs.SPRUCE_LOG_SLAB,5,5);
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(MissingSlabs.ACACIA_LOG_SLAB, 150);
        registry.add(MissingSlabs.BIRCH_LOG_SLAB, 150);
        registry.add(MissingSlabs.CHERRY_LOG_SLAB, 150);
        registry.add(MissingSlabs.DARK_OAK_LOG_SLAB, 150);
        registry.add(MissingSlabs.JUNGLE_LOG_SLAB, 150);
        registry.add(MissingSlabs.MANGROVE_LOG_SLAB, 150);
        registry.add(MissingSlabs.OAK_LOG_SLAB, 150);
        registry.add(MissingSlabs.SPRUCE_LOG_SLAB, 150);

    }
}