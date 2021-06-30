import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        System.out.println("Conecting to the server...");
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello from client...".getBytes(StandardCharsets.UTF_8));

        byte response[] = new byte[1024];
        inputStream.read(response);

        System.out.println("Received from Server:" + new String(response).trim());
        socket.close();


    }
}
