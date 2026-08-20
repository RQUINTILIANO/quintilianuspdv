<<<<<<< HEAD
package database;

import java.sql.Connection;
import java.sql.DriverManager;

//informação de banco de dados
//Driver está relacionado a biblioteca
public class Database {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/quintpdv";
	private String user = "root";
	private String password = "";
	
	//Método = função, para conectar um banco 
	public Connection conectar() {
	
		try {
			Class.forName(driver);
			return  DriverManager.getConnection(url, user, password);
			//abre a conexão com o banco (Abrir geladeira) 
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//Método para testar a conexão (Verificar status de conexão)
	public boolean testarConexao() {
		//a linha abaixo cria o objeto con Que é responsábel por estabelecer a conexão com o banco 
		Connection con = conectar();
		
		//se não conseguir estabelecer a conexão // Esse comando abre a geladeira
		if (con == null) {
			return false;
		}
		
		try {
			con.close();  //encerrar a conexão após o teste
			return true;
		} catch (Exception e) {
			//se não conseguir fechar a conexão
		System.out.println(e);
		return false;
		}
		}

}
=======
package database;

import java.sql.Connection;
import java.sql.DriverManager;

//informação de banco de dados
//Driver está relacionado a biblioteca
public class Database {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/quintpdv";
	private String user = "root";
	private String password = "";
	
	//Método = função, para conectar um banco 
	public Connection conectar() {
	
		try {
			Class.forName(driver);
			return  DriverManager.getConnection(url, user, password);
			//abre a conexão com o banco (Abrir geladeira) 
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	//Método para testar a conexão (Verificar status de conexão)
	public boolean testarConexao() {
		//a linha abaixo cria o objeto con Que é responsábel por estabelecer a conexão com o banco 
		Connection con = conectar();
		
		//se não conseguir estabelecer a conexão // Esse comando abre a geladeira
		if (con == null) {
			return false;
		}
		
		try {
			con.close();  //encerrar a conexão após o teste
			return true;
		} catch (Exception e) {
			//se não conseguir fechar a conexão
		System.out.println(e);
		return false;
		}
		}

}
>>>>>>> 0c2cd6bf67a41c2a09387f29e30829f87f53c182
