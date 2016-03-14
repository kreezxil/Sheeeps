package com.zulucap.sheeeps.items;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Dan on 3/13/2016.
 */
public class ModOreRegistry {

    private static final ModOreRegistry modOreBase = new ModOreRegistry();
    private static ArrayList<String> modOreList = new ArrayList<String>();

    public static ModOreRegistry instance()
    {
        return modOreBase;
    }

    public ModOreRegistry(){
        if(OreDictionary.getOres("ingotCopper").size() > 0){
            registerOre("");
        }

        if(OreDictionary.getOres("ingotTin").size() > 0){

        }

        if(OreDictionary.getOres("ingotNickel").size() > 0){

        }

        if(OreDictionary.getOres("ingotLead").size() > 0){

        }

        if(OreDictionary.getOres("ingotSilver").size() > 0){

        }

        if(OreDictionary.getOres("ingotPlatinum").size() > 0){

        }

        if(OreDictionary.getOres("ingotArdite").size() > 0){

        }

        if(OreDictionary.getOres("ingotCobalt").size() > 0){

        }
    }

    public static void registerOre(String oreName){
        modOreList.add(oreName);
    }
}
