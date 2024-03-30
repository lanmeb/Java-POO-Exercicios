/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP01;

/**
 *
 * @author elani
 */
/*Calcular    e  apresentar  o  valor  do  volume  
de  uma  lata  de  óleo,  utilizando  a fórmula:
VOLUME = 3.14159 * R2 * ALTURA*/

public class Ex5 {
    public static void main(String[] args) {
        double raio = 5.0, altura = 10.0; 
        
        // Calculando o volume da lata de óleo
        double volume = 3.14159 * (raio*raio) * altura;

        // Exibindo o resultado
        System.out.println("O volume da lata de oleo e: " + volume + " metros cubicos");
        
    }
 
}
