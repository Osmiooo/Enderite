package com.osmiooo.enderite;

import com.osmiooo.enderite.armor.RegisterItems;
import com.osmiooo.enderite.registry.ModBlocks;
import com.osmiooo.enderite.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Enderite implements ModInitializer {

    public static final String MOD_ID = "enderite";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        RegisterItems.register();
        ModBlocks.RegisterBlock();
    }
}
