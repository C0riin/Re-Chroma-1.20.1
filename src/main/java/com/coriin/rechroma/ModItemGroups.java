package com.coriin.rechroma;

import com.coriin.rechroma.block.ModBlocks;
import com.coriin.rechroma.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RECHROMA_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ReChroma.MOD_ID, "rechroma_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rechroma_items")).icon(() ->
                    new ItemStack(ModItems.ENERGY_MANIPULATOR)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.ENERGY_MANIPULATOR));
                        entries.add(new ItemStack(ModItems.SNOW_BIRD));

                        // shards
                        entries.add(new ItemStack(ModItems.BLACK_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.BLUE_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.BROWN_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.CYAN_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.GRAY_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.GREEN_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.LIGHTBLUE_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.LIGHTGRAY_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.LIME_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.MAGENTA_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.ORANGE_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.PINK_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.PURPLE_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.RED_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.WHITE_CRYSTAL_SHARD));
                        entries.add(new ItemStack(ModItems.YELLOW_CRYSTAL_SHARD));


                    }).build());

    public static final ItemGroup RECHROMA_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ReChroma.MOD_ID, "rechroma_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rechroma_blocks")).icon(() ->
                    new ItemStack(ModBlocks.CRYSTALLINE_STONE_BLOCK)).entries((displayContext, entries) -> {
                    entries.add(ModBlocks.SNOW_BIRD_BLOCK);
                    entries.add(ModBlocks.CRYSTALLINE_STONE_BLOCK);




            }).build());

    public static void registerItemGroups() {
        ReChroma.LOGGER.info("Registering Item Groups for " + ReChroma.MOD_ID);
    }

}
