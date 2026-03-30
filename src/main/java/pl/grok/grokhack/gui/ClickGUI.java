package pl.grok.grokhack.gui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ClickGUI extends Screen {
    public ClickGUI() {
        super(Text.literal("GrokHack ClickGUI"));
    }

    @Override
    public void render(net.minecraft.client.gui.DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        context.fill(50, 50, 300, 300, 0xAA000000);
        context.drawText(MinecraftClient.getInstance().textRenderer, "GrokHack GUI - w budowie", 70, 70, 0xFFFFFFFF, true);
    }
}
