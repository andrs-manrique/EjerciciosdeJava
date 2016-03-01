/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author AndresManrique
 */
public class dosUmeroSwicth12 {
    public static void main(String[] args) throws IOException{
        
        int a, b;
        char Y,op;
        int opc=0;
        int resultado;
          int i, c=0;
          
      // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cadena, palabra="", mostrar = null;
        
  
  cadena = JOptionPane.showInputDialog("¿Cual es tu OPCION DE OPERACION?"); 
  
       // System.out.println("Ingrese la Operacion: ");
     //   JOptionPane.showInputDialog("Ingrese la Operacion:");
       // cadena=br.toString(   );
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero B: "));
     
        switch (cadena) {
            case "+":
                resultado = a + b;
                JOptionPane.showMessageDialog(null, "La SUMA es: " + resultado);

                break;
            case "-":
                resultado = a - b;
                                JOptionPane.showMessageDialog(null, "La RESTA es: " + resultado);

                break;
            case "*":
                resultado = a * b;
                                JOptionPane.showMessageDialog(null, "La PRODUCTO es: " + resultado);

                break;
            case "/":
               
                if (b!=0){
                 resultado = a / b;
                                 JOptionPane.showMessageDialog(null, "La DIV es: " + resultado);

                }else{
                                JOptionPane.showMessageDialog(null, "ERROR B Diferente de Cero (0) ");

                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO HAY OPCION");

                break;

        }
        
    }
}
