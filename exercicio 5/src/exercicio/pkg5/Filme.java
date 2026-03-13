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
public class Filme {
        private String titulo;
    private String diretor;
    private int duracao;
    private String classificacao;
    
    public Filme(String titulo, String diretor, int duracao, String classificacao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public String getClassificacao(){
        return classificacao;
    }
    
}

