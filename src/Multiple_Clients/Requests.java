package Multiple_Clients;

import java.time.LocalDate;
import java.util.*;

public class Requests {

    List<Pacote> pacotes = new ArrayList<>();

    public Requests() {
        Pacote pacote = new Pacote(1, "Faruque", LocalDate.now());
        Pacote pacote2 = new Pacote(2, "Paulo", LocalDate.now());
        Pacote pacote3 = new Pacote(3, "Ju", LocalDate.now());
        pacotes.add(pacote);
        pacotes.add(pacote3);
        pacotes.add(pacote2);
    }

    public String teste() {
        return "sucess from requet";
    }

    public Pacote getPacote(String pacoteUtlizador) {
        Pacote pacote1 = null;

        Optional<Pacote> pacote2 = pacotes.stream().
                filter(e -> e.getUtlizador().equalsIgnoreCase(pacoteUtlizador))
                .findFirst();

        if (pacote2.isPresent()) {
            pacote1 = pacote2.get();
        }

        return pacote1;
    }

    public static void main(String[] args) {
        Requests requests = new Requests();
        Pacote pacote = requests.getPacote("Faruque");
        System.out.println(pacote);
    }
}
