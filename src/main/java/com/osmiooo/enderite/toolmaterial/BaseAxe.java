package com.osmiooo.enderite.toolmaterial;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class BaseAxe extends AxeItem {
    public BaseAxe(ToolMaterial material) {
        super(material, 1.5f, -3.2f, new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1).fireproof());
    }
}
