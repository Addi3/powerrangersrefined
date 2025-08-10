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
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_power_coin","Power Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_dragon","Dragon Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_mastodon","Mastodon Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_ptero","Pterodactyl Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_saber","Saber Tooth Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_trex","Trex Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_tricera","Triceratops Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_fossil_tiger","White Tiger Fossil");
        joyENUSLang.addTranslation("item.power-rangers-refined.mighty_morpher","Mighty Morpher");
        joyENUSLang.addTranslation("item.power-rangers-refined.morphing_grid_upgrade","Morphing Grid Upgrade");



        return joyENUSLang;
    }

}