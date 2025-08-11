package com.prr;

import com.joyeuxlib.core.JoyeuxLibBlocks;
import com.prr.core.PowerRangersRefinedBlocks;
import com.prr.core.PowerRangersRefinedItemGroups;
import com.prr.core.PowerRangersRefinedItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
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
        PowerRangersRefinedBlocks.registerPowerRangersRefinedBlocks();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PowerRangersRefinedItems.MORPHING_GRID_UPGRADE.asItem());
        });

	}
}