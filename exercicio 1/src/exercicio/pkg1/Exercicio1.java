/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ProdutoTecnologia objproduto1 = new ProdutoTecnologia("Telefone", "Motorola", 3750.88, 21);
        objproduto1.exibirProduto();
        
        System.out.println("__________________________________________");
        
        ProdutoTecnologia objproduto2 = new ProdutoTecnologia("Notebook", "Positivo", 2059.30, 20);
        objproduto2.exibirProduto();
    }
    
}