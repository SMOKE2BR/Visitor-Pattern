package visitor;

public class Refrigerado implements ItemEstoque {
    private int codigo;
    private String nome;
    private float temperaturaMaxima;

    public Refrigerado(int codigo, String nome, float temperaturaMaxima) {
        this.codigo = codigo;
        this.nome = nome;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public float getTemperaturaMaxima() { return temperaturaMaxima; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirRefrigerado(this);
    }
}
