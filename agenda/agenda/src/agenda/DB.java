package agenda;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	/*
public class DB {
	//retorna um objeto do tipo Connection
	
	
	//construtor estático 
	//acontece uma única vez no primeiro uso
	
	static {
		//carregar o Driver
		try{
			 Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e){
			throw new ExceptionInInitializerError(e);
		}
	}
	public Connection getConnection()  {
		try { 
			//conectar
			String url = "jdbc:postgresql://localhost/agenda";
			String usuario = "postgres";
			String senha = "postgres";
			Connection con = DriverManager.getConnection(url, usuario, senha);
			return con;			
		}
		catch(SQLException e){
			throw new RuntimeException(e);
			
		}
	}
	/*
	public Connection getConnection()  {
		//Necessário adicionar o jar do sgbd no buildpath do projeto
		try { 
			//carregar o Drive
			Class.forName("org.postgresql.Driver");
			//conectar
			String url = "jdbc:postgresql://localhost/agenda";
			String usuario = "postgres";
			String senha = "postgres";
			
			
		}
		//string url deve ser modificada para conectar com mysql		
		String url = "jdbc:postgresql://localhost/postgres";
		String usuario = "postgres";
		String senha = "senha";
		
		return DriverManager.getConnection(
			url, 
			usuario, 
			senha);
	}
/*
	public static void main(String[] args) {
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			System.out.println("Conexão Bem Sucedida!!");
		} catch (Exception e) {
			System.out.println("Sem conexão!!");
		}
	}*/




public class DB {
	// construtor estático
	// acontece uma única vez no primeiro uso
	// da classe
	static {
		// carregar o Driver
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public Connection getConnection() {
		try {
			// conectar
			String url = "jdbc:postgresql://localhost/agenda";
			String usuario = "postgres";
			String senha = "oi";
			Connection con = DriverManager
					.getConnection(url, usuario, senha);
			return con;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		
	}
	
}





