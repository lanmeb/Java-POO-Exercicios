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
/*Um programa que calcule a média de uma aluno nos moldes da Fatec Zona SUL.

(p1*0,35 + p2*0,50 + T*0,15)
*/
public class Ex4 {
   public static void main(String[] args) {
        double notaProva1, notaProva2, notaTrabalho;
        double pesoProva1, pesoProva2, pesoTrabalho;

        try {
            pesoProva1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da primeira prova:"));
            pesoProva2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da segunda prova:"));
            pesoTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do trabalho:"));

            if (pesoProva1 < 0 || pesoProva2 < 0 || pesoTrabalho < 0 || pesoProva1 + pesoProva2 + pesoTrabalho != 1.0 || (pesoProva1 == 0 && pesoProva2 == 0 && pesoTrabalho == 0)) {
                JOptionPane.showMessageDialog(null, "Os pesos devem ser números positivos e a soma deve ser igual a 1, com pelo menos um peso diferente de zero.");
            } else {
                notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da primeira prova:"));
                notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da segunda prova:"));
                notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho:"));

                if (notaProva1 < 0 || notaProva1 > 10 || notaProva2 < 0 || notaProva2 > 10 || notaTrabalho < 0 || notaTrabalho > 10) {
                    JOptionPane.showMessageDialog(null, "As notas devem estar entre 0 e 10.");
                } else {
                    double mediaPonderada = (notaProva1 * pesoProva1 + notaProva2 * pesoProva2 + notaTrabalho * pesoTrabalho) /
                            (pesoProva1 + pesoProva2 + pesoTrabalho);

                    String resultadoFormatado = String.format("%.1f", mediaPonderada);

                    JOptionPane.showMessageDialog(null, "A média ponderada é: " + resultadoFormatado);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, informe valores válidos.");
            
        }
    }    
}
  
