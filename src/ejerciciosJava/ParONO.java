/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
package ejerciciosJava;

import javax.swing.JOptionPane;

/**
 *
 * @author AndresManrique
 */
public class ParONO {

    public static void main(String[] args) {
        double x;
        double y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor: "));
        y = x % 2;
        if (y == 1) {
            JOptionPane.showMessageDialog(null, "El numero " + x + " es impar");
        } else if (y == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + x + " es par");
        }

    }

}
