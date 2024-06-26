package entities;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Criar_db {

    public static void Criar_db_novo () throws SQLException {

        Connection con = Criar_Conexao.obterConexao();

        Statement stat = con.createStatement();

        String comando_criar_db = "CREATE DATABASE IF NOT EXISTS escolar";

        stat.execute(comando_criar_db);

        System.out.println("criou com sucesso");

    }
    
}
