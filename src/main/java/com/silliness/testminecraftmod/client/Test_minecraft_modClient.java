package com.silliness.testminecraftmod.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test_minecraft_modClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    @Override
    public void onInitializeClient() {
        LOGGER.info("I'm actually making a fucking mod holy shit");
    }
}
