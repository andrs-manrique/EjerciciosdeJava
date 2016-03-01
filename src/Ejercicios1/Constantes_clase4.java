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
public class Constantes_clase4 {
 public static void main(String args[]) {
        final double ValorPI = 3.14159265358979323846;  //DECLARACION DE UNA VARIABLE GLOBAL FINAL
        double nombreVariable = 5;
        double variableDeclaradaDos; // DECLARANDO LAS VARIABLES
        System.out.println(ValorPI);
        double radio=5;
        double AreadeunCirculo;
        AreadeunCirculo= ValorPI*(radio*radio);
        System.out.println("Area Circulo Radio: "+radio+" es :"+ AreadeunCirculo);
    }
 // Tambien podemos declarar variables así
 // int var1, bar2,numer3,numerofinal;
 
}
