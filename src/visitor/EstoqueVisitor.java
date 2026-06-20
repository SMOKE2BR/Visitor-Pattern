package visitor;

public class EstoqueVisitor implements Visitor {

    public String exibir(ItemEstoque item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirPerecivel(Perecivel perecivel) {
        return "Perecível: " + perecivel.getNome() + " (Validade: " + perecivel.getDataValidade() + ")";
    }

    @Override
    public String exibirNaoPerecivel(NaoPerecivel naoPerecivel) {
        return "Não Perecível: " + naoPerecivel.getNome() + " (Qtd: " + naoPerecivel.getQuantidadeEstoque() + ")";
    }

    @Override
    public String exibirRefrigerado(Refrigerado refrigerado) {
        return "Refrigerado: " + refrigerado.getNome() + " (Temp Máx: " + refrigerado.getTemperaturaMaxima() + "°C)";
    }
}
