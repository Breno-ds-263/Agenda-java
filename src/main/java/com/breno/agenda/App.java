package com.breno.agenda;

import java.util.Scanner;

import com.breno.agenda.classes.Agenda;
import com.breno.agenda.classes.Contato;

public class App 
{
    public static void main( String[] args )
    {
    Scanner input = new Scanner(System.in);
    Agenda agenda = new Agenda();
    boolean exit = true;
    do {
    System.out.println("------------------------Bem Vindo a Agenta------------------------");
    System.out.println("Selecione 1 para salvar um contato \nSelecione 2 para mostrar todos os contatos \nSelecione 3 para apagar contato  \nSelecione 4 para sair da Agenda");
    
    int escolha = input.nextInt();
    switch (escolha) {
	case 1:
		agenda.adicionarContato();
		break;
	case 2:
		for(Contato c : agenda.mostrarContatos()) {
			System.out.println("|Nome: " + c.getNome() + "| Email: " + c.getEmail() + "| Número: " + c.getNumero() + "|");
		}
		break;
	case 3:
		System.out.println("Insira o nome da pessoa");
		String nome = input.next();
		agenda.excluirContato(nome);
		break;
	case 4:
		System.out.println("Saindo da Agenda....");
		exit = false;
		break;
		

	default:
		System.out.println("Opção inexistente");
		break;
	}
    }while(exit);
    }
}
