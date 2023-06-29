package main;

import bonificacao.Bonificacao;
import cargodeconfianca.Diretor;
import cargodeconfianca.Gerente;
import endereco.Endereco;
import endereco.UnidadeFederativa;
import funcionario.EstadoCivil;
import funcionario.Genero;
import funcionario.Setor;
import funcionarios.Engenheiro;
import funcionarios.Motoboy;
import java.time.LocalDate;
import java.time.Month;

public class Main {

   
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("852AJ", "Juliano Martins", "951.753.958-98", "852.6547.154.", new Endereco("travessa", "854F", "3 andares", "78415-125", "Santos", UnidadeFederativa.RIO_DE_JANEIRO), Setor.ENGENHARIA, Genero.MASCULINO, 4500, EstadoCivil.CASADO, LocalDate.of(1995, Month.DECEMBER, 15));
        Motoboy motoBoy = new Motoboy("231.324.23", "Adrian Luiz", "753.951.425-98"," 154.458.785-85", new Endereco("Apartamento", "756", "porta de aluminio", "75313-296", "Camacari", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 2300, EstadoCivil.SEPARADO, LocalDate.of(2000, Month.MARCH, 22));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Ana Luiza", "136.856.954-95", "824.958.956-12", new Endereco("Apartamento", "25A", "20° andar", "32554-15", "Alagoinhas", UnidadeFederativa.BAHIA), Setor.RECURSOS_HUMANOS, Genero.FEMININO, 5000, EstadoCivil.SOLTEIRO, LocalDate.of(1995, Month.JANUARY, 22));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Bruno Pereira", "658.825.145-18", "021.039.513-12", new Endereco("residencial", "458A", "3 portão de aluminio", "40713-295", "Barreiras", UnidadeFederativa.BAHIA), Setor.MARKETING, Genero.MASCULINO, 6000, EstadoCivil.CASADO, LocalDate.of(2004, Month.FEBRUARY, 27));
        
        System.out.println(diretor);
        System.out.println("");
        System.out.println(gerente);
        System.out.println("");
        
        diretor.admitir(engenheiro);
        System.out.println("");
        diretor.demitir(motoBoy);
       
        
    }
    
}
