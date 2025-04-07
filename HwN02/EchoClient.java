package HwN02;
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java EchoClient <host> <port>");
            return;
        }

        String host = args[0];
        int port = Integer.parseInt(args[1]);

        try (Socket socket = new Socket(host, port);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to Echo Server. Type messages (type 'exit' to quit):");

            String input;
            while ((input = userInput.readLine()) != null) {
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                out.println(input);
                System.out.println("Server replied: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}