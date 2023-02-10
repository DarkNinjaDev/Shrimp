package com.ghost.shrimp.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SHRIMP_MOD = new CreativeModeTab("Shrimp Mod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PRAWN.get());
        }
    };
}
