package com.coriin.rechroma.block;

import com.coriin.rechroma.ReChroma;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModBlocks {

    public static final Block SNOW_BIRD_BLOCK = registerBlock("snow_bird_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.MUD)), Rarity.EPIC);

    public static final Block CRYSTALLINE_STONE_BLOCK = registerBlock("crystalline_stone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)), Rarity.UNCOMMON);

    private static Item registerBlockItem(String name, Block block, Rarity rarity){
        return Registry.register(Registries.ITEM, new Identifier(ReChroma.MOD_ID, name), new BlockItem(block, new FabricItemSettings().rarity(rarity)));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block, Rarity.COMMON);
        return Registry.register(Registries.BLOCK, new Identifier(ReChroma.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, Rarity rarity){
        registerBlockItem(name, block, rarity);
        return Registry.register(Registries.BLOCK, new Identifier(ReChroma.MOD_ID, name), block);
    }

    public static void  registerModBlocks(){

        ReChroma.LOGGER.info("Registering Mod Blocks for "+ ReChroma.MOD_ID);



    }
}
