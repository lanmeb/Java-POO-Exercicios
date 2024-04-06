/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP04;

import javax.swing.JOptionPane;

/**
 *
 * @author elani
 */
/*Criar um programa que permita a entrada de um  número inteiro e retorne o seu dobro, através de um método.*/
public class Ex01 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
            int resultado = calcularDobro(numero);
            JOptionPane.showMessageDialog(null, "O dobro de " + numero + " é " + resultado);
              
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Entrada inválida. Por favor, digite outro número inteiro.");
        }
    }
    
    public static int calcularDobro(int numero) {
        return numero * 2;
    }
    
}



 
