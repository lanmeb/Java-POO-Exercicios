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
/*Criar um programa 
que retorne o fatorial de um número, usando um método 
que receba um valor e retorne o fatorial desse 
valor.Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120*/

public class Ex07 {
     public static void main(String[] args) {
         try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
            
            long fatorial = calcularFatorial(numero);
            
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro válido.");
        }
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
    
}
