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
/*Um  programa  capaz  de  imprimir  todos  os  números  primos 
em  um  intervalo  de números informado pelo usuário;*/

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
        
        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = sc.nextInt();
        
        
       System.out.println("Números primos no intervalo [" + inicio + ", " + fim + "]:");
        for (int i = inicio; i <= fim; i++) {
            try {
                if (ehPrimo(i)) {
                    System.out.print(i + " ");
                }
            } catch (Exception e) {
              System.out.println("Ocorreu um erro ao verificar o número " + i + ": " + e.getMessage());
            }
        
        }
        
        
        }catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Insira um número inteiro válido.");
        } 
        
       finally {

       sc.close();
       }
      
    }

    // Função para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


     