package com.javastudy.FEB_2026.a10udpdemo10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("!!!!!!!Send start!!!!!!!");

        DatagramSocket ds = new DatagramSocket();

        String str = "This is a test";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        ds.send(dp);
        ds.close();
    }
}
