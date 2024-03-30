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
/*Ler três números e mostrá-los em ordem crescente.*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite um numero inteiro");
        int n1 = sc.nextInt();
        
        System.out.println("Digite um numero inteiro");
        int n2 = sc.nextInt();
        
        System.out.println("Digite um numero inteiro");
        int n3 = sc.nextInt();
        
        // Ordenação crescente
        //temp = variavel temporaria
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.printf("a ordem crescente dos numeros e:" + n1 + "," +n2+ "," + n3+ "\n");

        
    }   
}
