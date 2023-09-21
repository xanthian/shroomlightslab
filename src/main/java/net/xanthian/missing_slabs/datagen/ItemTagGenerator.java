package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import net.minecraft.registry.tag.ItemTags;
import net.xanthian.missing_slabs.block.*;

import java.util.concurrent.CompletableFuture;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for (Block slab : MissingSlabs.MOD_SLABS.values()) {
            getOrCreateTagBuilder(ItemTags.SLABS)
                    .add(slab.asItem());
        }

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(MissingSlabs.GOLD_BLOCK_SLAB.asItem());

    }
}