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
/* Ler um valor e informar se ele é ou não múltiplo de 3.*/

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite um numero inteiro");
        int numero = sc.nextInt();
        if (numero % 3 == 0){
            System.out.println("É multiplo de 3");
        }else{
            System.out.println("Não é multiplo de 3");
        }
    }

}
