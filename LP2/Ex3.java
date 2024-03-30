/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP02;

import java.util.Scanner;

/**
 *
 * @author elani
 */

/*Um comerciante comprou um produto e quer vendê-lo com um lucro de 45%
se o valor  da  compra for  menor  que  R$20,00;  caso  contrário,
o  lucro  será de 30%.  Entrar com o valor do produto e imprimir o 
valor da venda.*/

public class Ex3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("Digite o valor da compra: R$");
        double valorCompra = sc.nextDouble();

        double lucro;
        if (valorCompra < 20.0) {
            lucro = 0.45; // 45% de lucro
        } else {
            lucro = 0.30; // 30% de lucro
        }

        double valorVenda = valorCompra * (1 + lucro);

        System.out.printf("O valor da venda é: R$%.2f%n", valorVenda);
    }
}   

        
    
    

