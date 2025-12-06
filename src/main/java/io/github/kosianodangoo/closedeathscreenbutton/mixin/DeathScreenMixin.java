package io.github.kosianodangoo.closedeathscreenbutton.mixin;

import io.github.kosianodangoo.closedeathscreenbutton.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.DeathScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(DeathScreen.class)
public class DeathScreenMixin extends Screen {

    protected DeathScreenMixin(Component p_96550_) {
        super(p_96550_);
    }

    @Inject(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/DeathScreen;setButtonsActive(Z)V"))
    public void initMixin(CallbackInfo ci) {
        if(Config.DISPLAY_ONLY_IF_LIVING.get() && Minecraft.getInstance().player != null && !Minecraft.getInstance().player.isDeadOrDying()) return;
        this.addRenderableWidget(Button.builder(
                Component.translatable("deathScreen.close_death_screen_button.close_death_screen"), (button) -> {
                    this.onClose();
                }).bounds(this.width / 2 - 100, this.height / 4 + 120, 200, 20).build());
    }
}
