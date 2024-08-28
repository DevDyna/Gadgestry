package com.devdyna.gadgestry;

import com.devdyna.gadgestry.common.register.block.BasicBlock;
import com.devdyna.gadgestry.common.register.item.BasicItem;
import com.devdyna.gadgestry.common.register.tab.CreativeTab;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.devdyna.gadgestry.common.register.entities.npc.BaseVillager;

@Mod(Gadgestry.MODID)
public class Gadgestry {
        public static final String MODID = "gadgestry";

        public Gadgestry() {
                IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
                
                CreativeTab.register(modEventBus);
                BasicItem.register(modEventBus);
                BasicBlock.register(modEventBus);
                BaseVillager.register(modEventBus);
                // modEventBus.addListener(this::commonSetup);
        }

//         private void commonSetup(final FMLCommonSetupEvent event) {
//         event.enqueueWork(() -> {
//             ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATMINT.getId(), ModBlocks.POTTED_CATMINT);
//         });
//     }
}
