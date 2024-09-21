package com.devdyna.gadgestry.register.custom.item;

import com.devdyna.gadgestry.utils.TypeFest;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ScoopItem extends Item {
    public ScoopItem(Properties pProperties) {
        super(pProperties);
        pProperties.durability(128);
    }

    public InteractionResult interact(Player player, InteractionHand hand, Entity entity,
            Level level) {
        if (entity != null && entity.getType().toString() == "minecraft:bee") {
            entity.remove(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            player.getInventory().setPickedItem(TypeFest.getItemStack("gadgestry:bee"));
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.FAIL;
        }

    }
}
