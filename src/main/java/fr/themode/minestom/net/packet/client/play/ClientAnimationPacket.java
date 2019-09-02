package fr.themode.minestom.net.packet.client.play;

import fr.themode.minestom.entity.Player;
import fr.themode.minestom.net.packet.PacketReader;
import fr.themode.minestom.net.packet.client.ClientPlayPacket;

public class ClientAnimationPacket extends ClientPlayPacket {

    public Player.Hand hand;

    @Override
    public void read(PacketReader reader, Runnable callback) {
        reader.readVarInt(value -> {
            this.hand = Player.Hand.values()[value];
            callback.run();
        });
    }
}
