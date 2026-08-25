package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//importação de database
import database.Database;
import model.Fornecedores;
public class FornecedorController {
//Instânciar o banco de dados
	private Database database;

//Construtor (temq ue ter o mesmo nome da classe principal
	public FornecedorController() {
	database = new Database();
}
	//Métodos (Funções CRUD)
	
	//========================================
	//Adicionar fornecedor (CRUD CREATE)
	//========================================
	
	
	public void adicionar(Fornecedores fornecedor) throws
	SQLException {
	//Comando SQL - Passo 1	
		String sql = """
				insert into fornecedores (nome, fone, email)
				values (?, ?, ?)
				""";
		//abrir a conexão com obanco - passo 2
		Connection con = database.conectar();				
			
			
			//Executar o comando SQL - PASSO 3
			PreparedStatement stmt = con.prepareStatement(sql);
			//1,2,3 = (?,?,?)
			stmt.setString(1, fornecedor.getNome());
			stmt.setString(2, fornecedor.getFone());
			stmt.setString(3, fornecedor.getEmail());
			
			stmt.executeUpdate();
			
			//Fechar a coxão - passo 4
			stmt.close();
			con.close();
			
		

	
	}
	
}
