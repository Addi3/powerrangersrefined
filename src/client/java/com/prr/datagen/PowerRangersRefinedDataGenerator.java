package com.prr.datagen;

import com.joyeuxlib.datagenproviders.JoyeuxLibEnglishLangProvider;
import com.joyeuxlib.datagenproviders.JoyeuxLibRecipeProvider;
import com.prr.PowerRangersRefined;
import com.prr.core.PowerRangersRefinedItems;
import com.prr.datagen.providers.PowerRangersRefinedModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class PowerRangersRefinedDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(this::englishTranslationsProvider);
        pack.addProvider(this::recipeProvider);
        pack.addProvider(PowerRangersRefinedModelProvider::new);
    }

    public JoyeuxLibEnglishLangProvider englishTranslationsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        JoyeuxLibEnglishLangProvider joyENUSLang = new JoyeuxLibEnglishLangProvider(output);

// Item Groups
        //MMPR
        joyENUSLang.addTranslation("itemgroup.mmpr","Mighty Morphin");

// Items
        //MMPR
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
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_tiger_coin","White Tiger Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_dragon_coin","Dragon Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_tricera_coin","Triceratops Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_ptero_coin","Pterodactyl Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_trex_coin","Trex Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_mastodon_coin","Mastodon Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.mm_saber_coin","Saber Tooth Coin");
        joyENUSLang.addTranslation("item.power-rangers-refined.morphing_grid","Morphing Grid");
        joyENUSLang.addTranslation("item.power-rangers-refined.brass_ingot","Brass Ingot");
        joyENUSLang.addTranslation("item.power-rangers-refined.brass_nugget","Brass Nugget");



        return joyENUSLang;
    }

    public JoyeuxLibRecipeProvider recipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        JoyeuxLibRecipeProvider joyRecipe = new JoyeuxLibRecipeProvider(output);

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_DRAGON), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_DRAGON_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_DRAGON), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_DRAGON))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("dragon_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_TIGER), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_TIGER_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_TIGER), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_TIGER))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("tiger_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_MASTODON), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_MASTODON_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_MASTODON), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_MASTODON))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("mastodon_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_TREX), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_TREX_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_TREX), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_TREX))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("trex_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_PTERO), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_PTERO_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_PTERO), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_PTERO))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("ptero_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_TRICERA), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_TRICERA_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_TRICERA), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_TRICERA))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("tricera_coin_smithing"));

        joyRecipe.addSmithingTransformRecipe(
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItems(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                Ingredient.ofItems(PowerRangersRefinedItems.MM_FOSSIL_SABER), Ingredient.ofItems(PowerRangersRefinedItems.MM_POWER_COIN),
                                RecipeCategory.MISC, PowerRangersRefinedItems.MM_SABER_COIN)
                        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE),
                                conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_FOSSIL_SABER), conditionsFromItem(PowerRangersRefinedItems.MM_FOSSIL_SABER))
                        .criterion(hasItem(PowerRangersRefinedItems.MM_POWER_COIN), conditionsFromItem(PowerRangersRefinedItems.MM_POWER_COIN)),
                PowerRangersRefined.id("saber_coin_smithing"));

joyRecipe.addShapedRecipe(ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, PowerRangersRefinedItems.MORPHING_GRID_UPGRADE, 1)
        .pattern("MBN")
        .input('M', PowerRangersRefinedItems.MORPHING_GRID)
        .input('B', Items.BLUE_DYE)
        .input('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
        .criterion(hasItem(PowerRangersRefinedItems.MORPHING_GRID), conditionsFromItem(PowerRangersRefinedItems.MORPHING_GRID))
        .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
        .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)));

        joyRecipe.addShapedRecipe(ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, PowerRangersRefinedItems.MORPHING_GRID, 2)
                .pattern("RBR")
                .pattern("C C")
                .input('R', Items.REDSTONE)
                .input('B', PowerRangersRefinedItems.BRASS_INGOT)
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem( PowerRangersRefinedItems.BRASS_INGOT), conditionsFromItem( PowerRangersRefinedItems.BRASS_INGOT))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .criterion(hasItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)));

        joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
                .create(RecipeCategory.MISC, PowerRangersRefinedItems.BRASS_INGOT, 4)
                .group("brass")
                .input(Items.GOLD_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT)));

        joyRecipe.addShapelessRecipe(ShapelessRecipeJsonBuilder
                .create(RecipeCategory.MISC, PowerRangersRefinedItems.BRASS_NUGGET, 9)
              .group("brass")
                .input(PowerRangersRefinedItems.BRASS_INGOT)
                .criterion(hasItem(PowerRangersRefinedItems.BRASS_INGOT), conditionsFromItem(PowerRangersRefinedItems.BRASS_INGOT)));

        joyRecipe.addShapedRecipe(ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, PowerRangersRefinedItems.BRASS_INGOT, 1)
                .group("brass")
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .input('N', PowerRangersRefinedItems.BRASS_NUGGET)
                .criterion(hasItem(PowerRangersRefinedItems.BRASS_NUGGET), conditionsFromItem(PowerRangersRefinedItems.BRASS_NUGGET)),
                PowerRangersRefined.id("brass_ingot_from_nuggets"));



        joyRecipe.addShapedRecipe(ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, PowerRangersRefinedItems.MM_POWER_COIN, 1)
                .group("brass")
                .pattern(" N ")
                .pattern("NBN")
                .pattern(" N ")
                .input('N', PowerRangersRefinedItems.BRASS_NUGGET)
                .input('B', PowerRangersRefinedItems.BRASS_INGOT)
                .criterion(hasItem(PowerRangersRefinedItems.BRASS_INGOT), conditionsFromItem(PowerRangersRefinedItems.BRASS_INGOT))
                .criterion(hasItem(PowerRangersRefinedItems.BRASS_NUGGET), conditionsFromItem(PowerRangersRefinedItems.BRASS_NUGGET)));


        return joyRecipe;
    }

}