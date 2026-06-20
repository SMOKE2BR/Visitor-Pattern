package visitor;

public class NaoPerecivel implements ItemEstoque {
    private int codigo;
    private String nome;
    private int quantidadeEstoque;

    public NaoPerecivel(int codigo, String nome, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirNaoPerecivel(this);
    }
}
