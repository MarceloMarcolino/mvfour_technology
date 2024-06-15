/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marcelinho
 */
public class Evento {

    private int codigo;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    
    public Evento(String nome, String descricao, Date dataInicio, Date dataFim){
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public Evento(){
        
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
    
    public String convertDataInicio() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateString = dateFormat.format(getDataInicio());
        return dateString;
    }
    
    public String convertDataFim() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateString = dateFormat.format(getDataFim());
        return dateString;
    }
    
    
    
    @Override //Annotation: Java 5+
    public String toString(){
        var sdf = new SimpleDateFormat("dd/MM/yy");
        return String.format(
            "Nome: %s, Descrição: %s, Data Início: %s",
            nome, descricao, sdf.format(dataInicio)
        );
    }
    
    void add(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
