package com.cobbleone.template;


import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;
import java.util.logging.Level;

/**
 * Minimal example plugin entry point.
 */
public class ExamplePlugin extends JavaPlugin {

    private static ExamplePlugin instance;

    /**
     * Creates the example plugin.
     *
     * @param init plugin initialization context supplied by Hytale
     */
    public ExamplePlugin(@Nonnull JavaPluginInit init) {
        super(init);
        instance = this;
    }

    /**
     * Returns the active example plugin instance.
     *
     * @return the active plugin instance
     */
    public static ExamplePlugin get() {
        return instance;
    }

    @Override
    protected void setup() {
        getEventRegistry().register(Nonnull.class, event -> getLogger().at(Level.INFO).log("PLUGIN BOOTED!!!!"));
    }
}
