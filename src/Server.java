import Multiple_Clients.Requests;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("wainting for client...");
        Socket socket = serverSocket.accept();

        InputStream  inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        byte buffer[] = new byte[1024];
        inputStream.read(buffer);
        System.out.println("Received from buffer:" + new String(buffer).trim());
        outputStream.write("hello from server...".getBytes());
        socket.close();
        serverSocket.close();



    }

}
