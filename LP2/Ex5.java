/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP02;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author elani
 */
/*Depois  da  liberação  do  governo  para  as  mensalidades  dos  planos  de  saúde,
as pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro.
Um vendedor de um plano de saúde apresentou a tabela a seguir. 
Criar um programa que entre com o nome e a idade de uma pessoa e mostre
o valor que ela deverá pagar.
Até 10 anos –R$ 30,00
Acima de 10 até 29 anos –R$ 60,00
Acima de 29 até 45 anos –R$ 120,00
Acima de 45 até 59 anos –R$ 150,00
Acima de 59 até 65 anos –R$ 250,00
Maior que 65 anos –R$ 400,00*/


public class Ex5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.print("Digite seu nome \n ");
        String nome = sc.nextLine();  

        System.out.print("Digite sua idade \n ");
        int idade = sc.nextInt(); 
        
      
        double valorPlano;

        if (idade <= 10) {
            valorPlano = 30.00;
        } else if (idade <= 29) {
            valorPlano = 60.00;
        } else if (idade <= 45) {
            valorPlano = 120.00;
        } else if (idade <= 59) {
            valorPlano = 150.00;
        } else if (idade <= 65) {
            valorPlano = 250.00;
        } else {
            valorPlano = 400.00;
        }
        //String valorFormatado = String.format("%.2f", valorPlano);
        //System.out.println(nome + ", o valor do plano de saúde para sua faixa etária é R$" + valorFormatado);
        // ou
        System.out.printf("%s, o valor do plano de saúde para sua faixa etária é R$%.2f%n", nome, valorPlano);
        
        
        // Feche o scanner
        sc.close();
  }
}
