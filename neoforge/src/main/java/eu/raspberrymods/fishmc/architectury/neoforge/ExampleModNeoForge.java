package eu.raspberrymods.fishmc.architectury.neoforge;

import net.neoforged.fml.common.Mod;

import eu.raspberrymods.fishmc.architectury.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
