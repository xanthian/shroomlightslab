package net.xanthian.shroomlight_slab;

import net.fabricmc.api.ModInitializer;

import net.xanthian.shroomlight_slab.block.Blocks;

import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class ShroomlightSlabs implements ModInitializer {

    public static final String MOD_ID = "shroomlight_slab";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final List<Pair<String, String[]>> blockTypes = Arrays.asList(
            Pair.of("shroomlight", new String[0]),
            Pair.of("sea_lantern", new String[0]),
            Pair.of("glowstone", new String[0]),
            Pair.of("pearlescent_froglight", new String[0]),
            Pair.of("ochre_froglight", new String[0]),
            Pair.of("verdant_froglight", new String[0]),
            Pair.of("magma_block", new String[0]),
            Pair.of("gold_block", new String[0]),
            Pair.of("diamond_block", new String[0]),
            Pair.of("amethyst_block", new String[0]),
            Pair.of("sculk", new String[0]),
            Pair.of("crying_obsidian", new String[0]));


    @Override
    public void onInitialize() {

        Blocks.registerModBlocks();

        LOGGER.info("Registering Blocks for Shroomlight Slabs");
    }
}