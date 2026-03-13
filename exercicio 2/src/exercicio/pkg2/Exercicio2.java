/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           LivroBilioteca livro1 = new LivroBilioteca("kamasutra","chubrasco",591,2011);
        livro1.setAnoPublicacao(2014);

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("quantidade de áginas: " + livro1.getNumeroPaginas());
        System.out.println("ano de lançamento: " + livro1.getAnoPublicacao());

    }
    
}
    
    

