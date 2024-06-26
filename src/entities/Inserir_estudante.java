package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserir_estudante {
    
    String nome;
    int idade;

   
    public Inserir_estudante(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    public void Inserir_na_tabela() throws SQLException{
        
        String comando_sql = "Insert into estudante(nome,idade) values('"+this.nome+ "','" +this.idade + "' ); ";

        Connection con = Criar_Conexao.obterConexao();

        Statement stat = con.createStatement();

        stat.execute(comando_sql);
            


    }

    public void Inserir_na_tabela_seguro() throws SQLException{

        Connection con = Criar_Conexao.obterConexao();

        String comando_sql = "Insert into estudante(nome,idade) values ( ? , ? )";

        PreparedStatement prep = con.prepareStatement(comando_sql);

        prep.setInt(2, this.idade);
        prep.setString(1, this.nome);

        prep.execute();

    }

}


