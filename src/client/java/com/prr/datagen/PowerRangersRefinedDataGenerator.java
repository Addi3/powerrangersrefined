package com.prr.datagen;

import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.prr.datagen.providers.PowerRangersRefinedModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PowerRangersRefinedDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(this::englishTranslationsProvider);
        pack.addProvider(PowerRangersRefinedModelProvider::new);
    }

    public JoyeuxLibEnglishLangProvider englishTranslationsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        JoyeuxLibEnglishLangProvider joyENUSLang = new JoyeuxLibEnglishLangProvider(output);

// Item Groups
        joyENUSLang.addTranslation("itemgroup.mmpr","Mighty Morphin");

// Items
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_power_sword","Power Sword");



        return joyENUSLang;
    }

}