package bonificacao;

public enum Bonificacao {
    GERENTE (0.15),
    DIRETOR (0.25);
    
    private final double valor;

    //Construtor
    private Bonificacao(double valor) {
        this.valor = valor;
    }
    
    //Getter

    public double getValor() {
        return valor;
    }
    
    
}
