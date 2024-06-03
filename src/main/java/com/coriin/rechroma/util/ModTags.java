package com.coriin.rechroma.util;

import com.coriin.rechroma.ReChroma;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public  static  class  Items{
        public  static final TagKey<Item> CRYSTAL_SHARDS = createTag("crystal_shards");
        public static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ReChroma.MOD_ID, name));
        }
    }


    public  static  class  Blocks{

        public static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ReChroma.MOD_ID, name));
        }
    }
}
