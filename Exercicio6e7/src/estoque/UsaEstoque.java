/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estoque;
/*
Solução do exercício 7
*/
/**
 *
 * @author rodrigo.jbsantos
 */
public class UsaEstoque{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13,6);
    Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11,13);
    Estoque estoque3 = new Estoque("Mouse Ótico", 6,2);
    
    estoque1.darBaixa(5);
    estoque2.repor(7);
    estoque3.darBaixa(3);
        
    System.out.println(estoque1.precisaRepor());
    System.out.println(estoque2.precisaRepor());
    System.out.println(estoque3.precisaRepor());
    System.out.println();
    
    estoque1.mostrar();
    estoque2.mostrar();
    estoque3.mostrar();
    }
    
}
