package com.silliness.testminecraftmod.client;

import com.silliness.testminecraftmod.utils.Logging;
import net.fabricmc.api.ClientModInitializer;

public class Test_minecraft_modClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Logging.LOGGER.info("I'm actually making a fucking mod holy shit");
    }
}
