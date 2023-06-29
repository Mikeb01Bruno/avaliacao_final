package funcionarios;

import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;
    
    //Construtor

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }

   
    //Getter e Setter

    public String getCarteiraDeHabilitacao() {
        return crea;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.crea = carteiraDeHabilitacao;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n CREA: " + crea;
    }
    
    
    
}
