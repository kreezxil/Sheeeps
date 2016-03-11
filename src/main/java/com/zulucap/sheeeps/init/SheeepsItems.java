package com.zulucap.sheeeps.init;

import com.zulucap.sheeeps.Sheeeps;
import com.zulucap.sheeeps.Reference;
import com.zulucap.sheeeps.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Dan on 2/25/2016.
 */
public class SheeepsItems {

    /* Fleece */
    public static Item iron_fleece;
    public static Item diamond_fleece;
    public static Item coal_fleece;
    public static Item emerald_fleece;
    public static Item gold_fleece;
    public static Item glowstone_fleece;
    public static Item redstone_fleece;
    public static Item lapis_fleece;

    /* Residue */
    public static Item iron_residue;
    public static Item diamond_residue;
    public static Item coal_residue;
    public static Item emerald_residue;
    public static Item gold_residue;
    public static Item glowstone_residue;
    public static Item redstone_residue;
    public static Item lapis_residue;

    /* Spawn Eggs */
    public static Item iron_spawn_egg;
    public static Item diamond_spawn_egg;
    public static Item coal_spawn_egg;
    public static Item emerald_spawn_egg;
    public static Item gold_spawn_egg;
    public static Item glowstone_spawn_egg;
    public static Item redstone_spawn_egg;
    public static Item lapis_spawn_egg;

    public static void init(){
        /* Fleece */
        iron_fleece = new IronFleece().setUnlocalizedName("iron_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        diamond_fleece = new DiamondFleece().setUnlocalizedName("diamond_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        coal_fleece = new CoalFleece().setUnlocalizedName("coal_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        emerald_fleece = new EmeraldFleece().setUnlocalizedName("emerald_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        gold_fleece = new GoldFleece().setUnlocalizedName("gold_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        glowstone_fleece = new GlowstoneFleece().setUnlocalizedName("glowstone_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        redstone_fleece = new RedstoneFleece().setUnlocalizedName("redstone_fleece").setCreativeTab(Sheeeps.tabSheeeps);
        lapis_fleece = new LapisFleece().setUnlocalizedName("lapis_fleece").setCreativeTab(Sheeeps.tabSheeeps);

        /* Residue */
        iron_residue = new IronResidue().setUnlocalizedName("iron_residue").setCreativeTab(Sheeeps.tabSheeeps);
        diamond_residue = new DiamondResidue().setUnlocalizedName("diamond_residue").setCreativeTab(Sheeeps.tabSheeeps);
        coal_residue = new CoalResidue().setUnlocalizedName("coal_residue").setCreativeTab(Sheeeps.tabSheeeps);
        emerald_residue = new EmeraldResidue().setUnlocalizedName("emerald_residue").setCreativeTab(Sheeeps.tabSheeeps);
        gold_residue = new GoldResidue().setUnlocalizedName("gold_residue").setCreativeTab(Sheeeps.tabSheeeps);
        glowstone_residue = new GlowstoneResidue().setUnlocalizedName("glowstone_residue").setCreativeTab(Sheeeps.tabSheeeps);
        redstone_residue = new RedstoneResidue().setUnlocalizedName("redstone_residue").setCreativeTab(Sheeeps.tabSheeeps);
        lapis_residue = new LapisResidue().setUnlocalizedName("lapis_residue").setCreativeTab(Sheeeps.tabSheeeps);

        /* Spawn Eggs */
        iron_spawn_egg = new IronSpawnEgg().setUnlocalizedName("iron_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        diamond_spawn_egg = new DiamondSpawnEgg().setUnlocalizedName("diamond_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        coal_spawn_egg = new CoalSpawnEgg().setUnlocalizedName("coal_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        emerald_spawn_egg = new EmeraldSpawnEgg().setUnlocalizedName("emerald_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        gold_spawn_egg = new GoldSpawnEgg().setUnlocalizedName("gold_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        glowstone_spawn_egg = new GlowstoneSpawnEgg().setUnlocalizedName("glowstone_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        redstone_spawn_egg = new RedstoneSpawnEgg().setUnlocalizedName("redstone_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
        lapis_spawn_egg = new LapisSpawnEgg().setUnlocalizedName("lapis_spawn_egg").setCreativeTab(Sheeeps.tabSheeeps);
    }

    public static void register(){
        /* Fleece */
        GameRegistry.registerItem(iron_fleece, iron_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(diamond_fleece, diamond_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(coal_fleece, coal_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_fleece, emerald_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(gold_fleece, gold_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(glowstone_fleece, glowstone_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(redstone_fleece, redstone_fleece.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_fleece, lapis_fleece.getUnlocalizedName().substring(5));

        /* Residue */
        GameRegistry.registerItem(iron_residue, iron_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(diamond_residue, diamond_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(coal_residue, coal_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_residue, emerald_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(gold_residue, gold_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(glowstone_residue, glowstone_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(redstone_residue, redstone_residue.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_residue, lapis_residue.getUnlocalizedName().substring(5));

        /* Spawn Eggs */
        GameRegistry.registerItem(iron_spawn_egg, iron_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(diamond_spawn_egg, diamond_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(coal_spawn_egg, coal_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_spawn_egg, emerald_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(gold_spawn_egg, gold_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(glowstone_spawn_egg, glowstone_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(redstone_spawn_egg, redstone_spawn_egg.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_spawn_egg, lapis_spawn_egg.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        /* Fleece */
        registerRender(iron_fleece);
        registerRender(diamond_fleece);
        registerRender(coal_fleece);
        registerRender(emerald_fleece);
        registerRender(gold_fleece);
        registerRender(glowstone_fleece);
        registerRender(redstone_fleece);
        registerRender(lapis_fleece);

        /* Residue */
        registerRender(iron_residue);
        registerRender(diamond_residue);
        registerRender(coal_residue);
        registerRender(emerald_residue);
        registerRender(gold_residue);
        registerRender(glowstone_residue);
        registerRender(redstone_residue);
        registerRender(lapis_residue);

        /* Spawn Eggs */
        registerRender(iron_spawn_egg);
        registerRender(diamond_spawn_egg);
        registerRender(coal_spawn_egg);
        registerRender(emerald_spawn_egg);
        registerRender(gold_spawn_egg);
        registerRender(glowstone_spawn_egg);
        registerRender(redstone_spawn_egg);
        registerRender(lapis_spawn_egg);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
