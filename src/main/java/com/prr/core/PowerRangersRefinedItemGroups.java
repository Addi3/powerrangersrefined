package com.prr.core;

import com.prr.PowerRangersRefined;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class PowerRangersRefinedItemGroups {
    public static final ItemGroup ANCIENT_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            PowerRangersRefined.id("mmpr"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mmpr"))
                    .icon(() -> new ItemStack(Items.GLOW_ITEM_FRAME)).entries((displayContext, entries) -> {


                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TREX);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_MASTODON);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_PTERO);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_SABER);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TRICERA);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_DRAGON);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TIGER);
                        entries.add(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE);
                        entries.add(PowerRangersRefinedItems.MM_POWER_COIN);
                        entries.add(PowerRangersRefinedItems.MIGHTY_MORPHER);
                        entries.add(PowerRangersRefinedItems.MM_POWER_SWORD);


                    }).build());


    public static void registerItemGroups() {
        PowerRangersRefined.LOGGER.info("Registering Item Groups for " + PowerRangersRefined.MOD_ID);
    }

    public static void initialize() {

    }
}
