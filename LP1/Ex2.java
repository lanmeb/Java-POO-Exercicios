/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP01;

import java.util.Scanner;

/**
 *
 * @author elani
 */
/*Para vários tributos, a base de cálculo é o salário mínimo.  
Fazer um programa que leia o valor do salário mínimo e o valor
do salário de uma pessoa.  Calcular e mostrar quantos salários 
mínimos ela ganha.*/

public class Ex2 {
    public static void main(String[] args) {
        float salarioMinimo, salarioPessoa, qtdSalarioMin;
        Scanner input = new Scanner (System.in);

        System.out.println("Informe o salario minimo: ");
        salarioMinimo = input.nextFloat();
        
        System.out.println("Informe seu salario: ");
        salarioPessoa = input.nextFloat();
        
        qtdSalarioMin = salarioPessoa / salarioMinimo;
        //System.out.println("Você ganha " + qtdSalarioMin + " salários mínimos");
        System.out.printf("Você ganha %.2f salarios minimos \n ",qtdSalarioMin);
    } 
    
}
