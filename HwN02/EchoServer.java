package HwN02;
import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java EchoServer <port>");
            return;
        }

        int port = Integer.parseInt(args[0]);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Echo Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String received;
                    while ((received = in.readLine()) != null) {
                        System.out.println("Received: " + received);
                        out.println(received); // Echo message back to client
                    }
                }
                clientSocket.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}