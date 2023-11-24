/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio1 {

    public static void calcularFibonacci() {
        System.out.println("");
        System.out.println("Ejercicio 1");
        System.out.println("Escribe una función recursiva en Java para calcular el n-ésimo término de la secuencia de Fibonacci.");
        System.out.println("La sucesión de Fibonacci es una secuencia de números en la que cada número es la suma de los dos anteriores, comenzando con 0 y 1. La secuencia comienza así:\n"
                + "\n"
                + "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ....]\n"
                + "\n"
                + "En términos matemáticos, la sucesión de Fibonacci (F(n)) para un índice (n) se define de la siguiente manera:\n"
                + "\n"
                + "[F(n) = F(n-1) + F(n-2)]\n"
                + "\n"
                + "con las condiciones iniciales:\n"
                + "\n"
                + "[F(0) = 0, y F(1) = 1]\n"
                + "\n"
                + "Esto significa que cada número en la secuencia es la suma de los dos números anteriores.\nLa secuencia de Fibonacci tiene muchas aplicaciones en matemáticas y ciencias de la computación.\n");
// Implementa la lógica del ejercicio 1 aqui
        CalcularPosicion();
    }

    public static void CalcularPosicion() {
        Scanner scanner1 = new Scanner(System.in);
        int posicion;
        int numero1;
        int numero2;


            System.out.print("Digite la posicion que desea saber ");
            posicion = scanner1.nextInt();

        System.out.println("Los " + posicion + " primeros términos de la serie de Fibonacci son:");

        numero1 = 0;
        numero2 = 1;

        System.out.print(numero1 + " ");
        for (int i = 2; i <= posicion; i++) {
            System.out.print(numero2 + " ");
            numero2 = numero1 + numero2;
            numero1 = numero2 - numero1;
        }
                    System.out.println(" ");
        int r;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Desea buscar otro numero");
        System.out.println("1. SI / 2. NO");
        r = scanner2.nextInt();
        
        if(r != 2){
            CalcularPosicion();
        }
        
    }

}
