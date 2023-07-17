package name.firstmod.item;

import name.firstmod.FirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup MODDED_WEAPONS = Registry.register(Registries.ITEM_GROUP,
    new Identifier(FirstMod.MOD_ID,"mod_weapons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod_weapons"))
                    .icon(() -> new ItemStack(ModItems.SHORTBOW)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SHORTBOW);

    }).build());
    public static final ItemGroup MODDED_MATERIALS = Registry.register(Registries.ITEM_GROUP,
    new Identifier(FirstMod.MOD_ID,"mod_materials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mod_materials"))
                    .icon(() -> new ItemStack(ModItems.ENDSTRING)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDSTRING);

    }).build());
    public static void registerItemGroups(){
        FirstMod.LOGGER.info("Registering Item Groups for "+ FirstMod.MOD_ID);
    }
}
