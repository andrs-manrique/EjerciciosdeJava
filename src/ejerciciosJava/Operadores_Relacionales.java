/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import java.util.Scanner;

/**
 *
 * @author AndresManrique
 */
public class Operadores_Relacionales {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un valor de tipo entero");
                Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 30)
            System.out.println("n es menor que 30");
        if (n == 60)
            System.out.println("n es igual  60");
        else 
            System.out.println("n es mayor o igual a 90");
        
        System.out.println("");
    }
    
}
