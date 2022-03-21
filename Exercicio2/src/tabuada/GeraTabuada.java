/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
*/
/**
 *
 * @author rodrigo.jbsantos
 */
public class GeraTabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o numeral para gerar a tabuada: ");
        int numeral, numero;
        numero = 1;
        numeral = sc.nextInt();
        System.out.println("o   Tabuada de " + numeral + ":");
        for(int contador = 1; contador < 11; contador++){
            int operacaoMais = numeral * numero;
            System.out.println("o   " + numeral + " X "+ contador + " = " + operacaoMais);
            numero++;
        }

        
    }
    
}
