package Lada303.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Server {

    public static void main(String[] args) {
        Socket socket;
        Scanner sc = new Scanner(System.in);
        AtomicBoolean connection = new AtomicBoolean(true);

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            socket = serverSocket.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Hello from Server!");
            new Thread(() -> {
                try {
                    while (true) {
                        String inStr = in.readUTF();
                        if (inStr.equalsIgnoreCase("/end")) {
                            System.out.println(inStr);
                            connection.set(false);
                            out.writeUTF("Bye!");
                            break;
                        }
                        System.out.println(inStr);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            while (connection.get()) {
                out.writeUTF(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
