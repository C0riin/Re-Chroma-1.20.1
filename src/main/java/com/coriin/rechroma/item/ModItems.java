package com.coriin.rechroma.item;

import com.coriin.rechroma.ReChroma;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static Item ENERGY_MANIPULATOR = registerItem("energy_manipulator", new Item(new FabricItemSettings().
            rarity(Rarity.COMMON).maxCount(1)));
    public static Item SNOW_BIRD = registerItem("snow_bird", new Item(new FabricItemSettings().
            rarity(Rarity.COMMON).maxCount(999)));

    // shards
    public static Item BLACK_CRYSTAL_SHARD = registerItem("black_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item BLUE_CRYSTAL_SHARD = registerItem("blue_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item BROWN_CRYSTAL_SHARD = registerItem("brown_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item CYAN_CRYSTAL_SHARD = registerItem("cyan_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item GRAY_CRYSTAL_SHARD = registerItem("gray_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item GREEN_CRYSTAL_SHARD = registerItem("green_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item LIGHTBLUE_CRYSTAL_SHARD = registerItem("lightblue_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item LIGHTGRAY_CRYSTAL_SHARD = registerItem("lightgray_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item LIME_CRYSTAL_SHARD = registerItem("lime_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item MAGENTA_CRYSTAL_SHARD = registerItem("magenta_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item ORANGE_CRYSTAL_SHARD = registerItem("orange_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item PINK_CRYSTAL_SHARD = registerItem("pink_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item PURPLE_CRYSTAL_SHARD = registerItem("purple_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item RED_CRYSTAL_SHARD = registerItem("red_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item WHITE_CRYSTAL_SHARD = registerItem("white_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));
    public static Item YELLOW_CRYSTAL_SHARD = registerItem("yellow_crystal_shard", new Item(new FabricItemSettings().
            rarity(Rarity.UNCOMMON)));

    private static void addItemsToIngridientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(ENERGY_MANIPULATOR);
        entries.add(SNOW_BIRD);
    }

    private  static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ReChroma.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ReChroma.LOGGER.info("Registering Mod Items for " + ReChroma.MOD_ID);


        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientTabItemGroup);
    }

}
