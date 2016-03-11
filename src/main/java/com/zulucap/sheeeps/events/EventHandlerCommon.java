package com.zulucap.sheeeps.events;

import com.zulucap.sheeeps.configuration.ConfigurationReference;
import com.zulucap.sheeeps.entities.EntityOreSheep;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

/**
 * Created by Dan on 3/6/2016.
 */
public class EventHandlerCommon {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onLivingSpawn(LivingSpawnEvent e){
        Entity dude = e.entity;
    }

    // Do not allow more than 40 ore sheep to spawn within the vicinity of a player on the surface
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onCheckSpawn(LivingSpawnEvent.CheckSpawn e){
        Entity dude = e.entity;
        if(dude instanceof EntityOreSheep){
            List<EntityOreSheep> loadedSheeeps = e.world.getEntitiesWithinAABB(EntityOreSheep.class, new AxisAlignedBB(e.entity.getPosition().getX() + 128, 0, e.entity.getPosition().getZ() + 128, e.entity.getPosition().getX() - 128, 255, e.entity.getPosition().getZ() - 128));
            if(loadedSheeeps.size() > ConfigurationReference.getSheepDensity()) e.setResult(Event.Result.DENY);
        }

    }

}
