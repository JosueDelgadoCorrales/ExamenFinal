/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio2 {

    static ArrayList<Cliente> clientList = new ArrayList();
    static double totalBalance; //4 bytes

    public static void gestionarClientes() {
        System.out.println("");
        System.out.println("Ejercicio 2");
        System.out.println("");
        System.out.println("Crea una clase llamada RegistroClientes que permita "
                + "gestionar dinámicamente un conjunto de objetos Cliente."
                + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo.\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
                + "\nDebe calcular la cantidad de bytes total del prcedimiento calcular saldo total.\n");
        // Implementa la lógica del ejercicio 2 aquí
        Menu();
    }

    public static void Menu() {
        int opcion; //4 bytes
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1. Crear Cliente");//17 * 2 = 34
        System.out.println("2. Eliminar Cliente");//20 * 2 = 40
        System.out.println("3. Calcular Saldo Total");// 23 * 2 46
        System.out.println("4. Salir");// 8 * 2 = 16
        opcion = scanner1.nextInt();

        switch (opcion) {
            case 1:
                CreateClient();
            case 2:
                DeleteClient();
            case 3:
                System.out.println("Saldo total = " + totalBalance); //14 * 2 + 4 = 32
            case 4:
                break;
        }
    }

    public static void CreateClient() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Cliente");
        String name = scanner1.nextLine();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el Codigo del Cliente");
        String clientID = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingrese el Saldo del Cliente");
        double balance = scanner3.nextDouble();

        Cliente c = new Cliente(name, clientID, balance);
        clientList.add(c);

        totalBalance = totalBalance + balance;

        System.out.println("Cliente creado exitosamente");
        Menu();
    }

    public static void DeleteClient() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el codigo de cliente a borrar");
        String clientID = scanner1.nextLine();

        for (Cliente c : clientList) {
            if (c.getClientID().equals(clientID)) {
                double balance = c.getBalance();
                clientList.remove(c);
                totalBalance = totalBalance - balance;
            } else {
                System.out.println("Cliente No Encontrado");
                System.out.println("Volviendo al menu");
                Menu();
            }
        }
    }

}
