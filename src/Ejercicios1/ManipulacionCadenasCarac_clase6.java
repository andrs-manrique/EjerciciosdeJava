/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios1;

/**
 * Curso Java. Manipulación de cadenas. Clase String I. Vídeo 11
 * https://www.youtube.com/watch?v=YMyJLs22uY4&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=11
 *
 * @author AndresManrique
 */
public class ManipulacionCadenasCarac_clase6 {

    public static void main(String[] args) {

        String VariableCaractere = "Hola_Andres";

        System.out.println("Saluda a: " + VariableCaractere);

        System.out.println("La cadena tiene :" + VariableCaractere.length() + " Letras");

        System.out.println("La Primera Letra es " + VariableCaractere.charAt(0) + " ");
        System.out.println("La TERCERA de " + VariableCaractere + " Letra es : " + VariableCaractere.charAt(2) + " ");
        System.out.println("La SEXTA letra de " + VariableCaractere + "   es : " + VariableCaractere.charAt(5) + " ");
        int ultima;

        ultima = VariableCaractere.length() - 1;
        System.out.println("La ULTIMA letra de " + VariableCaractere + "   es : " + VariableCaractere.charAt(ultima) );
                                    

    }

}
