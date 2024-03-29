package net.taunahi_v3.ezss.event;

import net.minecraft.network.Packet;
import net.minecraftforge.fml.common.eventhandler.Event;

public class SendPacketEvent extends Event {
    public Packet<?> packet;

    public SendPacketEvent(Packet<?> packet) {
        this.packet = packet;
    }
}
