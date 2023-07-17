package name.firstmod.item;

import name.firstmod.FirstMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENDSTRING = registerItem("endstring", new Item(new FabricItemSettings()));
    public static final Item SHORTBOW = registerItem("chorus_shortbow", new Item(new FabricItemSettings()));
    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries){
        entries.add(SHORTBOW);
    }
    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(ENDSTRING);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    };
    public static void registerModItems(){
        FirstMod.LOGGER.info("Registering Mod items for "+FirstMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
