/* * programa que lee una nota y escribe la calificación correspondiente

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
public class Nota_Calificacion {

    public static void main(String[] args) {

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una Nota.( Entre 1 y 5 ) :"));

        if (nota == 1) {
            JOptionPane.showMessageDialog(null, "Su nota es D");
        } else if (nota == 2) {

            JOptionPane.showMessageDialog(null, "Su nota es I");

        } else if (nota == 3) {

            JOptionPane.showMessageDialog(null, "Su nota es A");

        } else if (nota == 4) {

            JOptionPane.showMessageDialog(null, "Su nota es S");

        } else if (nota == 5) {

            JOptionPane.showMessageDialog(null, "Su nota es e");

        } else {

            JOptionPane.showMessageDialog(null, "Ingrese un Valor adecuado Entre 1 y 5");

        }

    }

}
