package com.devdyna.gadgestry.common.register.item;

import com.devdyna.gadgestry.Gadgestry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.HoeItem;

public class ToolItem {
    public static final RegistryObject<Item> CROOK = Gadgestry.ITEMS.register("crook",
            () -> new HoeItem(Tiers.IRON, 0, 0, new Item.Properties()));

}
