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
