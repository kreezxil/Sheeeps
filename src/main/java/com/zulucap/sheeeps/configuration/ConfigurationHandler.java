package com.zulucap.sheeeps.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Dan on 3/9/2016.
 */
public class ConfigurationHandler {
    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);

        try{
            // Load the config file
            configuration.load();

            // Read in properties
            ConfigurationReference.setSheepDensity(configuration.get(Configuration.CATEGORY_GENERAL, "sheepDensity", 50, "Sets the spawn density for Sheeeps").getInt(40));

            // Create new sheep, push to config reference sheep array
            // Coal Sheep
            SheepConfig coalSheep = new SheepConfig();
            coalSheep.setSheepDisabled(configuration.get("Config Coal Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            coalSheep.setMinSpawnHeight(configuration.get("Config Coal Sheep", "Min Spawn Height", 40, "Sets the minimum height this sheep will spawn").getInt());
            coalSheep.setMaxSpawnHeight(configuration.get("Config Coal Sheep", "Max Spawn Height", 255, "Sets the maximum height this sheep will spawn").getInt());
            coalSheep.setRarity(configuration.get("Config Coal Sheep", "Rarity", 10, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(coalSheep);

            // Iron Sheep
            SheepConfig ironSheep = new SheepConfig();
            ironSheep.setSheepDisabled(configuration.get("Config Iron Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            ironSheep.setMinSpawnHeight(configuration.get("Config Iron Sheep", "Min Spawn Height", 40, "Sets the minimum height this sheep will spawn").getInt());
            ironSheep.setMaxSpawnHeight(configuration.get("Config Iron Sheep", "Max Spawn Height", 80, "Sets the maximum height this sheep will spawn").getInt());
            ironSheep.setRarity(configuration.get("Config Iron Sheep", "Rarity", 8, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(ironSheep);

            // Gold Sheep
            SheepConfig goldSheep = new SheepConfig();
            goldSheep.setSheepDisabled(configuration.get("Config Gold Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            goldSheep.setMinSpawnHeight(configuration.get("Config Gold Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            goldSheep.setMaxSpawnHeight(configuration.get("Config Gold Sheep", "Max Spawn Height", 40, "Sets the maximum height this sheep will spawn").getInt());
            goldSheep.setRarity(configuration.get("Config Gold Sheep", "Rarity", 6, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(goldSheep);

            // Redstone Sheep
            SheepConfig redstoneSheep = new SheepConfig();
            redstoneSheep.setSheepDisabled(configuration.get("Config Redstone Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            redstoneSheep.setMinSpawnHeight(configuration.get("Config Redstone Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            redstoneSheep.setMaxSpawnHeight(configuration.get("Config Redstone Sheep", "Max Spawn Height", 40, "Sets the maximum height this sheep will spawn").getInt());
            redstoneSheep.setRarity(configuration.get("Config Redstone Sheep", "Rarity", 6, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(redstoneSheep);

            // Lapis Sheep
            SheepConfig lapisSheep = new SheepConfig();
            lapisSheep.setSheepDisabled(configuration.get("Config Lapis Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            lapisSheep.setMinSpawnHeight(configuration.get("Config Lapis Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            lapisSheep.setMaxSpawnHeight(configuration.get("Config Lapis Sheep", "Max Spawn Height", 40, "Sets the maximum height this sheep will spawn").getInt());
            lapisSheep.setRarity(configuration.get("Config Lapis Sheep", "Rarity", 4, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(lapisSheep);

            // Glowstone Sheep
            SheepConfig glowstoneSheep = new SheepConfig();
            glowstoneSheep.setSheepDisabled(configuration.get("Config Glowstone Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            glowstoneSheep.setMinSpawnHeight(configuration.get("Config Glowstone Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            glowstoneSheep.setMaxSpawnHeight(configuration.get("Config Glowstone Sheep", "Max Spawn Height", 128, "Sets the maximum height this sheep will spawn").getInt());
            glowstoneSheep.setRarity(configuration.get("Config Glowstone Sheep", "Rarity", 10, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(glowstoneSheep);

            // Diamond Sheep
            SheepConfig diamondSheep = new SheepConfig();
            diamondSheep.setSheepDisabled(configuration.get("Config Diamond Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            diamondSheep.setMinSpawnHeight(configuration.get("Config Diamond Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            diamondSheep.setMaxSpawnHeight(configuration.get("Config Diamond Sheep", "Max Spawn Height", 20, "Sets the maximum height this sheep will spawn").getInt());
            diamondSheep.setRarity(configuration.get("Config Diamond Sheep", "Rarity", 4, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(diamondSheep);

            // Emerald Sheep
            SheepConfig emeraldSheep = new SheepConfig();
            emeraldSheep.setSheepDisabled(configuration.get("Config Emerald Sheep", "Disabled", false, "Toggles the ability to spawn naturally").getBoolean());
            emeraldSheep.setMinSpawnHeight(configuration.get("Config Emerald Sheep", "Min Spawn Height", 0, "Sets the minimum height this sheep will spawn").getInt());
            emeraldSheep.setMaxSpawnHeight(configuration.get("Config Emerald Sheep", "Max Spawn Height", 20, "Sets the maximum height this sheep will spawn").getInt());
            emeraldSheep.setRarity(configuration.get("Config Emerald Sheep", "Rarity", 4, "Sets the chance that this sheep has to be available to spawn. (0-10)").getInt()/10.0F);

            ConfigurationReference.registerSheep(emeraldSheep);

        } catch (Exception e){
            // Log exception
            System.out.println("There was an exception: " + e.toString());
        } finally {
            // Save configuration
            configuration.save();
        }
    }
}
