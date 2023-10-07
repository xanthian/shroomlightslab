package net.xanthian.missing_slabs;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.xanthian.missing_slabs.block.MissingSlabs;
import net.xanthian.missing_slabs.item.ModItems;

@Mod(Initialise.MOD_ID)
public class Initialise {

    public static final String MOD_ID = "missing_slabs";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::buildCreativeModeTabs);

        MissingSlabs.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == CreativeModeTabs.BUILDING_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.ACACIA_LOG), new ItemStack(MissingSlabs.ACACIA_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_LOG), new ItemStack(MissingSlabs.BIRCH_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_LOG), new ItemStack(MissingSlabs.CHERRY_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_STEM), new ItemStack(MissingSlabs.CRIMSON_STEM_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_LOG), new ItemStack(MissingSlabs.DARK_OAK_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_LOG), new ItemStack(MissingSlabs.JUNGLE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_LOG), new ItemStack(MissingSlabs.MANGROVE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OAK_LOG), new ItemStack(MissingSlabs.OAK_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_LOG), new ItemStack(MissingSlabs.SPRUCE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_STEM), new ItemStack(MissingSlabs.WARPED_STEM_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(new ItemStack(Items.SEA_LANTERN), new ItemStack(MissingSlabs.SEA_LANTERN_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.NETHERRACK), new ItemStack(MissingSlabs.NETHERRACK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.PACKED_MUD), new ItemStack(MissingSlabs.PACKED_MUD_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.BASALT), new ItemStack(MissingSlabs.BASALT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.POLISHED_BASALT), new ItemStack(MissingSlabs.POLISHED_BASALT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SMOOTH_BASALT), new ItemStack(MissingSlabs.SMOOTH_BASALT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.END_STONE), new ItemStack(MissingSlabs.END_STONE_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.IRON_BLOCK), new ItemStack(MissingSlabs.IRON_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.GOLD_BLOCK), new ItemStack(MissingSlabs.GOLD_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.EMERALD_BLOCK), new ItemStack(MissingSlabs.EMERALD_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.LAPIS_BLOCK), new ItemStack(MissingSlabs.LAPIS_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.DIAMOND_BLOCK), new ItemStack(MissingSlabs.DIAMOND_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.NETHERITE_BLOCK), new ItemStack(MissingSlabs.NETHERITE_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.AMETHYST_BLOCK), new ItemStack(MissingSlabs.AMETHYST_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == CreativeModeTabs.NATURAL_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.MUD), new ItemStack(MissingSlabs.MUD_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CLAY), new ItemStack(MissingSlabs.CLAY_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CALCITE), new ItemStack(MissingSlabs.CALCITE_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.TUFF), new ItemStack(MissingSlabs.TUFF_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.DRIPSTONE_BLOCK), new ItemStack(MissingSlabs.DRIPSTONE_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OBSIDIAN), new ItemStack(MissingSlabs.OBSIDIAN_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SOUL_SAND), new ItemStack(MissingSlabs.SOUL_SAND_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.BASALT), new ItemStack(MissingSlabs.BASALT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SMOOTH_BASALT), new ItemStack(MissingSlabs.SMOOTH_BASALT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.END_STONE), new ItemStack(MissingSlabs.END_STONE_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.GLOWSTONE), new ItemStack(MissingSlabs.GLOWSTONE_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SHROOMLIGHT), new ItemStack(MissingSlabs.SHROOMLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OCHRE_FROGLIGHT), new ItemStack(MissingSlabs.OCHRE_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.PEARLESCENT_FROGLIGHT), new ItemStack(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.VERDANT_FROGLIGHT), new ItemStack(MissingSlabs.VERDANT_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CRYING_OBSIDIAN), new ItemStack(MissingSlabs.CRYING_OBSIDIAN_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.NETHERRACK), new ItemStack(MissingSlabs.NETHERRACK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.MAGMA_BLOCK), new ItemStack(MissingSlabs.MAGMA_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putAfter(new ItemStack(Items.ACACIA_LOG), new ItemStack(MissingSlabs.ACACIA_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.BIRCH_LOG), new ItemStack(MissingSlabs.BIRCH_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CHERRY_LOG), new ItemStack(MissingSlabs.CHERRY_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CRIMSON_STEM), new ItemStack(MissingSlabs.CRIMSON_STEM_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.DARK_OAK_LOG), new ItemStack(MissingSlabs.DARK_OAK_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.JUNGLE_LOG), new ItemStack(MissingSlabs.JUNGLE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.MANGROVE_LOG), new ItemStack(MissingSlabs.MANGROVE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OAK_LOG), new ItemStack(MissingSlabs.OAK_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SPRUCE_LOG), new ItemStack(MissingSlabs.SPRUCE_LOG_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.WARPED_STEM), new ItemStack(MissingSlabs.WARPED_STEM_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SCULK), new ItemStack(MissingSlabs.SCULK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.SEA_LANTERN), new ItemStack(MissingSlabs.SEA_LANTERN_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.GLOWSTONE), new ItemStack(MissingSlabs.GLOWSTONE_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.SHROOMLIGHT), new ItemStack(MissingSlabs.SHROOMLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OCHRE_FROGLIGHT), new ItemStack(MissingSlabs.OCHRE_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.PEARLESCENT_FROGLIGHT), new ItemStack(MissingSlabs.PEARLESCENT_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.VERDANT_FROGLIGHT), new ItemStack(MissingSlabs.VERDANT_FROGLIGHT_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.CRYING_OBSIDIAN), new ItemStack(MissingSlabs.CRYING_OBSIDIAN_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.MAGMA_BLOCK), new ItemStack(MissingSlabs.MAGMA_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.AMETHYST_BLOCK), new ItemStack(MissingSlabs.AMETHYST_BLOCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}