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
/*Faça um programa que leia dois valores e informe
a média entre eles. (use float como tipo de dado).*/

public class Ex3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int v1,v2,media; 
        Scanner input = new Scanner (System.in);
        
        System.out.println("Insira o valor de v1: ");
        v1= input.nextInt();
        System.out.println("Insira o valor de v2: ");
        v2= input.nextInt();
        media= (v1+v2)/2;
        System.out.printf("\n Media = %d\n", media);
    }
}
