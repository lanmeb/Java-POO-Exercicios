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
/*Criar um programa que leia um número que será o limite superior de um intervalo e o incremento. 
Exibir todos os números naturais no intervalo de 0 até esse número.
Suponha que os dois números lidos são maiores que zero. 
Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0  5  10  15 20*/

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{

        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        // Leitura do incremento
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        // Exibição dos números naturais no intervalo
        System.out.print("Saída: ");
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + " ");
        }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de inserir valores válidos.");
        } finally {
        scanner.close();
        }
    }
}





