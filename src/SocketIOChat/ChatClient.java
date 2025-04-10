import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 3333;

        try (Socket socket = new Socket(serverAddress, port);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

              System.out.println("Connected to chat server!");

            Thread listener = new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("\n" + serverMessage);
                    }
                } catch (IOException e) {
                    System.err.println("Connection lost: " + e.getMessage());
                }
            });
            listener.start();

            // broadcast messages
            String userMessage;
            while ((userMessage = userInput.readLine()) != null) {
                out.print(+userMessage);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
