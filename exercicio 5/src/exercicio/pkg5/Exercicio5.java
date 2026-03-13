/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg5;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            Filme objfilme = new Filme("doctor who", "doutor", 169, "livre para todas as idades");
        objfilme.setClassificacao("10 anos");
        
        System.out.println("Nome do filme: " + objfilme.getTitulo());
        System.out.println("Diretor: " + objfilme.getDiretor());
        System.out.println("duração: " + objfilme.getDuracao());
        System.out.println("Classificação: " + objfilme.getClassificacao());
        

    }
    
}