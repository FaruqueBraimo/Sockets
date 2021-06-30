package Multiple_Clients;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Services implements  Runnable{

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8182);
            Requests requests = new Requests();
            while (true) {

                System.out.println("wainting for all conections on port 8182");
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                System.out.println("wainting for clients packages");
                byte request[] = new byte[1024];
                inputStream.read(request);

                String parameter = new String(request).trim();
                Pacote pacote = requests.getPacote(parameter);


                if (pacote == null ) {
                    outputStream.write("Pacote Invalido".getBytes(StandardCharsets.UTF_8));
                    socket.close();
                }
                else {

                    outputStream.write(pacote.toString().getBytes(StandardCharsets.UTF_8));
                    socket.close();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
