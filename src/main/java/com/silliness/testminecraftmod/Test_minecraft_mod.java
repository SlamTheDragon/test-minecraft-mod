package com.silliness.testminecraftmod;

import com.silliness.testminecraftmod.utils.randomizer;
import net.fabricmc.api.ModInitializer;
import com.silliness.testminecraftmod.utils.Logging;

public class Test_minecraft_mod implements ModInitializer {


    public void onInitialize() {
        Logging.LOGGER.info("Hello Fabric world 2!");
        Logging.LOGGER.info("Imma initialize the randomizer like idk wtf lmao");
        Logging.LOGGER.info("The...");
        Logging.LOGGER.info(constants.testStringConstant, "The... \"{0}\" thing");
        new Thread(randomizer::initRandomizer).start();
    }
}
