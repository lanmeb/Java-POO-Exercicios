/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP03;

import java.util.Scanner;

/**
 *
 * @author elani
 */

// Crie tratamento de erros em todos os programas.
/*1. Um  programa  capaz  de  imprimir  todos  os  números  pares
em  um  intervalo de números informado pelo usuário;*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
        
        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = sc.nextInt();
        
        System.out.println("Números pares no intervalo [" + inicio + ", " + fim + "]:");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        }catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Insira um número inteiro válido.");
        } 
        finally {

            sc.close();
        }   
    }
}

    
