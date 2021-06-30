package Multiple_Clients;


import java.time.LocalDate;

public class Pacote {
    private int tipoPacote;
    private String utlizador;
    private LocalDate DataCriacao;

    public Pacote() {
    }

    public Pacote(int tipoPacote, String utlizador, LocalDate dataCriacao) {
        this.tipoPacote = tipoPacote;
        this.utlizador = utlizador;
        DataCriacao = dataCriacao;
    }

    public int getTipoPacote() {
        return tipoPacote;
    }

    public void setTipoPacote(int tipoPacote) {
        this.tipoPacote = tipoPacote;
    }

    public String getUtlizador() {
        return utlizador;
    }

    public void setUtlizador(String utlizador) {
        this.utlizador = utlizador;
    }

    public LocalDate getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        DataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "tipoPacote=" + tipoPacote +
                ", utlizador='" + utlizador + '\'' +
                ", DataCriacao=" + DataCriacao +
                '}';
    }
}
