package com.devdyna.gadgestry.common.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

public class TypeFest {

    public TypeFest() {

    }

    public static BlockState getBlockState(String name) {
        return ForgeRegistries.BLOCKS.getValue(
                new ResourceLocation(name)).defaultBlockState();
    }

    public static Item getItem(String name) {
        return ForgeRegistries.ITEMS.getValue(
                new ResourceLocation(name));
    }

    public static ItemStack getItemStack(String name) {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(
                new ResourceLocation(name)));
    }

}
