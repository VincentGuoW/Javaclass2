package com.javastudy.FEB_2026.a11clientserver;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream os = socket.getOutputStream();

        os.write("Client test实验".getBytes());

        os.close();
        socket.close();
    }
}
