package net.xanthian.missing_slabs.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;

public class ModTextureMap extends TextureMap {

    public static TextureMap slabsides(Block block) {
        return (new ModTextureMap())
                .put(TextureKey.BOTTOM, getId(block))
                .put(TextureKey.SIDE, getId(block))
                .put(TextureKey.TOP, getId(block));

    }

    public static TextureMap froglightslabsides(Block block) {
        return (new ModTextureMap())
                .put(TextureKey.BOTTOM, getSubId(block, "_top"))
                .put(TextureKey.SIDE, getSubId(block, "_side"))
                .put(TextureKey.TOP, getSubId(block, "_top"));

    }

    public static TextureMap logSlabs(Block block) {
        return (new ModTextureMap())
                .put(TextureKey.BOTTOM, getSubId(block, "_top"))
                .put(TextureKey.SIDE, getId(block))
                .put(TextureKey.TOP, getSubId(block, "_top"));

    }
}