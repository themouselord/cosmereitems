package net.themouselord.cosmereitems.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.themouselord.cosmereitems.CosmereItems;

public class ModItemGroup {
    public static final ItemGroup ALLOMANCY = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"allomancy"),()-> new ItemStack(ModItems.TIN_INGOT));
}
