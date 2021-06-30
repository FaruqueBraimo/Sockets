package Multiple_Clients;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8182);
        System.out.println("Informe o nome do utilizador:");
        Scanner pedidoUtlizador = new Scanner(System.in);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(pedidoUtlizador.nextLine().getBytes(StandardCharsets.UTF_8));

         byte request[] = new byte[1024];
         inputStream.read(request);

        System.out.println("response from server: "+ new String(request).trim());
         socket.close();

    }

}
