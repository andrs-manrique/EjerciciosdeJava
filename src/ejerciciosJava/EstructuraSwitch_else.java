/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import javax.swing.JOptionPane;

/**
 *
 * @author AndresManrique
 */
public class EstructuraSwitch_else {

    public static void main(String[] args) {

        int categoria;
        double ventas, comisionVenta=0;

        categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su categoria:", null));
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Su Venta:", null));

        switch (categoria) {
            case 1:
                comisionVenta = ventas * 0.1;
                break;
            case 2:
                comisionVenta = ventas * 0.2;

                break;
            case 3:
                comisionVenta = ventas * 0.35;

                break;
            case 4:
                comisionVenta = ventas * 0.45;

                break;
            case 5:
                comisionVenta = ventas * 0.5;

                break;
            case 6:
                comisionVenta = ventas * 0.6;

                break;
            default:
//error;        JOptionPane.showMessageDialog(null, "");
        JOptionPane.showMessageDialog(null, "ERROR NO EXISTE");

                break;
                

        }
                                JOptionPane.showMessageDialog(null, "Comisión de: " + comisionVenta);

    }

}
