/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresManrique
 */
public class Condicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
          menu = Integer.parseInt(JOptionPane.showInputDialog("Menu \n0 = Suma \n 1= resta \n2=Producto \n\nEnter option."));
        switch (menu) {
            case 0:
                JOptionPane.showMessageDialog(null, "Va a hacer una suma de dos numeros");
                //System.out.println("Va a hacer una suma de dos numeros");
                double n1,  n2;
                double resultado = 0;
                Scanner sc = new Scanner(System.in);
                //System.out.print("Introduzca el primer número de tipo double: ");
                //n1 = sc.nextDouble();
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número: "));
                //System.out.print("Introduzca el segundo número de tipo double: ");
                                n2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número: "));

                //n2 = sc.nextDouble();
                resultado = n1 + n2;
                //System.out.println("El resultado de " + n1 + " + " + n2 + " es : " + resultado);
                
                JOptionPane.showMessageDialog(null, "El resultado es : " + resultado);
                                JOptionPane.showMessageDialog(null, "Gracias por todo");


                break;
            case 1:
             System.out.println("Va a hacer una Diferencia  de dos numeros");
                     double n3,  n4;
                Scanner e = new Scanner(System.in);
                System.out.print("Introduzca el primer número de tipo double: ");
                n3 = e.nextDouble();
                System.out.print("Introduzca el segundo número de tipo double: ");
                n4 = e.nextDouble();
                resultado = n3 - n4;
                System.out.println("El resultado de " + n3 + " - " + n4 + " es : " + resultado);
                break;
                
                
            case 2:
                System.out.println("Está en la edad de jubilación");
                break;
            default:
                System.out.println("La edad no es crítica");
                break;
        }
    }
    // TODO code application logic here
}
