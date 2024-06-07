package com.silliness.testminecraftmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_minecraft_mod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    public void onInitialize() {
        LOGGER.info("Hello Fabric world 2!");
    }
}
