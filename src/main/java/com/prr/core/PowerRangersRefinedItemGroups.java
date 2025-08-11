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
                    .icon(() -> new ItemStack(PowerRangersRefinedItems.MM_TREX_COIN)).entries((displayContext, entries) -> {


                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TREX);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_MASTODON);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_PTERO);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_SABER);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TRICERA);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_DRAGON);
                        entries.add(PowerRangersRefinedItems.MM_FOSSIL_TIGER);
                        entries.add(PowerRangersRefinedItems.MM_POWER_COIN);
                        entries.add(PowerRangersRefinedItems.MM_TREX_COIN);
                        entries.add(PowerRangersRefinedItems.MM_MASTODON_COIN);
                        entries.add(PowerRangersRefinedItems.MM_PTERO_COIN);
                        entries.add(PowerRangersRefinedItems.MM_SABER_COIN);
                        entries.add(PowerRangersRefinedItems.MM_TRICERA_COIN);
                        entries.add(PowerRangersRefinedItems.MM_DRAGON_COIN);
                        entries.add(PowerRangersRefinedItems.MM_TIGER_COIN);
                        entries.add(PowerRangersRefinedItems.MIGHTY_MORPHER);
                        entries.add(PowerRangersRefinedItems.MM_POWER_SWORD);


                    }).build());


    public static void registerItemGroups() {
        PowerRangersRefined.LOGGER.info("Registering Item Groups for " + PowerRangersRefined.MOD_ID);
    }

    public static void initialize() {

    }
}
