package net.xanthian.missing_slabs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.missing_slabs.Initialise;
import net.xanthian.missing_slabs.block.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Initialise.ITEM_GROUP, "The Missing Slabs");

        for (Block slab : MissingSlabs.MOD_SLABS.values()) {
            translationBuilder.add(slab, generateBlockDisplayName(slab));
        }
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
            String[] parts = blockName.split("_");
            StringBuilder displayName = new StringBuilder();
            for (String part : parts) {
                displayName.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
            return displayName.toString().trim();
    }
}