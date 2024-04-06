/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP05;


import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author elani
 */
/*Criar uma classe Pessoa com as seguintes características: 
•atributos: idade e dia, mês e ano de nascimento, nome da pessoa
•métodos: 
o calculaIdade(),que  recebe  a  data  atual  em  dias,
mês  e  anos  e  calcula  e armazena no atributo idade a idade atual da pessoa;
o informaIdade(), que retorna o valor da idade 
o informaNome(),que retorna o nome da pessoa 
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como parâmetros e
preenche nos atributos correspondentes do objeto. 
•Criar  dois  objetos  da  classe  Pessoa,
um  representando  Albert  Einstein (nascido  em 14/3/1879) e o outro representando 
Isaac Newton (nascido em 4/1/1643) 
•Fazer uma classe principal que instancie os objetos, inicialize e mostre quais 
seriam as idades de Einstein e Newton caso estivessem vivos.

*/
public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        Period periodo = Period.between(dataNascimento, hoje);
        this.idade = periodo.getYears();
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
    public static void main(String[] args) {
        // Criando objetos para representar Einstein e Newton
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        // Calculando a idade atual
        einstein.calculaIdade();
        newton.calculaIdade();

        // Exibindo as idades
        System.out.println("Se estivesse vivo, Albert Einstein teria " + einstein.informaIdade() + " anos");
        System.out.println("Se estivesse vivo, Isaac Newton teria " + newton.informaIdade() + " anos");
    }
}
