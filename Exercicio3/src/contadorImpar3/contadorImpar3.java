/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorImpar3;

/*
Desenvolver um programa que efetue a soma de todos os números
ímpares que são múltiplos de três e que se encontram no conjunto dos
números de 1 até 500.

Solução: Usei a função mod (ou resto) para testar se o número é divisível
por 3 E se é ímpar, logo, dentro de uma operação lógica AND.
Dessa forma, só irão ser somados os números que atendam as duas condições.
A soma foi realizada com a ajuda de um contador dentro de uma estrutura for.
O resultado obtido foi 20667, batendo com a resposta esperada para os limites
solicitados no problema.
*/

/**
 *
 * @author rodrigo.jbsantos
 */
public class contadorImpar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        int soma = 0;
        for(int contador = 1; contador <=500; contador++){
            if(contador%3 == 0 && contador%2 != 0){
                soma += contador;
            }
        }
        System.out.println(soma);
    }
    
}
