package com.osmiooo.enderite.registry;

import com.osmiooo.enderite.Enderite;
import com.osmiooo.enderite.toolmaterial.BaseAxe;
import com.osmiooo.enderite.toolmaterial.BaseHoe;
import com.osmiooo.enderite.toolmaterial.BasePickaxe;
import com.osmiooo.enderite.toolmaterial.EnderiteToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ENDERITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item ENDERITE_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static ToolItem ENDERITE_SWORD = new SwordItem(EnderiteToolMaterial.INSTANCE, 0, -2.4f, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof());
    public static ToolItem ENDERITE_SHOVEL = new ShovelItem(EnderiteToolMaterial.INSTANCE, -1.5f, -2.4f, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1).fireproof());

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_ingot"), ENDERITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_fragment"), ENDERITE_FRAGMENT);
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_sword"), ENDERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_pickaxe"), new BasePickaxe(new EnderiteToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_axe"), new BaseAxe(new EnderiteToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_shovel"), ENDERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_hoe"), new BaseHoe(new EnderiteToolMaterial()));

    }
}
