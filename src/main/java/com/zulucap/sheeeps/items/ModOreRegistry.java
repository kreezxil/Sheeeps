package com.zulucap.sheeeps.items;

import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;

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

    }

    public static void registerOre(String oreName){
        modOreList.add(oreName);
    }
}
