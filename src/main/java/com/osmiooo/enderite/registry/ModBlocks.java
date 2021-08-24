package com.osmiooo.enderite.registry;

import com.osmiooo.enderite.Enderite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ENDERITE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f));

    public static void RegisterBlock() {

        Registry.register(Registry.BLOCK, new Identifier(Enderite.MOD_ID, "enderite_ore"), ENDERITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(Enderite.MOD_ID, "enderite_ore"), new BlockItem(ENDERITE_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
