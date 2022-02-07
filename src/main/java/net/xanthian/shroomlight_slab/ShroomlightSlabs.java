package net.xanthian.shroomlight_slab;

import net.fabricmc.api.ModInitializer;
import net.xanthian.shroomlight_slab.block.Blocks;

public class ShroomlightSlabs implements ModInitializer {

    public static final String MOD_ID = "shroomlight_slab";

    @Override
    public void onInitialize() {
        Blocks.registerModBlocks();
    }
}