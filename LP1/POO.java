/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LP01;

import java.util.Scanner;

/**
 *
 * @author elani
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v1,v2,soma; 
        Scanner input = new Scanner (System.in);
        
        System.out.println("Insira o valor de v1: ");
        v1= input.nextInt();
        System.out.println("Insira o valor de v2: ");
        v2= input.nextInt();
        soma=v1+v2;
        System.out.printf("\nSoma= %d\n", soma);
    }
    
}
    

