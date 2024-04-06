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
/*Criar  um  programa  que  mostre  qual o  maior  valor
entre  dois  números,  utilizando  um método 
do tipo void (que não retorna valores).*/

public class Ex05 {
    public static void main(String[] args) {
        try {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

            encontrarMaior(numero1, numero2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite valores numéricos válidos.");
        }
    }

    public static void encontrarMaior(int numero1, int numero2) {
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais: " + numero1);
        }
    }
    
}
