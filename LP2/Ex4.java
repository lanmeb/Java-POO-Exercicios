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
/*Ler a  idade de uma pessoa e informar a sua classe eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório(entre 18 e 65 anos)
Eleitor facultativo(entre 16 e 18 anos e maior de 65 anos)*/

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite sua idade \n ");
        int idade = sc.nextInt();
        
        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }

      
    }
}    
        
        
        
        
      
