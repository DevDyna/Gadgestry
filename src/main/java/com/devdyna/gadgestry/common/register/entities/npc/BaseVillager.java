package com.devdyna.gadgestry.common.register.entities.npc;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.common.register.block.BasicBlock;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.level.block.Blocks;

public class BaseVillager {
        public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES,
                        Gadgestry.MODID);
        public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister
                        .create(ForgeRegistries.VILLAGER_PROFESSIONS, Gadgestry.MODID);

        public static final RegistryObject<PoiType> ARCHEOLOGIST_POI = POI_TYPES.register("archeologist_poi",
                        () -> new PoiType(
                                        ImmutableSet.copyOf(BasicBlock.ARCHEOLOGY_TABLE.get().getStateDefinition()
                                                        .getPossibleStates()),
                                        1, 1));

        public static final RegistryObject<VillagerProfession> ARCHEOLOGIST = VILLAGER_PROFESSIONS
                        .register("archeologist", () -> new VillagerProfession("archeologist",
                                        holder -> holder.get() == ARCHEOLOGIST_POI.get(),
                                        holder -> holder.get() == ARCHEOLOGIST_POI.get(),
                                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

        public static final RegistryObject<PoiType> INTELLECTUAL_POI = POI_TYPES.register("intellectual_poi",
                        () -> new PoiType(ImmutableSet.of(Blocks.PISTON.defaultBlockState()), 1, 1));
        
        
        public static final RegistryObject<VillagerProfession> INTELLECTUAL = VILLAGER_PROFESSIONS
                        .register("intellectual", () -> new VillagerProfession("intellectual",
                                        holder -> holder.get() == INTELLECTUAL_POI.get(),
                                        holder -> holder.get() == INTELLECTUAL_POI.get(),
                                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ANVIL_PLACE));

                                        public static final RegistryObject<PoiType> BEEKEEPER_POI = POI_TYPES.register("beekeeper_poi",
                                        () -> new PoiType(ImmutableSet.of(Blocks.BEEHIVE.defaultBlockState()), 1, 1));
                        
                        
                        public static final RegistryObject<VillagerProfession> BEEKEEPER = VILLAGER_PROFESSIONS
                                        .register("beekeeper", () -> new VillagerProfession("beekeeper",
                                                        holder -> holder.get() == BEEKEEPER_POI.get(),
                                                        holder -> holder.get() == BEEKEEPER_POI.get(),
                                                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BEEHIVE_WORK));
                

        public static void register(IEventBus eventBus) {
                POI_TYPES.register(eventBus);
                VILLAGER_PROFESSIONS.register(eventBus);
        }
}
