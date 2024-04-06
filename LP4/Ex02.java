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
/*Criar  um  programa  que  receba  4  notas  e  calcule  a  média  aritmética, 
através  de  um método.*/


public class Ex02 {
    public static void main(String[] args) {
         double nota1, nota2, nota3, nota4;

        try {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

            double media = calcularMedia(nota1, nota2, nota3, nota4);

            JOptionPane.showMessageDialog(null, "A média aritmética das notas é: " + media);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite notas válidas.");
        }
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
}
