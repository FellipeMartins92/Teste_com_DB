import entities.Criar_Conexao;
import entities.Criar_db;
import entities.Criar_tabela;
import entities.Inserir_estudante;
import entities.Selecionar_estudantes;

public class App {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Criar_Conexao.obterConexao();

        Criar_db.Criar_db_novo();

        Criar_tabela.Criar_tabela_estudantes();

        Inserir_estudante novo_estudante = new Inserir_estudante("felpessss", 25);

        novo_estudante.Inserir_na_tabela_seguro();

        Selecionar_estudantes.Selecionar_estudantes_pesquisa();

    }
}
