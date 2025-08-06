package com.prr;

import com.prr.core.PowerRangersRefinedItemGroups;
import com.prr.core.PowerRangersRefinedItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerRangersRefined implements ModInitializer {
	public static final String MOD_ID = "power-rangers-refined";

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        PowerRangersRefinedItemGroups.initialize();
        PowerRangersRefinedItems.registerPowerRangersRefinedItems();

	}
}