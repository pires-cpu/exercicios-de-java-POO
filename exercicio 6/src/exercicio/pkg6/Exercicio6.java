/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg6;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        ContaEnergia conta1 = new ContaEnergia("Rafael pires", 84723, 970, 213.30);

        conta1.setConsumoKwh(300);

        // Mostrando os dados
        System.out.println("Cliente: " + conta1.getNomeCliente());
        System.out.println("Numero da instalação: " + conta1.getNumeroInstalacao());
        System.out.println("Consumo: " + conta1.getConsumoKwh() + "Kwh");
        System.out.println("Valor: " + conta1.getValorConta());
    }
    
}