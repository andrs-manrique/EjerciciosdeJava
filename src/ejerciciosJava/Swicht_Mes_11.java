/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import javax.swing.JOptionPane;

/**
 * * Programa que pide un número de mes y muestra el nombre correspondiente
 * SWITCH
 *
 * @author AndresManrique
 */
public class Swicht_Mes_11 {

    public static void main(String[] args) {
        int meses;
        meses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        switch (meses) {
            case 0:
                JOptionPane.showMessageDialog(null, "Error, el mes ingresado no existe, intente nuevamente");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Enero");

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Febrero");

                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Marzo");

                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Abril");

                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Mayo");

                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Junio");

                break;
            case 7:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Julio");

                break;
            case 8:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Agosto");

                break;
            case 9:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Septiembre");

                break;
            case 10:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Octubre");

                break;
            case 11:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Noviembre");

                break;
            case 12:
                JOptionPane.showMessageDialog(null, "El mes " + meses + " es Diciembre");

                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, el mes ingresado no existe, intente nuevamente");

                break;
        }
    }
}
