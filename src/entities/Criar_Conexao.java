package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Criar_Conexao {

    final static String url = "jdbc:mysql://localhost/escolar";
    final static String user = "root";
    final static String pass = "";

    public static Connection obterConexao(){

        Connection con = null;

        try{

            con = DriverManager.getConnection(url, user, pass);

            return con;

        } catch(SQLException e){
            e.printStackTrace();
        } 

        return con;

    }


    
}
