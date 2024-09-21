package com.devdyna.gadgestry;

import com.devdyna.gadgestry.register.CreativeTab;
import com.devdyna.gadgestry.register.basic.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gadgestry.MODID)
public class Gadgestry {
        public static final String MODID = "gadgestry";

        public Gadgestry() {
                IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
                
                CreativeTab.register(modEventBus);
                BasicBlock.register(modEventBus);
                BasicItem.register(modEventBus);
                Villager.register(modEventBus);
        }

}
