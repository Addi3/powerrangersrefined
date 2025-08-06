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

         itemModelGenerator.register(PowerRangersRefinedItems.POWER_COIN, Models.GENERATED);

    }
}