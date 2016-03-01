/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios1;

/**
 *
 * @author AndresManrique
 */
public class Cadenas_parte2_clase7 {
    public static void main(String[] args) {
        String frase="Hola bienvenido a este mundo del aprogramacion andres";
        
        String fraseresumern=frase.substring(5,28); // posicion de inicio "O" y la posición del caracter que NO queremos extraer
        System.out.println(fraseresumern+ " la cuestion es venir a luchar");
        // OOTRO EJEMPLOS
        
        String a , b ;
        
        a="ANDRES";
        b="Andres";
                System.out.println(a.equals(b)); // Las cadenas son Diferentes DEBEN SE IGUALES EN MINUSCULA Y MAYUSCULA
                
              
                // LAS CADENAS SON IGUALES NO DIFERENCIA DE MAYUSCULAS Y MINUSCULAS
                System.out.println("El valor que devuelve es : "+a.equalsIgnoreCase(b)); 
                
                
                        
                
        
        
        
        
        
    }
}
