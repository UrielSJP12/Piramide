/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide3;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Piramide3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner nfil= new Scanner (System.in);
        System.out.println("Ingrese el Numero de filas que desea");
       int filas=nfil.nextInt();
    
  
       
        for (int i = 0; i <= filas; i++) {
            System.out.print("");
            for (int j = 0; j <= filas-i; j++) {
            }
            for (int k = 0; k < 1*i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
    }
    
}
