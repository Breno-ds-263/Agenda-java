package com.breno.agenda.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private  List<Contato> contatos;
	
	ContatoDAO contatoDAO = new ContatoDAO();
	public Agenda() {
		this.contatos = new ArrayList<>();
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public  void  adicionarContato() {
		Scanner scanner = new Scanner(System.in);
		Contato contato = new Contato();
		System.out.println("Insira o nome do contato");
		String nome = scanner.nextLine();
		contato.setNome(nome);
		System.out.println("Insira o email do contato");
		String email = scanner.nextLine();
		contato.setEmail(email);
		System.out.println("Insira o numero do contato");
		String numero = scanner.nextLine();
		contato.setNumero(numero);
		
		System.out.println("Contato adicionado!");
		
		contatoDAO.salvar(contato);
		
		
		}
	public List<Contato> mostrarContatos() {
		return contatoDAO.listar();
	}
	

}
