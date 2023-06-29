package funcionario;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    private final String texto;
    
    //Construtor

    private EstadoCivil(String texto) {
        this.texto = texto;
    }
    
    //Getter

    public String getTexto() {
        return texto;
    }
}
