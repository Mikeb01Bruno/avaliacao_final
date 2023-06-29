
package cargodeconfianca;

import bonificacao.Bonificacao;
import contratacao.Contratacao;
import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;
import util.Util;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.3;
    
    //Construtor

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
    
    //Getter e Setter

    @Override
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    //getSalário Final
    
    @Override
    public double getSalarioFinal(){
        return salario + (salario * Bonificacao.DIRETOR.getValor()) * (PREMIO);
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() +
                 "\n Premio: " + PREMIO * 100 +
                 "\n Salario Final: " +Util.formatarBr1(getSalarioFinal());
    }

    //Contratação
    
    @Override
    public void admitir(Funcionario funcionaro) {
        System.out.println("Funcionário admitido: " +funcionaro);        
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionário demitido: " +funcionario);        
    }
    
    
    
}
