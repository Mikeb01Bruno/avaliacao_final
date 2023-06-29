package funcionario;

public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private final String texto;
    private final char sigla;
    
    //Construtor

    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
    
}
