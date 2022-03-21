/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorIntervalos;

import java.util.Scanner;

/*
Escrever um algoritmo que leia uma quantidade desconhecida de
números e conte quantos deles estão nos seguintes intervalos: [0-25],
[26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
for lido um número negativo.

Solução: Estrutura de loop com do/while e contagem em intervalos com 
operadores lógicos. Os valores de contagem são incrementados se 
atenderem à lógica e impressos ao final.
*/
/**
 *
 * @author rodrigo.jbsantos
 */
public class ContaIntervalos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int intervalo0_25 = 0;
        int intervalo26_50 = 0;
        int intervalo51_75 = 0;
        int intervalo76_100 = 0;
        System.out.println("Informe os números, teclando <enter> após cada valor:");
        do{
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 25){
                intervalo0_25++;
            }
            if (numero >= 26 && numero <= 50){
                intervalo26_50++;
            }
            if (numero >= 51 && numero <= 75){
                intervalo51_75++;
            }
            if (numero >= 76 && numero <= 100){
                intervalo76_100++;
            }
            if(numero>100){
                System.out.println("Número fora do limite. Informe novo valor!");
            }
        } while(numero>0);
        System.out.println("Intervalo 0 a 25: " + intervalo0_25 + " números");
        System.out.println("Intervalo 26 a 50: " + intervalo26_50 + " números");
        System.out.println("Intervalo 51 a 75: " + intervalo51_75 + " números");
        System.out.println("Intervalo 75 a 100: " + intervalo76_100 + " números");
    }
    
}
