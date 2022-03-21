/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorAltura;

import java.util.Scanner;

/*
Desenvolver um programa que leia a altura de 15 pessoas. Este
programa deverá calcular e mostrar:
a. A menor altura do grupo;
b. A maior altura do grupo;

Solução: como não foi dito nada sobre vetores, tentei resolver 
sem fazer uso deles. A ideia é receber os 15 valores de altura
do teclado e fazer comparações sempre que uma altura for informada.
Caso seja maior que a altura anterior, é guardada na posição maiorAltura.
Caso seja menor, é guardado na posição menorAltura.
Todas os valores começam com zero e são atualizados tão logo o primeiro
*/
/**
 *
 * @author rodrigo.jbsantos
 */
public class ContaAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura, alturaMaior, alturaMenor;
        System.out.print("Fornecer altura 1: ");
        Scanner sc = new Scanner(System.in);
        altura = sc.nextFloat();
        alturaMaior = altura;
        alturaMenor = altura;
        for(int contador=0; contador<14; contador++){
            int contador2 = contador + 2;
            System.out.print("Fornecer altura " + contador2 + ": ");
            altura = sc.nextFloat();
            if(altura >= alturaMaior){
                alturaMaior = altura;  
            } 
            if(altura <= alturaMenor){
                alturaMenor = altura;
            }       
        }
        System.out.printf("Maior altura: %.2f%n", alturaMaior);
        System.out.printf("Menor altura: %.2f%n", alturaMenor);
    }
}