package com.devdyna.gadgestry.register.custom.tier;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import java.util.List;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.Tags;
import com.devdyna.gadgestry.register.basic.BasicItem;
import net.minecraftforge.common.TierSortingRegistry;

public class TierTool {

    public static final Tier AQUAMARINE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 500, 8f, 0f, 25,
                    Tags.Blocks.NEEDS_AQUAMARINE_TOOL, () -> Ingredient.of(BasicItem.AQUAMARINE.get())),
            new ResourceLocation(Gadgestry.MODID, "aquamarine"), List.of(Tiers.IRON), List.of());

            public static final Tier ROSE_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(6, 5000, 10f, 2f, 5,
                    Tags.Blocks.NEEDS_ROSE_DIAMOND_TOOL, () -> Ingredient.of(BasicItem.ROSE_DIAMOND.get())),
            new ResourceLocation(Gadgestry.MODID, "rose_diamond"), List.of(Tiers.NETHERITE), List.of());
}
