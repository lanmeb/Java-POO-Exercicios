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
/*Criar um programa que receba um número que corresponda a 
um mês do 1º trimestre e escreva  o  mês  correspondente; 
caso  o  usuário  digite  o  número  fora  
do  intervalo  deverá aparecer inválido, mas utilizando
um método do tipo void.*/


public class Ex06 {
    public static void main(String[] args) {
         try {
            int numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente a um mês do 1º trimestre (1 a 3):"));
            
            escreverMesCorrespondente(numeroMes);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um número válido.");
        }
    }

    public static void escreverMesCorrespondente(int numeroMes) {
        switch (numeroMes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Março");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inválido");
                break;
        }
    }
    
}
