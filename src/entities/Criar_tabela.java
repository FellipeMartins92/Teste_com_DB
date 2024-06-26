package entities;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Criar_tabela {

    public static void Criar_tabela_estudantes () throws SQLException {

            Connection con = Criar_Conexao.obterConexao();

            Statement stat = con.createStatement();
        
            String criar_tabela_estudante = "Create table if not exists estudante( id INTEGER PRIMARY KEY AUTO_INCREMENT, nome varchar(100) not null, idade INTEGER );";

            stat.execute(criar_tabela_estudante);

            System.out.println("tabela criada");

        
    }
}
