/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelinho
 */
public class EventoDAO {

    public List<Evento> listar() throws Exception {
        //construir uma lista
        var eventos = new ArrayList<Evento>();
        //1. Especificar o comando SQL
        var sql = "SELECT * FROM tb_evento_mvfour";
        //2. Estabelecer uma conexão com O SGBD
        //try-with-resources
        try (
                var conexao = new ConnectionFactory().conectar(); //3. Preparar o comando
                 var ps = conexao.prepareStatement(sql); //4. Substituir os eventos placeholders
                //5. Executar o comando
                 var rs = ps.executeQuery();) {
            while (rs.next()) {
                //6. Lidar com o resultado
                var codigo = rs.getInt("cod_evento");
                var nome = rs.getString("nome");
                var descricao = rs.getString("descricao");
                java.util.Date dataInicio = rs.getDate("data_inicio");
                java.util.Date dataFim = rs.getDate("data_fim");
                var evento = new Evento();
                evento.setCodigo(codigo);
                evento.setNome(nome);
                evento.setDescricao(descricao);
                evento.setDataInicio(dataInicio);
                evento.setDataFim(dataFim);
                eventos.add(evento);
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources
            //8. Devolvo a coleção construída
            return eventos;
        }
    }
        public boolean existe(Evento e) throws Exception {
        var sql = "SELECT * FROM tb_evento_mvfour nome WHERE nome = ? AND  descricao = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, e.getNome());
        ps.setString(2, e.getDescricao());
        var rs = ps.executeQuery();
        var eventoExiste = rs.next();
        

        rs.close();
        conexao.close();
        ps.close();

        return eventoExiste;
    }
    
    public void create(Evento e) throws Exception{
    
        var sql = "INSERT INTO tb_evento_mvfour (nome, descricao, data_inicio, data_fim) VALUES (?, ?, ?, ?)";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
            
            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());    
            ps.setString(3, e.convertDataInicio());
            ps.setString(4, e.convertDataFim());
            
            ps.execute();
        //6. Fechar a conexão
            conexao.close();
         
               
    }
    
    public static void main(String[] args) throws Exception{
        var eventoDAO = new EventoDAO();
        var eventos = eventoDAO.listar();
        for (Evento e : eventos){
            System.out.println(e);
                    
        }
    }
}
