package io.github.kosianodangoo.closedeathscreenbutton;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = CloseDeathScreenButton.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue DISPLAY_ONLY_IF_LIVING = BUILDER.comment("Display close button only if the player is living").define("displayOnlyIfLiving", false);

    static final ForgeConfigSpec SPEC = BUILDER.build();
}
