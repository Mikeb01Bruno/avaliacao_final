package cargodeconfianca;

import bonificacao.Bonificacao;
import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;
import util.Util;

public class Gerente extends CargoDeConfianca{

    //Getter e Setter
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
    
    //Get Salário Final
    @Override
    public double getSalarioFinal(){
        return salario + (salario * Bonificacao.GERENTE.getValor());
    }
            
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "Salário Final: " + Util.formatarBr1(getSalarioFinal());
    }
    
}
