package com.osmiooo.enderite.registry;

import com.osmiooo.enderite.Enderite;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ENDERITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_ingot"), ENDERITE_INGOT);
    }
}
