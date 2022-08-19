package com.kollee.tutorialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public  static final CreativeModeTab MY_TAB = new CreativeModeTab("xdTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.IDK.get());
        }
    };
}
