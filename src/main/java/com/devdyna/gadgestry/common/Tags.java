package com.devdyna.gadgestry.common;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import com.devdyna.gadgestry.Gadgestry;
import net.minecraft.world.level.block.Block;


public class Tags {
    public static class Blocks {
       public static final TagKey<Block> NEEDS_AQUAMARINE_TOOL = tag("needs_aquamarine_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Gadgestry.MODID, name));
        }
    }
}
