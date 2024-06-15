/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Marcelinho
 */
public class User {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    //cadastro
    private String nome;
    private String email;
    private String cpf;
    private String idade;
    private Object sexo;
    
    //construtor padrão
    public User(){}
    
    public User(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public User(String login, String senha, int tipo){
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    public User(String login, String senha, String nome, String cpf, String email, String idade){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
    
    public User(String login, String senha, String nome, String cpf, String email, String idade, Object sexo){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public int getTipo() {
        return tipo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getIdade() {
        return idade;
    }
    
    public Object getSexo(){
        return sexo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}