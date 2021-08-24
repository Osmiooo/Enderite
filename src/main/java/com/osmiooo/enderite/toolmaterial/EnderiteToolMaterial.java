package com.osmiooo.enderite.toolmaterial;

import com.osmiooo.enderite.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderiteToolMaterial implements ToolMaterial {

    public static final EnderiteToolMaterial INSTANCE = new EnderiteToolMaterial();

    @Override
    public int getDurability() {
        return 2591;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 8.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ENDERITE_INGOT);
    }
}

