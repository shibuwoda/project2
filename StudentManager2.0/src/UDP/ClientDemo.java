package UDP;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String s = "送给老丈人的礼物";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("192.168.1.104");
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,byName ,10000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
