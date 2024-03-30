/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP03;

import javax.swing.JOptionPane;

/**
 *
 * @author elani
 */
/*Um  programa  que  imprima  até  o  “n”  termo  a  seqüência  de  Fibonacci. 
Série: 1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo:  1, 1, 2, 3, 5, 8
*/
public class Ex2 {
    public static void main(String[] args) {
        int n = 0;

        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Digite o valor de 'n' para imprimir a sequência de Fibonacci:");
                if (input == null) {
                    // O usuário clicou em Cancelar ou fechou a janela
                    System.exit(0);
                }
                n = Integer.parseInt(input);

                if (n < 1) {
                    throw new IllegalArgumentException();
                }

                break; // Valor de 'n' é válido, sai do loop
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número inteiro positivo.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Valor de 'n' deve ser maior que 1.");
            }
        }

       JOptionPane.showMessageDialog(null, "Sequência de Fibonacci até o " + n + " - ésimo termo:\n" + fibonacciSequence(n));
       //JoptionPane exibe em formato de caixa de diálogo
    
    }
    public static String fibonacciSequence(int n) {
        StringBuilder sequence = new StringBuilder();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sequence.append(a).append(" ");
            int next = a + b;
            a = b;
            b = next;
        }

        return sequence.toString();
    }
}




