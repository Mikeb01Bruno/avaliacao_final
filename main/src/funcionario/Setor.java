package funcionario;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridica"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operacoes");
    
    private final String nome;
    
    //Construtor

    private Setor(String nome) {
        this.nome = nome;
    }
    
    //Getter

    public String getNome() {
        return nome;
    }
    
}
