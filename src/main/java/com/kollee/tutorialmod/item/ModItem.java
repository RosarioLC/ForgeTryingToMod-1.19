package com.kollee.tutorialmod.item;

import com.kollee.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static  final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> IDK = ITEMS.register("idk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
