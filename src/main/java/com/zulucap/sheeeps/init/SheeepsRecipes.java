package com.zulucap.sheeeps.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dan on 3/5/2016.
 */
public class SheeepsRecipes {

    public static void init(){}

    public static void register(){
        //addWoolRecipes();     // Possible Easy mode?
        addMachineRecipes();
        addFurnaceRecipes();
    }

    public static void addWoolRecipes(){
        //Iron Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.iron_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.iron_fleece
        });

        //Diamond Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.diamond_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.diamond_fleece
        });

        //Coal Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.coal_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.coal_fleece
        });

        //Emerald Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.emerald_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.emerald_fleece
        });

        //Gold Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.gold_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.gold_fleece
        });

        //Glowstone Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.glowstone_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.glowstone_fleece
        });

        //Redstone Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.redstone_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.redstone_fleece
        });

        //Lapis Wool
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.lapis_wool), new Object[]{
                "FF",
                "FF",
                    'F', SheeepsItems.lapis_fleece
        });
    }

    public static void addMachineRecipes(){
        // Separator
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.separator), new Object[]{
                "CCC",
                "CFC",
                "SIS",
                'C', Blocks.cobblestone,
                'F', Blocks.furnace,
                'S', Blocks.stone_slab,
                'I', Items.iron_ingot
        });

        // Washer
        GameRegistry.addRecipe(new ItemStack(SheeepsBlocks.washer), new Object[]{
                "PBP",
                "PLP",
                "S.S",
                'P', Blocks.planks,
                'B', Items.bucket,
                'L', Blocks.wooden_slab,
                'S', Items.stick
        });
    }

    public static void addFurnaceRecipes(){
        // Use coal fleece as fuel
        IFuelHandler coalFleeceFuelHandler = new IFuelHandler() {
            @Override
            public int getBurnTime(ItemStack fuel) {
                final int BURN_TIME_SECONDS = 20;
                final int TICKS_PER_SECOND = 20;
                if (fuel != null && fuel.getItem() == SheeepsItems.coal_fleece) {
                    return BURN_TIME_SECONDS * TICKS_PER_SECOND;
                } else {
                    return 0;
                }
            }
        };
        GameRegistry.registerFuelHandler(coalFleeceFuelHandler);

        final float WOOL_SMELT_XP = 0.0F;   // negative XP would probably cause a problem :)

        // Vanilla Ores
        GameRegistry.addSmelting(SheeepsItems.iron_residue, new ItemStack(Items.iron_ingot, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.diamond_residue, new ItemStack(Items.diamond, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.coal_residue, new ItemStack(Blocks.coal_block, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.emerald_residue, new ItemStack(Items.emerald, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.gold_residue, new ItemStack(Items.gold_ingot, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.glowstone_residue, new ItemStack(Blocks.glowstone, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.redstone_residue, new ItemStack(Blocks.redstone_block, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.lapis_residue, new ItemStack(Items.dye, 8, 4), WOOL_SMELT_XP);

        /*
        // Mod Ores - get result type from ore dict
        GameRegistry.addSmelting(SheeepsItems.copper_residue, new ItemStack(Items.iron_ingot, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.tin_residue, new ItemStack(Items.diamond, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.nickel_residue, new ItemStack(Blocks.coal_block, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.lead_residue, new ItemStack(Items.emerald, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.silver_residue, new ItemStack(Items.gold_ingot, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.platinum_residue, new ItemStack(Blocks.glowstone, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.ardite_residue, new ItemStack(Blocks.redstone_block, 1), WOOL_SMELT_XP);
        GameRegistry.addSmelting(SheeepsItems.cobalt_residue, new ItemStack(Items.dye, 8, 4), WOOL_SMELT_XP);
        */
    }
}
