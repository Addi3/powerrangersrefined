package com.prr.core;

import com.prr.PowerRangersRefined;
import com.prr.core.Items.MMPowerSword;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PowerRangersRefinedItems  {

// MIGHTY MORPHIN
    public static final Item MM_POWER_SWORD = registerItem("mm_power_sword",
            new MMPowerSword(PowerRangersRefinedToolMaterials.MM_POWER_SWORD, 10, 0.5F, new Item.Settings().maxCount(1))
    );

    public static final Item MM_POWER_COIN = registerItem("mm_power_coin",
            new Item(new Item.Settings().maxCount(16))
    );

    public static final Item MM_FOSSIL_DRAGON = registerItem("mm_fossil_dragon",
            new Item(new Item.Settings().maxCount(16))
    );

    public static final Item MM_FOSSIL_MASTODON = registerItem("mm_fossil_mastodon",
            new Item(new Item.Settings().maxCount(16))
    );

    public static final Item MM_FOSSIL_PTERO = registerItem("mm_fossil_ptero",
            new Item(new Item.Settings().maxCount(16))
    );

    public static final Item MM_FOSSIL_SABER = registerItem("mm_fossil_saber",
            new Item(new Item.Settings().maxCount(16))
    );

    public static final Item MM_FOSSIL_TREX = registerItem("mm_fossil_trex",
            new Item(new Item.Settings().maxCount(1))
    );

    public static final Item MM_FOSSIL_TRICERA = registerItem("mm_fossil_tricera",
            new Item(new Item.Settings().maxCount(1))
    );

    public static final Item MM_FOSSIL_TIGER = registerItem("mm_fossil_tiger",
            new Item(new Item.Settings().maxCount(1))
    );

    public static final Item MIGHTY_MORPHER = registerItem("mighty_morpher",
            new Item(new Item.Settings().maxCount(1))
    );

    public static final Item MORPHING_GRID_UPGRADE = registerItem("morphing_grid_upgrade",
            new Item(new Item.Settings().maxCount(64))
    );




    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, PowerRangersRefined.id(name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(PowerRangersRefinedItems::addItemsToIngredientItemGroup);
    }



    public static void registerPowerRangersRefinedItems() {
    }
}
