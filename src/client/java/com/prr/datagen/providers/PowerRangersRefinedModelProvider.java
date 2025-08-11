package com.prr.datagen.providers;

import com.joyeuxlib.datagenproviders.JoyeuxLibModelProvider;
import com.prr.core.PowerRangersRefinedItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.ItemModelGenerator;

public class PowerRangersRefinedModelProvider extends JoyeuxLibModelProvider {
    public PowerRangersRefinedModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
    }


    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(PowerRangersRefinedItems.MM_POWER_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_TREX, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_MASTODON, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_PTERO, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_SABER, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_TRICERA, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_DRAGON, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_FOSSIL_TIGER, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_TIGER_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_DRAGON_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_MASTODON_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_SABER_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_TREX_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_PTERO_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MM_TRICERA_COIN, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.MORPHING_GRID, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.BRASS_INGOT, Models.GENERATED);
        itemModelGenerator.register(PowerRangersRefinedItems.BRASS_NUGGET, Models.GENERATED);

    }
}