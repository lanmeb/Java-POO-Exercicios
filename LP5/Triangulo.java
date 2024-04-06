/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LP05;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author elani
 */
/*1ª) Criar uma Classe chamada Triangulo que contenha como atributos
a base e altura de um triângulo. Na classe definir um método para 
leitura da base e altura, um método construtor e um método para
Calcular a área do triângulo (Area=Base * Altura)/2.
No métodoprincipal do programa (main) , criar um objeto a 
partir da classe criada, solicitar e atribuir os valores da
base e altura e invocar o método que calcula a área a partir
do objeto criado.*/

public class Triangulo {
    private double base;
    private double altura;

    // Construtor sem parametro
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Leitura da base e altura
    public void lerBaseAltura() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        this.base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        this.altura = scanner.nextDouble();
    }

    // Cálculo da área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Exibição da área
    public void exibirArea() {
        System.out.printf("A área do triângulo é: %.2f\n", calcularArea());
    }

    public static void main(String[] args) {
        // Criação do objeto
        Triangulo triangulo = new Triangulo();

        // Leitura dos dados
        triangulo.lerBaseAltura();

        // Cálculo e exibição da área
        triangulo.exibirArea();
        
    }
}

    