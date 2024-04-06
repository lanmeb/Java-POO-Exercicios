/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP05;

import java.util.Scanner;

/**
 *
 * @author elani
 */
/*Criar uma Classe chamada Equacao que contenha como atributos 3 valores
inteiros, A, B e C. Na classe definir um método para leitura dos valores, 
um método construtor e um método para calcular as raízes da equação.
R1 = (-b+ (raiz de delta))/ (2*a)
R2 = (-b-(raiz de delta))/ (2*a)
Considerar que:
-Se delta = 0, as raízes são iguais;
-Se delta <0, não existem raízes reais;
-Se delta >0, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir
da classe criada, solicitar e atribuir os valores e invocar o método
que calculaas raízes a partir do objeto criado.
*/


public class Equacao {
    private double A;
    private double B;
    private double C;

    public Equacao() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public void lerValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        this.A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        this.B = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        this.C = scanner.nextDouble();
    }

    public void calcularRaizes() {
        double delta = this.B * this.B - 4 * this.A * this.C;

        if (delta > 0) {
            double raizDelta = Math.sqrt(delta);
            double R1 = (-this.B + raizDelta) / (2 * this.A);
            double R2 = (-this.B - raizDelta) / (2 * this.A);
            System.out.println("Raiz 1 (R1): " + R1);
            System.out.println("Raiz 2 (R2): " + R2);
        } else if (delta == 0) {
            double R1 = -this.B / (2 * this.A);
            System.out.println("Raiz iguais: " + R1);
        } else {
            System.out.println("Não existem raízes reais.");
        }
    }

    public static void main(String[] args) {
        Equacao equacao = new Equacao();
        equacao.lerValores();
        equacao.calcularRaizes();
    }
}
