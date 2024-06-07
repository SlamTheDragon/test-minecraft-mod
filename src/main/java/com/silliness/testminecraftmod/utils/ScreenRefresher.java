package com.silliness.testminecraftmod.utils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;

public class ScreenRefresher {
    public static void refreshCurrentScreen() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.currentScreen instanceof RefreshableScreen) {
            ((RefreshableScreen) client.currentScreen).refreshWidgets();
        }
    }
}

