package cargodeconfianca;

import bonificacao.Bonificacao;
import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;
    
    //Construtor

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }
      
    //Getter e Setter

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n Bonificação: " + bonificacao;
    }
    
}
