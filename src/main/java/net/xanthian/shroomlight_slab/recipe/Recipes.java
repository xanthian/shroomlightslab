package net.xanthian.shroomlight_slab.recipe;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.shroomlight_slab.ShroomlightSlabs.MOD_ID;

public class Recipes {

    // 6 slab from 3 block
    public static JsonObject createSlabRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        // Loot condition
        JsonObject json = new JsonObject();
        //If modded item
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        // Type
        json.addProperty("type", "minecraft:crafting_shaped");
        // Pattern
        JsonArray pattern = new JsonArray();
        pattern.add("BBB");
        json.add("pattern", pattern);
        // Keys
        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item", "minecraft:" + material);
        keyList.add("B", iKey);
        json.add("key", keyList);
        // Result
        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_slab");
        result.addProperty("count", 6);
        json.add("result", result);
        return json;
    }

    // 1 block from 2 slabs
    public static JsonObject createUncraftRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("S");
        pattern.add("S");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   MOD_ID + ":" + material + "_slab");
        keyList.add("S", iKey);
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", "minecraft:" + material);
        json.add("result", result);
        return json;
    }


    // 1 Block to 2 slab stonecutter
    public static JsonObject createStonecutterRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();
        JsonObject json = new JsonObject();
        if (modList.size() > 0) {
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }
        json.addProperty("type", "minecraft:stonecutting");
        json.addProperty("count", 2);
        JsonObject iKey = new JsonObject();
        json.add("ingredient", iKey);
        iKey.addProperty("item", "minecraft:" + material);
        JsonObject result = new JsonObject();
        json.addProperty("result", MOD_ID + ":" + material + "_slab");
        return json;
    }
}