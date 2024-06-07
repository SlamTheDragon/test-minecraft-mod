package com.silliness.testminecraftmod.mixin;

import com.silliness.testminecraftmod.utils.RefreshableScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.silliness.testminecraftmod.constants.buttonX;
import static com.silliness.testminecraftmod.constants.buttonY;

@Mixin(TitleScreen.class)
public abstract class mainMenuButton extends Screen implements RefreshableScreen {
    @Shadow protected abstract void initWidgetsNormal(int y, int spacingY);

    protected mainMenuButton(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "initWidgetsNormal")

    private void addModsButton(int y, int spacingY, CallbackInfo ci) {
        this.addDrawableChild(ButtonWidget.builder(Text.translatable("silliness.customButton"), (button) -> {
            this.client.setScreen(new SelectWorldScreen(this));
        }).dimensions(this.width / buttonX, buttonY, 250, 50).build());
    }

    @Override
    public void refreshWidgets() {
        this.clearChildren();
        this.initWidgetsNormal(0, 0);  // Use the original method signature
    }
}
