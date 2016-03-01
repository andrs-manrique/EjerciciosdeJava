package Ejercicios1;

import javax.swing.*;

/**
 *
 * @author AndresManrique
 */
public class Entrada_Cadena_JOption_Clase9 {

    public static void main(String[] args) {

        String mensaje = "";
        int edad;
        mensaje = JOptionPane.showInputDialog("Ingrese nombre:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingreses la Edad"));
        System.out.println("el mensaje es: " + mensaje);
        System.out.println("Numero Caracteres Cadena: " + mensaje.length());
        System.out.println("Su edad es: " + edad);
        System.out.println("Raiz de su edad es: " + Math.sqrt(edad));
        System.out.println("Su edad El otro año es : " + (1+ edad));
        System.out.println("Su edad El otro año es : " + (edad));

    }
}
