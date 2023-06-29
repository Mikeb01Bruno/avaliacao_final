package funcionarios;

import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    //Construtor
    
    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    //Getter & Setter

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString()+ 
                "\n Carteira de Habilitaçao: " + carteiraDeHabilitacao;
    }
    
    
    
}
