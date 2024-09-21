package com.devdyna.gadgestry.register.basic;

import com.devdyna.gadgestry.Gadgestry;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class Villager {

        public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES,
                        Gadgestry.MODID);
        public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister
                        .create(ForgeRegistries.VILLAGER_PROFESSIONS, Gadgestry.MODID);

        private static PoiType POIMAKER(Block block) {
                return new PoiType(
                                ImmutableSet.copyOf(block.getStateDefinition()
                                                .getPossibleStates()),
                                1, 1);
        }

        // POI
        public static final RegistryObject<PoiType> ARCHEOLOGIST_POI = POI_TYPES.register("archeologist_poi",
                        () -> POIMAKER(BasicBlock.ARCHEOLOGY_TABLE.get()));

        public static final RegistryObject<PoiType> BEEKEEPER_POI = POI_TYPES.register("beekeeper_poi",
                        () -> POIMAKER(Blocks.HONEYCOMB_BLOCK));

        public static final RegistryObject<PoiType> ECCENTRIC_POI = POI_TYPES.register("eccentric_poi",
                        () -> POIMAKER(Blocks.TNT));

        // VILLAGER PROFESSIONS
        public static final RegistryObject<VillagerProfession> ARCHEOLOGIST = VILLAGER_PROFESSIONS
                        .register("archeologist", () -> new VillagerProfession("archeologist",
                                        holder -> holder.get() == ARCHEOLOGIST_POI.get(),
                                        holder -> holder.get() == ARCHEOLOGIST_POI.get(),
                                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

        public static final RegistryObject<VillagerProfession> ECCENTRIC = VILLAGER_PROFESSIONS
                        .register("eccentric", () -> new VillagerProfession("eccentric",
                                        holder -> holder.get() == ECCENTRIC_POI.get(),
                                        holder -> holder.get() == ECCENTRIC_POI.get(),
                                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.TNT_PRIMED));

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
