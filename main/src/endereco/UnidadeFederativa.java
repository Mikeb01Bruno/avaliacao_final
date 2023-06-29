package endereco;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private final String nome;
    private final String sigla;
    
    //Construtor

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    //Getter

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
}
