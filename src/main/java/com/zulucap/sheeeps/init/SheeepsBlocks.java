package com.zulucap.sheeeps.init;

import com.zulucap.sheeeps.Sheeeps;
import com.zulucap.sheeeps.Reference;
import com.zulucap.sheeeps.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dan on 2/25/2016.
 */
public class SheeepsBlocks {
    public static Block iron_wool;
    public static Block diamond_wool;
    public static Block coal_wool;
    public static Block emerald_wool;
    public static Block gold_wool;
    public static Block glowstone_wool;
    public static Block redstone_wool;
    public static Block lapis_wool;

    public static Block washer;
    public static Block separator;
    public static Block separator_on_1;
    public static Block separator_on_2;

    public static void init(){
        iron_wool = new IronWool(Material.cloth).setUnlocalizedName("iron_wool").setCreativeTab(Sheeeps.tabSheeeps);
        diamond_wool = new DiamondWool(Material.cloth).setUnlocalizedName("diamond_wool").setCreativeTab(Sheeeps.tabSheeeps);
        coal_wool = new CoalWool(Material.cloth).setUnlocalizedName("coal_wool").setCreativeTab(Sheeeps.tabSheeeps);
        emerald_wool = new EmeraldWool(Material.cloth).setUnlocalizedName("emerald_wool").setCreativeTab(Sheeeps.tabSheeeps);
        gold_wool = new GoldWool(Material.cloth).setUnlocalizedName("gold_wool").setCreativeTab(Sheeeps.tabSheeeps);
        glowstone_wool = new GlowstoneWool(Material.cloth).setUnlocalizedName("glowstone_wool").setCreativeTab(Sheeeps.tabSheeeps);
        redstone_wool = new RedstoneWool(Material.cloth).setUnlocalizedName("redstone_wool").setCreativeTab(Sheeeps.tabSheeeps);
        lapis_wool = new LapisWool(Material.cloth).setUnlocalizedName("lapis_wool").setCreativeTab(Sheeeps.tabSheeeps);

        washer = new Washer(Material.wood).setUnlocalizedName("washer").setCreativeTab(Sheeeps.tabSheeeps);
        separator = new Separator().setUnlocalizedName("separator").setCreativeTab(Sheeeps.tabSheeeps);

        separator_on_1 = new Separator().setUnlocalizedName("separator_on_1");
        separator_on_2 = new Separator().setUnlocalizedName("separator_on_2");
    }

    public static void register(){
        GameRegistry.registerBlock(iron_wool, iron_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(diamond_wool, diamond_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(coal_wool, coal_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(emerald_wool, emerald_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(gold_wool, gold_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(glowstone_wool, glowstone_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(redstone_wool, redstone_wool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lapis_wool, lapis_wool.getUnlocalizedName().substring(5));

        GameRegistry.registerBlock(washer, washer.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(separator, separator.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(separator_on_1, separator_on_1.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(separator_on_2, separator_on_2.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(iron_wool);
        registerRender(diamond_wool);
        registerRender(coal_wool);
        registerRender(emerald_wool);
        registerRender(gold_wool);
        registerRender(glowstone_wool);
        registerRender(redstone_wool);
        registerRender(lapis_wool);

        registerRender(washer);
        registerRender(separator);
        registerRender(separator_on_1);
        registerRender(separator_on_2);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
