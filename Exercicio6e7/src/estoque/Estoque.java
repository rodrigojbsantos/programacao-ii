/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;
/*
Solução do exercício 6
*/
/**
 *
 * @author rodrigo.jbsantos
 */
public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;
    
    public Estoque(String n, int qA, int qM ){ 
        this.nome = n;       //construtor com parâmetros - letra b
        this.qtdAtual = qA;
        this.qtdMinima = qM;
    }

    public Estoque(){ //construtor sem parâmetros - letra b)
        this.nome = null;
        this.qtdAtual = 0;
        this.qtdMinima = 0;    
    }
    
    public void mudarNome(String nome){
        this.nome = nome;
    }
    
    public void mudarQtdMinima(int qtdMinima){
        if (qtdMinima > 0){
            this.qtdMinima = qtdMinima;
        }
    }
    
    public void repor(int qtd){
            this.qtdAtual += qtd;
    }
    
    public void darBaixa(int qtd){
        if (qtdAtual > 0){
            this.qtdAtual -= qtd;
        }
    }
    
    public void mostrar(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Quantidade mínima:" + this.qtdMinima);
        System.out.println("Quantidade atual:" + this.qtdAtual);
        System.out.println();
    }
    
    public boolean precisaRepor(){
        System.out.print("Precisa repor " + this.nome + "? ");
        return qtdAtual <= qtdMinima;
   }
}
