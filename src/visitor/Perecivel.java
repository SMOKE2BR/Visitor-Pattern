package visitor;

public class Perecivel implements ItemEstoque {
    private int codigo;
    private String nome;
    private String dataValidade;

    public Perecivel(int codigo, String nome, String dataValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getDataValidade() { return dataValidade; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPerecivel(this);
    }
}
