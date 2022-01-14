package Lada303.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final String SERVER_ADDRESS = "localhost";
    private final int SERVER_PORT = 8189;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner sc;
    boolean connection;

    public static void main(String[] args) throws IOException, InterruptedException {
        new Client().openConnection();
    }

    private void openConnection() throws IOException, InterruptedException {
        socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        connection = true;
        Thread thread = new Thread(() -> {
            try {
                while (connection) {
                    System.out.println(in.readUTF());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        sc = new Scanner(System.in);
        while (connection) {
            String outStr = sc.nextLine();
            out.writeUTF(outStr);
            if (outStr.equalsIgnoreCase("/end")) {
                connection = false;
                break;
            }
        }
        thread.join();
        sc.close();
        closeConnection();
    }

    private void closeConnection() {
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
