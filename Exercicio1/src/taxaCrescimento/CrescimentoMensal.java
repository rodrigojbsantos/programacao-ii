/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxaCrescimento;
/*
Exercício 1:
Supondo que a população de um país A seja de 55.000 habitantes e tem
uma taxa de crescimento mensal de 0,3%. A população de um país B tem
160.000 habitantes e tem uma taxa de crescimento mensal de 0,18%.
Faça um programa que calcule e escreva o número de meses necessários
para que a população do país A ultrapasse ou iguale a população do país
B, mantidas as taxas de crescimento.
-----------------------------------------------
Solução: Não tenho certeza se fiz o cálculo adequadamente, mas considerei
que a taxa é aplicada mensalmente e gerado um número de novos habitantes.
Esse número é adicionado ao total e a taxa é reaplicada sobre ele.
Criei uma classe Cidade com os atributos numeroHabitantes e taxaCrescimento.
Na classe CrescimentoMensal calculei a variação do número de habitantes mês
a mês.
*/
/**
 * @author rodrigo.jbsantos
 */
public class CrescimentoMensal {
public static void main(String[] args) {
      Cidade A = new Cidade();
      Cidade B = new Cidade();
      A.numeroHabitantes = 55000;
      B.numeroHabitantes = 160000;
      A.taxaCrescimento = 0.003;
      B.taxaCrescimento = 0.0018;
      double crescimentoA = A.numeroHabitantes * A.taxaCrescimento;
      double crescimentoB = B.numeroHabitantes * B.taxaCrescimento;
      int meses= 0;
      while( A.numeroHabitantes <= B.numeroHabitantes){
          A.numeroHabitantes = A.numeroHabitantes + crescimentoA;
          crescimentoA = A.numeroHabitantes * A.taxaCrescimento;
          B.numeroHabitantes = B.numeroHabitantes + crescimentoB;
          crescimentoB = B.numeroHabitantes * B.taxaCrescimento;
          meses ++;         
      }
      System.out.println("A população de A será igual ou maior que a de B em "
      + meses + " meses ou " + meses/12 + " anos.");
    }
}
