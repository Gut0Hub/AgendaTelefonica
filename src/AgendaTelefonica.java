import java.sql.*;

public class AgendaTelefonica {

    private Connection conexao;

    public AgendaTelefonica() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/agenda_telefonica";
        String usuario = "root";
        String senha = "123456";

        conexao = DriverManager.getConnection(url, usuario, senha);
    }

    public void adicionarContato(Contato contato) throws SQLException {
        String sql = "INSERT INTO contato(nome, telefone, email) VALUES (?, ?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, contato.getNome());
        stmt.setString(2, contato.getTelefone());
        stmt.setString(3, contato.getEmail());

        stmt.executeUpdate();

        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) throws SQLException {
        String sql = "DELETE FROM contato WHERE nome = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        int linhas = stmt.executeUpdate();

        if (linhas > 0) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void buscarContato(String nome) throws SQLException {
        String sql = "SELECT * FROM contato WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + nome + "%");

        ResultSet rs = stmt.executeQuery();

        boolean encontrou = false;

        while (rs.next()) {
            encontrou = true;
            System.out.println("\nID: " + rs.getInt("id"));
            System.out.println("Nome: " + rs.getString("nome"));
            System.out.println("Telefone: " + rs.getString("telefone"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("--------------------------------");
        }

        if (!encontrou) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarContatos() throws SQLException {
        String sql = "SELECT * FROM contato";

        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n===== CONTATOS CADASTRADOS =====");

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Nome: " + rs.getString("nome"));
            System.out.println("Telefone: " + rs.getString("telefone"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("--------------------------------");
        }
    }

    public void atualizarContato(String nomeBusca, String novoTelefone, String novoEmail) throws SQLException {
        String sql = "UPDATE contato SET telefone = ?, email = ? WHERE nome = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, novoTelefone);
        stmt.setString(2, novoEmail);
        stmt.setString(3, nomeBusca);

        int linhas = stmt.executeUpdate();

        if (linhas > 0) {
            System.out.println("Contato atualizado com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}