package net.themouselord.cosmereitems.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.themouselord.cosmereitems.CosmereItems;

public class ModItemGroup {
    public static final ItemGroup ALLOMANCY = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"allomancy"),()-> new ItemStack(ModItems.TIN_INGOT));

    public static final ItemGroup FERUCHEMY = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"feruchemy"),()-> new ItemStack(ModItems.TIN_NUGGET));

    public static final ItemGroup HEMALURGY = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"hemalurgy"),()-> new ItemStack(ModItems.TIN_NUGGET));

    public static final ItemGroup SEL = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"sel"),()-> new ItemStack(ModItems.TIN_NUGGET));

    public static final ItemGroup AWAKENING = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"awakening"),()-> new ItemStack(ModItems.TIN_NUGGET));

    public static final ItemGroup STORMLIGHT = FabricItemGroupBuilder.build(
            new Identifier(CosmereItems.MOD_ID,"stormlight"),()-> new ItemStack(ModItems.TIN_NUGGET));
}