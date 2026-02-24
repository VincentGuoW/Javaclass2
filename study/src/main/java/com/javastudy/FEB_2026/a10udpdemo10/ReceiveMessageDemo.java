package com.javastudy.FEB_2026.a10udpdemo10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("!!!!!!!Receive start!!!!!!!");
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        ds.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println(new String(data, 0, length));
        System.out.println(port+"-----"+address);
    }
}
