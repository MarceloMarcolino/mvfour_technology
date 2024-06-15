/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Marcelinho
 */
public class ConnectionFactory {
    String host = "db-mv4-technology-mvfour-technology.f.aivencloud.com";
    String port = "19841";
    String user = "avnadmin";
    String password = "";
    String database = "defaultdb";
    
    //4 partes: tipo de retorno, nome, lista de parâmetros e corpo
    Connection conectar() throws Exception{
        //montar uma string de conexão
        //https://google.com:80/search?q=uva&condicao=chuvosa
        //jdbc:postgresql://host:port/database
        //java10+
        var stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );
//        String nome = "Ana";
//        int idade = 20;
        //Meu nome é Ana e tenho 20 anos
        //concatenação
//        String solucao1 = "Meu nome é " + nome + " e tenho " + idade + " anos";
//        String solucao2 = String.format(
//            "Meu nome é %s e tenho %d anos, juro que tenho %d anos",
//            nome, idade, idade
//        );
    }
}
