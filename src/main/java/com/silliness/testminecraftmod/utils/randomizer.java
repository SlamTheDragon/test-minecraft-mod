package com.silliness.testminecraftmod.utils;

import java.util.Random;

import static com.silliness.testminecraftmod.constants.buttonX;
import static com.silliness.testminecraftmod.constants.buttonY;
import com.silliness.testminecraftmod.mixin.mainMenuButton;

public class randomizer {
    public static void initRandomizer() {
        Random random = new Random();

        while (true) {
            try {
                buttonX = random.nextInt(1920) + 1;
                buttonY = random.nextInt(1080) + 1;
                Thread.sleep(100);
                ScreenRefresher.refreshCurrentScreen();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
