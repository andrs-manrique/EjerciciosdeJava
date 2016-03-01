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
public class If_else_salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = scanner.nextInt(); 
                System.out.println("Ingrese su salario: ");

        double salario = scanner.nextDouble();
                System.out.println("Ingrese el año de entrada: ");
        double netosalario;

        int fecha = scanner.nextInt();
        if (salario > 1200000 && fecha > 1990){
        netosalario = salario - salario * 0.08;

        }
        else if (salario < 550000 && fecha == 1990){
        netosalario = salario - salario * 0.02; 

        }
        else{
        
            netosalario = salario - salario * 0.05;

        }
        
                        System.out.println("su numero de cedula es: " + cedula + "\nsu salario es: " + netosalario);

            
        
        
        
    }
}
