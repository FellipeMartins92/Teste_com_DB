package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selecionar_estudantes {

    public static void Selecionar_estudantes_pesquisa(){

        Connection con = Criar_Conexao.obterConexao();

        String comando_sql = "Select * from estudante";

        try{
            PreparedStatement prep = con.prepareStatement(comando_sql);
            ResultSet resultado = prep.executeQuery();

            while(resultado.next()){

                int id = resultado.getInt("id");

                String nome = resultado.getString("nome");

                int idade = resultado.getInt("idade");
                
                System.out.println(id + " " + nome + " " + idade);
            }

        } catch(SQLException e){

            e.printStackTrace();

        }


    }
}
