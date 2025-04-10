//package HwN02;
import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
    //     if (args.length != 1) {
    //         System.out.println("Usage: java EchoServer <port>");
    //         return;
    //     }

        // int port = Integer.parseInt(args[0]);
        int port = 8675;

        try (
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);)
            {
            
            System.out.println("New client connected: " + clientSocket.getInetAddress());

            while (true) {
                String received;
                while ((received = in.readLine()) != null) {
                        System.out.println("Received: " + received);
                        out.println(received); // Echo message back to client
                    }
                              
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Client disconnected.");
    }
}