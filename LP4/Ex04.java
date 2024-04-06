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
/*Criar  um  programa  que  receba  um 
grau  e  o  converta  para  radianos  através  de  um método.
Fórmula:  radiano = grau * pi / 180*/


public class Ex04 {
    public static void main(String[] args) {
        try {
            double grau = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em graus:"));

            double radiano = converterParaRadianos(grau);

            JOptionPane.showMessageDialog(null, grau + " graus é equivalente a " + radiano + " radianos.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um valor numérico válido.");
        }
    }

    public static double converterParaRadianos(double grau) {
        double pi = Math.PI;
        return grau * pi / 180;
    }
    
}
