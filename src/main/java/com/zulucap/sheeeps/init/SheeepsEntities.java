package com.zulucap.sheeeps.init;

import com.zulucap.sheeeps.Reference;
import com.zulucap.sheeeps.configuration.ConfigurationReference;
import com.zulucap.sheeeps.configuration.SheepConfig;
import com.zulucap.sheeeps.entities.SheeepsEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.*;

/**
 * Created by Dan on 2/28/2016.
 */
public class SheeepsEntities {

    private static final Map<Integer, SheeepsEntity> sheeeps = new HashMap<Integer, SheeepsEntity>();
    private static int modEntityID = 0;

    public static void register(SheeepsEntity entity){
        sheeeps.put(entity.getId(), entity);
    }

    public static SheeepsEntity getByType(int type){
        return sheeeps.get(type);
    }

    public static Collection<SheeepsEntity> getItems(){
        return sheeeps.values();
    }

    public static void registerRenders(){
        // not used
    }

    public static void registerSheeep(){

        List<SheepConfig> configuredSheep = ConfigurationReference.getConfiguredSheep();

        SheepConfig coalConfig = configuredSheep.get(0);
        if(!coalConfig.getSheepDisabled()) {
            SheeepsEntity coalOreSheeep = new SheeepsEntity(0, "Coal Ore Sheeep", new ItemStack(SheeepsItems.coal_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/coal_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/coal_ore_sheep_fur.png"),
                    coalConfig.getMaxSpawnHeight(),
                    coalConfig.getMinSpawnHeight(),
                    coalConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(coalOreSheeep);
        }

        SheepConfig ironConfig = configuredSheep.get(1);
        if(!ironConfig.getSheepDisabled()) {
            SheeepsEntity ironOreSheeep = new SheeepsEntity(1, "Iron Ore Sheeep", new ItemStack(SheeepsItems.iron_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/iron_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/iron_ore_sheep_fur.png"),
                    ironConfig.getMaxSpawnHeight(),
                    ironConfig.getMinSpawnHeight(),
                    ironConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(ironOreSheeep);
        }

        SheepConfig goldConfig = configuredSheep.get(2);
        if(!goldConfig.getSheepDisabled()) {
            SheeepsEntity goldOreSheeep = new SheeepsEntity(2, "Gold Ore Sheeep", new ItemStack(SheeepsItems.gold_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/gold_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/gold_ore_sheep_fur.png"),
                    goldConfig.getMaxSpawnHeight(),
                    goldConfig.getMinSpawnHeight(),
                    goldConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(goldOreSheeep);
        }

        SheepConfig redstoneConfig = configuredSheep.get(3);
        if(!redstoneConfig.getSheepDisabled()) {
            SheeepsEntity redstoneOreSheeep = new SheeepsEntity(3, "Redstone Ore Sheeep", new ItemStack(SheeepsItems.redstone_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/redstone_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/redstone_ore_sheep_fur.png"),
                    redstoneConfig.getMaxSpawnHeight(),
                    redstoneConfig.getMinSpawnHeight(),
                    redstoneConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(redstoneOreSheeep);
        }

        SheepConfig lapisConfig = configuredSheep.get(4);
        if(!lapisConfig.getSheepDisabled()) {
            SheeepsEntity lapisOreSheeep = new SheeepsEntity(4, "Lapis Ore Sheeep", new ItemStack(SheeepsItems.lapis_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/lapis_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/lapis_ore_sheep_fur.png"),
                    lapisConfig.getMaxSpawnHeight(),
                    lapisConfig.getMinSpawnHeight(),
                    lapisConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(lapisOreSheeep);
        }

        SheepConfig glowstoneConfig = configuredSheep.get(5);
        if(!glowstoneConfig.getSheepDisabled()) {
            SheeepsEntity glowstoneOreSheeep = new SheeepsEntity(5, "Glowstone Ore Sheeep", new ItemStack(SheeepsItems.glowstone_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/glowstone_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/glowstone_ore_sheep_fur.png"),
                    glowstoneConfig.getMaxSpawnHeight(),
                    glowstoneConfig.getMinSpawnHeight(),
                    glowstoneConfig.getRarity(),
                    new BiomeGenBase[]{BiomeGenBase.hell}, null);
            SheeepsEntities.register(glowstoneOreSheeep);
        }

        SheepConfig diamondConfig = configuredSheep.get(6);
        if(!diamondConfig.getSheepDisabled()) {
            SheeepsEntity diamondOreSheeep = new SheeepsEntity(6, "Diamond Ore Sheeep", new ItemStack(SheeepsItems.diamond_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/diamond_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/diamond_ore_sheep_fur.png"),
                    diamondConfig.getMaxSpawnHeight(),
                    diamondConfig.getMinSpawnHeight(),
                    diamondConfig.getRarity(),
                    null,
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(diamondOreSheeep);
        }

        SheepConfig emeraldConfig = configuredSheep.get(7);
        if(!emeraldConfig.getSheepDisabled()) {
            SheeepsEntity emeraldOreSheeep = new SheeepsEntity(7, "Emerald Ore Sheeep", new ItemStack(SheeepsItems.emerald_fleece, 1), new ResourceLocation(Reference.MODID + ":textures/entity/emerald_ore_sheep_sheared.png"), new ResourceLocation(Reference.MODID + ":textures/entity/emerald_ore_sheep_fur.png"),
                    emeraldConfig.getMaxSpawnHeight(),
                    emeraldConfig.getMinSpawnHeight(),
                    emeraldConfig.getRarity(),
                    new BiomeGenBase[]{BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus},
                    new BiomeGenBase[]{BiomeGenBase.hell});
            SheeepsEntities.register(emeraldOreSheeep);
        }
    }

    public static List<SheeepsEntity> getPossibleSheeeps(BiomeGenBase biome, BlockPos pos){
        List<SheeepsEntity> result = new ArrayList<SheeepsEntity>();

        int y = pos.getY();

        for(SheeepsEntity sheeep : SheeepsEntities.getItems()){
            BiomeGenBase[] spawnBiomes = sheeep.getSpawnBiomes();
            BiomeGenBase[] excludedBiomes = sheeep.getExcludedBiomes();

            if(sheeep.getMaxSpawnHeight() >= y && sheeep.getMinSpawnHeight() <= y){
                boolean validSpawn = false;

                // Check for valid biomes
                // Default to True is not explicitly defined
                if(spawnBiomes != null && spawnBiomes.length > 0){
                    for(BiomeGenBase spawnBiome : spawnBiomes){
                        if(spawnBiome == biome) validSpawn = true;
                    }
                } else {
                    validSpawn = true;
                }

                // Check for excluded biomes
                if(excludedBiomes != null && excludedBiomes.length > 0){
                    for(BiomeGenBase excludedBiome : excludedBiomes){
                        if(excludedBiome == biome) validSpawn = false;
                    }
                }

                // Add sheeep to valid selections if valid
                if(validSpawn){
                    if(Math.random() + sheeep.getRarity() >= 1.0F) {
                        result.add(sheeep);
                    }
                }
            }
        }

        return result;
    }
}
