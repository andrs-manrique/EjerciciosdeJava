/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresManrique
 */
public class entradanumeros_clase10 {
     public static void main(String[] args) {
        double x =1000;
         System.out.printf("%1.2f",x/3);
         
         
         //printf  recibe dos parametros., le da dos decimales al resultado de realizar
         //icha division
         
        Scanner objeto= new Scanner(System.in);
        System.out.println(" Introduce :");
        int VaribleCadena= objeto.nextInt(); // Lee un NUMERO con el objeto Scanner
        System.out.println("inte "+ VaribleCadena);
        
        
        double valor= Double.parseDouble(JOptionPane.showInputDialog("Ingreses Su numero"));
        System.out.println("Valor es: " + valor);
        
        //recibe un String
        String num1=JOptionPane.showInputDialog("numero en string");
        double num2=Double.parseDouble(num1); // convierte el String a Double
        JOptionPane.showMessageDialog(null,"Valor es: "+ num2);
         System.out.printf("%1.2f",Math.sqrt(num2) );
         
    }
}
