package com.coriin.rechroma;

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
                    }).build());

    public static void registerItemGroups() {
        ReChroma.LOGGER.info("Registering Item Groups for " + ReChroma.MOD_ID);
    }

}
