package com.ghost.shrimp.block;

import com.ghost.shrimp.Shrimp;
import com.ghost.shrimp.block.custom.BreathingBlock;
import com.ghost.shrimp.block.custom.VisionBlock;
import com.ghost.shrimp.item.ModCreativeModeTab;
import com.ghost.shrimp.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Shrimp.MOD_ID);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_RED = registerBlock("shrimp_shell_block_red",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_BLUE = registerBlock("shrimp_shell_block_blue",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_YELLOW = registerBlock("shrimp_shell_block_yellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_GREEN = registerBlock("shrimp_shell_block_green",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_ORANGE = registerBlock("shrimp_shell_block_orange",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_WHITE = registerBlock("shrimp_shell_block_white",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_BLACK = registerBlock("shrimp_shell_block_black",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_SHELL_BLOCK_CLEAR = registerBlock("shrimp_shell_block_clear",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);




    public static final RegistryObject<Block> SHRIMP_FOSSIL_RED = registerBlock("shrimp_fossil_red",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_BLUE = registerBlock("shrimp_fossil_blue",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_YELLOW = registerBlock("shrimp_fossil_yellow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_GREEN = registerBlock("shrimp_fossil_green",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_ORANGE = registerBlock("shrimp_fossil_orange",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_BLACK = registerBlock("shrimp_fossil_black",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_WHITE = registerBlock("shrimp_fossil_white",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> SHRIMP_FOSSIL_CLEAR = registerBlock("shrimp_fossil_clear",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);


    public static final RegistryObject<Block> BREATHING_BLOCK = registerBlock("breathing_block",
            () -> new BreathingBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> VISION_BLOCK = registerBlock("vision_block",
            () -> new VisionBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD = registerBlock("rho_wood",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_STAIRS = registerBlock("rho_wood_stairs",
            () -> new StairBlock(() -> ModBlocks.RHO_WOOD.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_SLAB = registerBlock("rho_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_FENCE = registerBlock("rho_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_FENCE_GATE = registerBlock("rho_wood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_WALL = registerBlock("rho_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_BUTTON = registerBlock("rho_wood_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_PRESSURE_PLATE = registerBlock("rho_wood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_DOOR = registerBlock("rho_wood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.SHRIMP_MOD);

    public static final RegistryObject<Block> RHO_WOOD_TRAPDOOR = registerBlock("rho_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.SHRIMP_MOD);






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
