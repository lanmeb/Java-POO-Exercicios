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
/*Criar um programa que receba 2 valores e calcule o produto
através de um método que  retorna valores.*/

public class Ex03 {
    public static void main(String[] args) {
        try {
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

            double resultado = calcularProduto(valor1, valor2);

            JOptionPane.showMessageDialog(null, "O produto dos valores é: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite valores válidos.");
        }
    }

    public static double calcularProduto(double valor1, double valor2) {
        return valor1 * valor2;
    }
    
}
