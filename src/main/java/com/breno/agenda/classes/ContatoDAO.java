package com.breno.agenda.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
	
	public void salvar(Contato contato) {
		String sql = "INSERT INTO contato (nome, email, numero) VALUES (?, ?, ?)";
		
		try (Connection conn = conexaoDB.getConnection();
		     PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getNumero());
			
			stmt.executeUpdate();
			
			System.out.println("Contato Salvo com sucesso");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public  List<Contato> listar() {
		List<Contato> contatos = new ArrayList<>();
		
		String sql = "SELECT * FROM  contato";
		
		try (Connection conn = conexaoDB.getConnection();
			 Statement smt = conn.createStatement();
			 ResultSet rs = smt.executeQuery(sql)
			 ){
			while(rs.next()) {
				Contato contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setNumero(rs.getString("numero"));
				
				contatos.add(contato);				
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return contatos;
		
	}
	
	public void excluir(String nome) {
		String sql = "DELETE FROM contato WHERE nome = ?;";
		
		try (Connection conn = conexaoDB.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, nome);
			
			stmt.executeUpdate();
			
			System.out.println("Contato apagado com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

