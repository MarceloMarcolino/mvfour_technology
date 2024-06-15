/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import Modelos.User;

/**
 *
 * @author Marcelinho
 */
public class UserDAO {
     //tipo de retorno, nome, lista de parametros, corpo
    public User existe(User u) throws Exception{
        //1. Especificar o comando SQL (SELECT)
        var sql = "SELECT * FROM tb_user_mvfour WHERE login = ? AND  senha = ?";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. Executar o comando
        var rs = ps.executeQuery();
        //6. Tratar o resultado e devolver true ou false
        var userExiste = rs.next();
        if(userExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u = null;
        }
        //7. Fechar a conexão
        rs.close();
        conexao.close();
        ps.close();
//        if(userExiste)
//            return true;
//        return false;
//        return userExiste ? true : false;
          return u;
    }
    
    
    public boolean ha(User u) throws Exception {
        var sql = "SELECT * FROM tb_user_mvfour login WHERE login = ? AND  senha = ?";
        var conexao = new ConnectionFactory().conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        var rs = ps.executeQuery();
        var userExiste = rs.next();
        if(userExiste){
            var tipo = rs.getInt("tipo");
            u.setTipo(tipo);
        }
        else{
            u = null;
        }

        rs.close();
        conexao.close();
        ps.close();

        return userExiste;
    }
    
    public void cadastrar(User u) throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO tb_user_mvfour (login, senha, nome, email, cpf, idade, sexo) VALUES(?, ?, ?, ?, ?, ?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        ps.setString(3, u.getNome());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getCpf());
        ps.setString(6, u.getIdade());
        ps.setObject(7, u.getSexo());
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }
}
