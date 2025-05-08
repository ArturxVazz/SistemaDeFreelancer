package Model;

public class ProjetoEntity {
    private String nomeProjeto;
    private String cliente;
    private double valor;
    private int duracaoEmDias;

    public ProjetoEntity(){}

    public ProjetoEntity(String nomeProjeto, String cliente, double valor, int duracaoEmDias) {
        this.nomeProjeto = nomeProjeto;
        this.cliente = cliente;
        this.valor = valor;
        this.duracaoEmDias = duracaoEmDias;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracaoEmDias() {
        return duracaoEmDias;
    }

    public void setDuracaoEmDias(int duracaoEmDias) {
        this.duracaoEmDias = duracaoEmDias;
    }
}
