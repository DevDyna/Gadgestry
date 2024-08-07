package com.devdyna.gadgestry.common.register.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class FoodItem extends BasicItem{
    public static final RegistryObject<Item> STEW = ITEMS.register("stew",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .alwaysEat().nutrition(3).saturationMod(5f).build())));
}
