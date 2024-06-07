package com.silliness.testminecraftmod.utils;

import static com.silliness.testminecraftmod.constants.*;

public class randomizer {

    private volatile boolean angleA = false;
    private volatile boolean angleB = false;
    private volatile boolean angleC = true;
    private volatile boolean angleD = false;

    public void Bounce()
    {
        Logging.LOGGER.info("================[       ]============");
        Logging.LOGGER.info(String.valueOf(angleA));
        Logging.LOGGER.info(String.valueOf(angleB));
        Logging.LOGGER.info(String.valueOf(angleC));
        Logging.LOGGER.info(String.valueOf(angleD));
        Logging.LOGGER.info("================[ BUTTON POS");
        Logging.LOGGER.info(String.valueOf(buttonY));
        Logging.LOGGER.info(String.valueOf(buttonY));
        Logging.LOGGER.info("================[ SCREEN SIZE");
        Logging.LOGGER.info(String.valueOf(currentScreenX));
        Logging.LOGGER.info(String.valueOf(currentScreenY));
        Logging.LOGGER.info("================[       ]============");


        this.QueryPostion();

        if (this.angleA) {
            buttonY = buttonY - 50;
            buttonX = buttonX + 50;
        }
        if (this.angleB) {
            buttonY = buttonY + 50;
            buttonX = buttonX + 50;
        }
        if (this.angleC) {
            buttonY = buttonY + 50;
            buttonX = buttonX - 50;
        }
        if (this.angleD) {
            buttonY = buttonY - 50;
            buttonX = buttonX - 50;
        }
    }

    private void QueryPostion() {
        // top wall
        if (buttonY <= 0) {
            if (this.angleA) {
                this.angleA = false;
                this.angleB = true;
            }
            if (this.angleD) {
                this.angleD = false;
                this.angleC = true;
            }
        }

        // right wall
        if (buttonX >= currentScreenY) {
            if (this.angleA) {
                this.angleA = false;
                this.angleD = true;
            }
            if (this.angleB) {
                this.angleB = false;
                this.angleC = true;
            }
        }

        // bottom wall
        if (buttonY >= currentScreenX) {
            if (this.angleB) {
                this.angleB = false;
                this.angleA = true;
            }
            if (this.angleC) {
                this.angleC = false;
                this.angleD = true;
            }
        }

        // left wall
        if (buttonX <= 0) {
            if (this.angleC) {
                this.angleC = false;
                this.angleB = true;
            }
            if (this.angleD) {
                this.angleD = false;
                this.angleA = true;
            }
        }
    }

    public void initRandomizer() {
        while (true) {
            try {
                ScreenRefresher.refreshCurrentScreen();
                this.Bounce();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Logging.LOGGER.warn(String.valueOf(e));
            }
        }
    }
}
