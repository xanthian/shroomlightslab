package net.xanthian.shroomlight_slab;

import net.fabricmc.api.ModInitializer;
import net.xanthian.shroomlight_slab.block.Slabs;

public class ShroomlightSlabs implements ModInitializer {

    public static final String MOD_ID = "shroomlight_slab";

    @Override
    public void onInitialize() {
        Slabs.registerModBlocks();
        System.out.println("Shroomlight Slabs loaded");
}
}