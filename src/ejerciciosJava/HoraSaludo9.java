/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import javax.swing.JOptionPane;

/**
 * * Programa que muestra un saludo distinto según la hora introducida

 * @author AndresManrique
 */
public class HoraSaludo9 {
    public static void main(String[] args) {
        double hora;
        hora = Double.parseDouble(JOptionPane.showInputDialog("Digite la hora actual (24hr)"));
        if (hora >= 00 && hora < 6){
    JOptionPane.showMessageDialog(null, "Buenas Madrugadas, ¿Por qué no duermes?");}
        else if (hora >= 6 && hora < 12){
    JOptionPane.showMessageDialog(null, "Buenos Dias Amiguito ¿Como estas?");
        }else if (hora >= 12 && hora < 18){
        JOptionPane.showMessageDialog(null, "Buenas tardes, ¿Ya almorzate?");}
        else if (hora >= 18 && hora == 24){
        JOptionPane.showMessageDialog(null, "Buenas Noches, vete a la cama");} 
        else {
        JOptionPane.showMessageDialog(null, "Error, esta hora no existe, el programa de cerrará");}
        
            
    }
}
