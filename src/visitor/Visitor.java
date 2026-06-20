package visitor;

public interface Visitor {
    String exibirPerecivel(Perecivel perecivel);
    String exibirNaoPerecivel(NaoPerecivel naoPerecivel);
    String exibirRefrigerado(Refrigerado refrigerado);
}
