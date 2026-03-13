/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Computador objpc = new Computador("positivo", "Intel Celeron", 82, 4324);
        objpc.setPreco(1100);

        System.out.println("Marca: " + objpc.getMarca());
        System.out.println("Processador: " + objpc.getProcessador());
        System.out.println("Memória RAM: " + objpc.getMemoriaRAM() + "GB");
        System.out.println("Preço: " + objpc.getPreco());

    }
    
}
    
    

