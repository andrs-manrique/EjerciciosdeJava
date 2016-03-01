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
public class Entrada_Salida_datos_Clase8 {
    public static void main(String[] args) {
        
                                JOptionPane.showMessageDialog(null, "WELCOME");

        
        String Palabra;
        
        //SCANNER ES LA CLASE
        Scanner a = new Scanner(System.in); // construir un objeto del tipo Scaner
        
        System.out.println("Introduce tu nombre:");
        
        //CUANDO LOS METODOS NO SON ESTATICOS DEBO CREAR UN OBJETO ANTES
        
        String variableNombuser=a.nextLine(); // se espera a que introduzca un valor String y lo almacena en NOmbreUsuario
        
        System.out.println("Ingresa Edad, por favor:");
        int edad=a.nextInt();
        
        System.out.println("Su nombre es: "+variableNombuser + " Su nombre tiene "+variableNombuser.length() +" Letras, \n y Su edad el otro año es :"+(edad+1) );
        
        
        // la clase scanner nos permite introducir información 
        // desde la consola, como dispositivo de entrada y salida
        // Scaner tiene 3 metodos muy importantes
        // Nextline : entrada de letras
        //nextIn: entrada de numeros  y NextDouble
        
        

        
        
        
        
        
        
    }
            
}
