package com.devdyna.gadgestry.common.register.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.HoeItem;

public class ToolItem extends BasicItem{
    public static final RegistryObject<Item> CROOK = ITEMS.register("crook",
            () -> new HoeItem(Tiers.IRON, 0, 0, new Item.Properties()));

}
