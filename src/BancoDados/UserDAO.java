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
        ps.close();
        conexao.close();
//        if(userExiste)
//            return true;
//        return false;
//        return userExiste ? true : false;
          return u;
    }
}
