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
public class FuncionarioEmpresa {
      private String nome;
    private String cargo;
    private double salario;
    private String departamento;
    
    public FuncionarioEmpresa(String nome, String cargo, double salario, String departamento){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    public void setNome(String nome){
        this.nome = nome;        
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;        
    }
    
    public void setSalario(double salario){
        this.salario = salario;        
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public String getDepartamento(){
        return departamento;
    }
}
