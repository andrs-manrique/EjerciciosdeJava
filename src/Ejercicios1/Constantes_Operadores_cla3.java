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
public class Constantes_Operadores_cla3 {

    public static void main(String args[]) {

        final double ValorPI = 3.141592;  //DECLARACION DE UNA VARIABLE GLOBAL FINAL
        int variable = 5;
        int variableDos; // DECLARANDO LAS VARIABLES

        variableDos = 16; //Definiendo la variable No. dos

        int variables_numero_tres = variable + variableDos;
        int variables_numero_c = variable - variableDos;
        int variables_numero_d = variable * variableDos;
        float variables_numero_e = variables_numero_d / variableDos;

        System.out.println("El valor de la Variable tres es: " + variables_numero_tres);
        System.out.println("El valor de la Variable C Resta es: " + variables_numero_c);
        System.out.println("El valor de la Variable D Producto es: " + variables_numero_d);
        System.out.println("El valor de la Variable E Division es: " + variables_numero_e);
        System.out.println();
        
        if(variableDos>variables_numero_d){
            System.out.println("La variable 2 declarada 16 es mayor a producto");
        }else{
            
                        System.out.println("La variable 2 declarada 16 es MENOR a producto");
variableDos+=80;
            System.out.println("Nueva Variable DOS sumando 80: "+ variableDos);
        }
    }

}
