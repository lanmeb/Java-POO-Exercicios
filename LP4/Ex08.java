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
/*Criar umprograma que verifique se um número é primo 
ou não, através de um método.
Número primo é divisível somente por 1 e por ele mesmo.*/

public class Ex08 {
    public static void main(String[] args) {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se é primo:"));

            boolean ehPrimo = verificarPrimo(numero);

            if (ehPrimo) {
                JOptionPane.showMessageDialog(null, numero + " é um número primo.");
            } else {
                JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro válido.");
        }
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        int divisor = 5;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0 || numero % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }

        return true;
    }
    
}
