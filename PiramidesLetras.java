/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramidesletras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PiramidesLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner jp = new Scanner(System.in);

        System.out.println(" Hola bienvenido :) ");

        boolean banS = true;

        do {
            System.out.println("Selecciona una opcion del menu:");
            System.out.println("********* MENU ********");
            System.out.println(" 1. Piramide asterisco");
            System.out.println(" 2. Piramide Letras");
            System.out.println(" 3. Salir");

            int opcion = jp.nextInt();
            jp.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("1. Piramide asteriscos");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide de asteriscos: ");
                    int numF = jp.nextInt();
                    for (int i = 1; i <= numF; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("2. Piramide Letras");
                    System.out.println("Ingresa el numero de filas que deseas para la piramide de letras: ");
                    int numFilas = jp.nextInt();
                    int valorNumero = 1;
                    char valorLetra = 'A';
                    for (int i = 1; i <= numFilas; i++) {
                        for (int j = 0; j < i; j++) {
                            if (i % 2 == 1) {
                                System.out.print(valorNumero++);
                            } else {
                                System.out.print(valorLetra++);
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    banS = false;
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }         
         while (banS);
         jp.close();
    }
}