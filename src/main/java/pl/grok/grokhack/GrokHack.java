package pl.grok.grokhack;

import net.fabricmc.api.ClientModInitializer;

public class GrokHack implements ClientModInitializer {
    public static GrokHack INSTANCE;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        System.out.println("[GrokHack] Zainicjalizowany! Pełny hacked client dla 1.21.4 gotowy.");
    }
}
