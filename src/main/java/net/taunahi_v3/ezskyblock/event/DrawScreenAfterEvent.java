package net.taunahi_v3.ezskyblock.event;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.common.eventhandler.Event;

public class DrawScreenAfterEvent extends Event {
    public GuiScreen guiScreen;

    public DrawScreenAfterEvent(GuiScreen guiScreen) {
        this.guiScreen = guiScreen;
    }
}
