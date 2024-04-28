package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        ds.receive(datagramPacket);
//        byte [] bytes1 = datagramPacket.getData();
        int length  = datagramPacket.getLength();
        System.out.println(new String(bytes,0,length));
        ds.close();
    }
}
