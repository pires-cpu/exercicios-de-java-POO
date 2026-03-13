/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   FuncionarioEmpresa objfuncionario1 = new FuncionarioEmpresa(
        "Rafael paffrath","fachineiro", 9999.90,"limpador de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario1.getNome());
        System.out.println("Cargo: " + objfuncionario1.getCargo());
        System.out.println("");
        
        FuncionarioEmpresa objfuncionario2 = new FuncionarioEmpresa(
        "Arthur dezanet", "analista", 1530.75, "Analista de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario2.getNome());
        System.out.println("Cargo: " + objfuncionario2.getCargo());
        System.out.println("");
        
        FuncionarioEmpresa objfuncionario3 = new FuncionarioEmpresa(
        "henrique ibarra", "chefe", 88787.85, "lider de Departamento Pessoal");
        System.out.println("Nome do funcionario: " + objfuncionario3.getNome());
        System.out.println("Cargo: " + objfuncionario3.getCargo());
        

    }
    
}