package com.zulucap.sheeeps.proxy;

import com.zulucap.sheeeps.init.SheeepsEntities;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Dan on 2/25/2016.
 */
public abstract class CommonProxy{
    public void preInit(){
        SheeepsEntities.registerSheeep();
    }

    public void init(){

    }

    public void postInit(){
        SheeepsEntities.registerModSheeep();
    }

    public abstract EntityPlayer getClientPlayer();

    public abstract void registerRenders();
}
