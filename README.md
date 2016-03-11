# Sheeeps [1.8.9]
When sheep go exploring they find useful material that gets trapped in their wool.

Sheep are no longer satisfied with their boring lives on the surface and have begun exploring the caves and other dimensions of the Minecraft world. In their exploration they encounter valuable materials that rub off onto their wool, which can be extracted if you know how. On the surface and upper levels of caves you will find mostly iron and coal ore sheep, but as you dig deeper or venture out into other dimensions you will encounter sheep that have collected rarer materials.

## Getting Started

### Step 1:

You must first collect the raw material from the sheep. This can be done in the usual way, by killing the poor sheep (what did he ever do you?) or, once you have collected some iron, by crafting shears and shearing them. Unlike normal, boring sheep, you get fleece from shearing sheep which must first be cleaned before it can be used. To wash the fleece you need to craft a washer with various pieces of wood and a bucket. Fill the washer with water, then use a piece of fleece on the washer to get ore wool.

### Step 2:

Congratulations! You now have some ore wool.  You may use this for decoration if you wish, but to really make use of it you must first separate the ore from the wool using a separator. Crafting the separator will require a furnace, some stone and slabs, as well as an iron ingot. The separator must be powered using some form of combustible fuel in order to process the wool which you do by inserting it into the input slot of the separator. The result of the process is pure wool and ore residue which can be burned in a furnace to create useful materials.


## Usage
  - You can browse directly in GitHub, or alternatively, download it as a zip and browse it locally.

  - If you want to install it and compile it, the basic steps for beginners are:
    1. Download the project as a zip.
    2. Unzip it to an appropriate folder on your computer, such as My Documents.  (Or, if you know how to fork a project on GitHub and import it into a local git repository, you can do that instead)
    3. From the command line, run `gradlew setupDecompWorkspace` to install Forge and configure the project, this will take quite some time, maybe 20 minutes or more.
    4. From the command line, run `gradlew idea` if you are using IntelliJ IDEA, or `gradlew eclipse` if you are using Eclipse.
    5. If using IntelliJ:
        1. Open the project (open the MinecraftByExample.ipr file).
        2. It will ask you whether you want to import the "unlinked gradle project".  This is optional.  If you choose no,
           later on (when you publish your mod) you will need to package it up using the command line gradlew build, if you
           choose yes you can run the gradle build task from inside IntelliJ.  For most users, there's no other difference.
        3. If you imported the gradle project, you should run the gradle task 'getIntellijRuns' afterwards to get the Run and Debug
           configurations.
    6. If using Eclipse:
        1. Open the Project.
        2. Right click on the project, select "Run As" > "Run Configurations..."
        3. Set the main class to "GradleStart"
    7. You should be able to start Minecraft now (using the Run or Debug configuration) and the mod will be loaded.