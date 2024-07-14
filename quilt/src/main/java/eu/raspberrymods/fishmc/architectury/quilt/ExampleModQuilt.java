package eu.raspberrymods.fishmc.architectury.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import eu.raspberrymods.fishmc.architectury.ExampleMod;

public final class ExampleModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        ExampleMod.init();
    }
}
