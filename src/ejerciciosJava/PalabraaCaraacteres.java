/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosJava;

/**
 *
 * @author AndresManrique
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PalabraaCaraacteres {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i, c=0;
        String cadena, palabra="", mostrar = null;

        System.out.println("Ingrese la cadena: ");
        cadena=br.readLine();
        cadena+=" ";
           System.out.println("Su longitud es: "+cadena);

        for(i=0;i<cadena.length();i++){
            palabra=palabra+cadena.charAt(i);
            if(cadena.charAt(i)==' '){
                if(palabra.length()-1>c){
                    c=palabra.length()-1;
                    mostrar=palabra.trim();
                }
                palabra="";
            } 
        }
        System.out.println("La palabra de mayor longitud es: "+mostrar);
        System.out.println("Su longitud es: "+c);
    }
}