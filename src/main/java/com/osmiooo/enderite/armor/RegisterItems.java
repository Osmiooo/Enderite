package com.osmiooo.enderite.armor;

import com.osmiooo.enderite.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new EnderiteArmorMaterial();
    public static final Item ENDERITE_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ENDERITE_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ENDERITE_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item ENDERITE_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("enderite", "enderite_helmet"), ENDERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("enderite", "enderite_chestplate"), ENDERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("enderite", "enderite_leggings"), ENDERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("enderite", "enderite_boots"), ENDERITE_BOOTS);
    }
}
