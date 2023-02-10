package com.ghost.shrimp.item;

import com.ghost.shrimp.Shrimp;
import com.ghost.shrimp.item.custom.FossilFinderItem;
import com.ghost.shrimp.item.custom.JavaMossItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shrimp.MOD_ID);

    public static final RegistryObject<Item> SHRIMP_SHELL_RED = ITEMS.register("shrimp_shell_red",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_BLUE = ITEMS.register("shrimp_shell_blue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_YELLOW = ITEMS.register("shrimp_shell_yellow",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_GREEN = ITEMS.register("shrimp_shell_green",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_ORANGE = ITEMS.register("shrimp_shell_orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_BLACK = ITEMS.register("shrimp_shell_black",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_WHITE = ITEMS.register("shrimp_shell_white",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_CLEAR = ITEMS.register("shrimp_shell_clear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));




    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_RED = ITEMS.register("shrimp_shell_fragment_red",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_BLUE = ITEMS.register("shrimp_shell_fragment_blue",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_YELLOW = ITEMS.register("shrimp_shell_fragment_yellow",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_ORANGE = ITEMS.register("shrimp_shell_fragment_orange",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_GREEN = ITEMS.register("shrimp_shell_fragment_green",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_WHITE = ITEMS.register("shrimp_shell_fragment_white",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_BLACK = ITEMS.register("shrimp_shell_fragment_black",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));

    public static final RegistryObject<Item> SHRIMP_SHELL_FRAGMENT_CLEAR = ITEMS.register("shrimp_shell_fragment_clear",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));


    public static final RegistryObject<Item> FOSSIL_FINDER = ITEMS.register("fossil_finder",
            () -> new FossilFinderItem(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));


    public static final RegistryObject<Item> GOLDEN_PRAWN = ITEMS.register("golden_prawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD).food(ModFoods.GOLDEN_PRAWN)));

    public static final RegistryObject<Item> PRAWN = ITEMS.register("prawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD).food(ModFoods.PRAWN)));


    public static final RegistryObject<Item> JAVA_MOSS = ITEMS.register("java_moss",
            () -> new JavaMossItem(new Item.Properties().tab(ModCreativeModeTab.SHRIMP_MOD)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
