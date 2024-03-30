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
/*Faça  um  programa  que  leia    uma  temperatura  em  graus  Centígrados 
e apresente-a convertida em graus Fahrenheit.
A fórmula de conversão é: F = (9 * C + 160) / 5,
onde F é a temperatura em Fahrenheit e C em graus Centígrados.*/

public class Ex4 {
    public static void main(String[] args) {
        double tempCen, tempFah;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Centigrado:");
        tempCen  = input.nextDouble();
        
        tempFah = (9*tempCen + 160)/5;
        
        System.out.println("A temperatura equivalente em Fahrenheit e: " + tempFah + " graus\n");
        
        // Feche o scanner - boa prática para evitar vazar memória
        input.close();
    }
}
