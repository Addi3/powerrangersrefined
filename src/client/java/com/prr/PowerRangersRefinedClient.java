package com.prr;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import static com.prr.PowerRangersRefined.id;

public class PowerRangersRefinedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {


        // Register builtin resourcepacks
        FabricLoader.getInstance().getModContainer("power-rangers-refined").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(id("panoramaandlogo"), modContainer, ResourcePackActivationType.DEFAULT_ENABLED);
        });
    }

}