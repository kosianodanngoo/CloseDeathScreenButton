package io.github.kosianodangoo.closedeathscreenbutton;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(CloseDeathScreenButton.MODID)
public class CloseDeathScreenButton {
    public static final String MODID = "close_death_screen_button";

    public CloseDeathScreenButton() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.SPEC);
    }
}
