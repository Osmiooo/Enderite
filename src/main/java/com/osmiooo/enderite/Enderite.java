package com.osmiooo.enderite;

import com.osmiooo.enderite.armor.RegisterItems;
import com.osmiooo.enderite.registry.ModBlocks;
import com.osmiooo.enderite.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class Enderite implements ModInitializer {

    public static final String MOD_ID = "enderite";

    private static ConfiguredFeature<?, ?> ORE_WOOL_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // Base block is end stone in The End biomes
                    ModBlocks.ENDERITE_ORE.getDefaultState(),
                    4))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(70))))
            .spreadHorizontally()
            .repeat(2);

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        RegisterItems.register();
        ModBlocks.RegisterBlock();
        RegistryKey<ConfiguredFeature<?, ?>> oreWoolEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("enderite", "ore_wool_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolEnd.getValue(), ORE_WOOL_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolEnd);
    }
}
