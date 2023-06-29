package funcionario;

import endereco.Endereco;
import java.time.LocalDate;
import java.time.Period;
import util.Util;

public class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Genero genero;
    protected double salario;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;
    
    //Construtor

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.genero = genero;
        this.salario = salario;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }
    
    //Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //GetIdade
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
        
    }
    
    //GetSalário Final
    
    @Override
    public double getSalarioFinal() {
      return salario; 
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Endereco: " + endereco + 
                "\n Setor: " + setor.getNome() + 
                "\n Genero: " + genero.getTexto() + 
                "\n Estado Civil: " + estadoCivil.getTexto() + 
                "\n Salario: " + Util.formatarBr1(salario) + 
                "\n Salario Final: " + Util.formatarBr1(getSalarioFinal()) + 
                "\n Data de Nascimento: " + Util.formatarData(dataNascimento) +
                "\n Idade: " + getIdade();
    }

    
}
