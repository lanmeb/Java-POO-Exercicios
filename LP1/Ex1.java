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
/*Em época de pouco dinheiro, os comerciantes estão procurando aumentar 
suas vendas oferecendo desconto.  Faça um programa que possa entrar com
o nome de um produto e seu  valor unitário e calcular e exibir  um novo 
valor com um desconto de 9%.*/
public class Ex1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String produto; 
        float valor; 
        float desconto; 
        float valorComDesconto; 

        Scanner input = new Scanner(System.in); 

        System.out.println("Digite o produto"); 
        produto = input.next(); 

        System.out.println("Digite o valor"); 
        valor = input.nextFloat(); 

        System.out.println("Digite o desconto"); 
        desconto = input.nextFloat(); 

        valorComDesconto = valor - valor * desconto/100; 

        System.out.printf("O valor com desconto do produto %s sera RS %.2f \n",produto, valorComDesconto); 

    } 

} 

