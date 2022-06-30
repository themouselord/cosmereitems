package net.themouselord.cosmereitems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.themouselord.cosmereitems.CosmereItems;

public class ModItems {

    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item PEWTER_INGOT = registerItem("pewter_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ZINC_INGOT = registerItem("zinc_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item DURALUMIN_INGOT = registerItem("duralumin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item NICROSIL_INGOT = registerItem("nicrosil_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item CADMIUM_INGOT = registerItem("cadmium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BENDALLOY_INGOT = registerItem("bendalloy_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item PEWTER_NUGGET = registerItem("pewter_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ZINC_NUGGET = registerItem("zinc_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item DURALUMIN_NUGGET = registerItem("duralumin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item NICROSIL_NUGGET = registerItem("nicrosil_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item CHROMIUM_NUGGET = registerItem("chromium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item CADMIUM_NUGGET = registerItem("cadmium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BENDALLOY_NUGGET = registerItem("bendalloy_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ALLOMANCY)));

    public static final Item IRON_BRACELET = registerItem("iron_bracelet",
            new Item(new FabricItemSettings().group(ModItemGroup.FERUCHEMY)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CosmereItems.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CosmereItems.LOGGER.debug("Registering Mod Items for " + CosmereItems.MOD_ID);
    }
}
