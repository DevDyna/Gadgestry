package com.devdyna.gadgestry.common.register.item;

// import net.minecraft.world.level.Level;

// import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

// import com.devdyna.gadgestry.Gadgestry;

// import net.minecraft.resources.ResourceLocation;
// import net.minecraft.world.InteractionHand;
// import net.minecraft.world.entity.Entity;
// import net.minecraft.world.entity.EntityType;
// import net.minecraft.world.entity.item.ItemEntity;
// import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
// import net.minecraft.world.item.ItemStack;
// import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
// import net.minecraftforge.registries.ForgeRegistries;

public class ScoopItem extends Item {
    public ScoopItem(Properties pProperties) {
        super(pProperties);
        pProperties.durability(128);
    }

    // public boolean interact(Player player, InteractionHand hand, Entity entity,
    // Level level) {
    // if (entity != null && entity.getType().toString() == "minecraft:bee") {
    // Item bee_item = ForgeRegistries.ITEMS.getValue(new
    // ResourceLocation("gadgestry:bee"));
    // ItemStack bee_itemstack = new ItemStack(bee_item);
    // EntityType<? extends ItemEntity> bee_entity = new ItemEntity(bee_entity,
    // level);
    // if (player.getInventory().getFreeSlot() != 0
    // || player.getInventory().findSlotMatchingItem(bee_itemstack) != -1) {
    // entity.kill();
    // level.addFreshEntity(bee_entity);
    // }

    // }
    // return true;
    // }
}
