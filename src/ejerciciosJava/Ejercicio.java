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
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su edad ");
        Scanner scanner = new Scanner(System.in);
        double edad = scanner.nextDouble();
        if (edad >= 18) {
            System.out.println("mayor de edad");
        }
        else if  (edad < 18 && edad >= 0) {
            System.out.println("MENOR edad");
        } else {
            System.out.println("error");
        }

    // TODO code application logic here
}
}
