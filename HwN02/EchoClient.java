//package HwN02;
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        // if (args.length != 2) {
        //     System.out.println("Usage: java EchoClient <host> <port>");
        //     return;
        // }

        String host = "127.0.0.1"; //args[0];
        int port = 8675; //Integer.parseInt(args[1]);

        try(
            Socket echoSocket = new Socket(host, port);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));)
        {
             
            System.out.println(host+":"+port);
            System.out.println("Type 'q' to quit: ");

            String input;
            while ((input = userInput.readLine()) != null) {
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                out.println(input);
                System.out.println("Server replied: " + in.readLine());
            }}
            
         catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
    

