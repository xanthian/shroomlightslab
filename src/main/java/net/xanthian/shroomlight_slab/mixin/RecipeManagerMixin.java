package net.xanthian.shroomlight_slab.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.xanthian.shroomlight_slab.ShroomlightSlabs;
import net.xanthian.shroomlight_slab.recipe.Recipes;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> blockType : ShroomlightSlabs.blockTypes) {
            map.put(new Identifier(ShroomlightSlabs.MOD_ID, blockType.getLeft() + "_slab"), Recipes.createSlabRecipeJson(blockType.getLeft(), blockType.getRight()));
        }
        for (Pair<String, String[]> blockType : ShroomlightSlabs.blockTypes) {
            map.put(new Identifier(ShroomlightSlabs.MOD_ID, blockType.getLeft() + "_from_" + blockType.getLeft() + "_slab"), Recipes.createUncraftRecipeJson(blockType.getLeft(), blockType.getRight()));
        }
        for (Pair<String, String[]> blockType : ShroomlightSlabs.blockTypes) {
            map.put(new Identifier(ShroomlightSlabs.MOD_ID, blockType.getLeft() + "_slab_stonecutter"), Recipes.createStonecutterRecipeJson(blockType.getLeft(), blockType.getRight()));
        }
    }
}