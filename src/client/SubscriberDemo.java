package client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SubscriberDemo {
    public static void main(String... args) {
        // register to the queue


        // listen for logss

    }

    private class Listener {
        private ServerSocket conn;

        private Listener() {
            try {
                this.conn = new ServerSocket(5600);

                while (true) {
                    Socket net = this.conn.accept();
                    System.out.println(net.getInputStream().read());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}