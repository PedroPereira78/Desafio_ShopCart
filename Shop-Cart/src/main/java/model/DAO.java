package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DAO {
	/* Conecction */
	// Parametros de conexao

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/shop?useTimezone=true&serverTimezone=UTC";

	private String user = "root";
	private String password = "olga";
	// Metodos Conexao

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {

			System.out.println(e);
			return null;

		}
	}
//teste conexao
	/*
	 * public void testeConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close(); }catch (Exception e) {
	 * System.out.println(e); }
	 * 
	 * }
	 */

	/* CRUDE CREATE */ //Alterar para contacto
	public void inserirRegisto(JavaBeans registo) {
		String create = "insert into contactos (nome, telemovel, email) values(?,?,?)";

		try {

			// iniciar a conexão
			Connection con = conectar();
			// preparar a query para executar no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// Substituir os parametros (?) pelo conteudo das variaveis JavaBeans

			pst.setString(1, registo.getNome());
			pst.setString(2, registo.getTelemovel());
			pst.setString(3, registo.getEmail());

			// Executar a query
			pst.executeUpdate();
			// Encerrar a conexão com o BD

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	/*CRUD READ*/
	
/*	public ArrayList<JavaBeans>  listaRegistos(){
		
		
		
	}*/
}
