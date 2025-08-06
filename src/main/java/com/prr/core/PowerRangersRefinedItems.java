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


    public static final Item MM_POWER_SWORD = registerItem("mm_power_sword",
            new MMPowerSword(PowerRangersRefinedToolMaterials.MM_POWER_SWORD, 10, 0.5F, new Item.Settings().maxCount(1))
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
