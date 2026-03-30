package pl.grok.grokhack;

public abstract class Module {
    protected String name;
    protected boolean enabled = false;

    public Module(String name) {
        this.name = name;
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) onEnable();
        else onDisable();
    }

    protected void onEnable() {}
    protected void onDisable() {}
    public void onTick() {}
}
