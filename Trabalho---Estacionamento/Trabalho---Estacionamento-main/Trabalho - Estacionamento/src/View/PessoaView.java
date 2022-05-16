package view;

import java.util.Scanner;

import model.Pessoa;

public class PessoaView {
	
	public void pessoaview (Pessoa pessoa){
		Scanner ler = new Scanner (System.in);
		
		System.out.println("***MENU PESSOA***");
		System.out.println("-");
		System.out.println("1- Cadastrar");
		System.out.println("2- Listar");
		System.out.println("3- Atualizar");
		System.out.println("4- Deletar");
		System.out.println("9- Voltar para o Menu");
		System.out.println("-");
		System.out.println("-");
		System.out.println("Aguardando a opção desejada");
		int opcao = ler.nextInt();
		System.out.println("********************");
		
		if (opcao == 9) {
			MenuView menu = new MenuView();
			menu.menu();
			
	} else if (opcao==1) {
		cadastrar();

	} else if (opcao == 2) {
		 listar(pessoa);
	} 
		
	}
	public void cadastrar() {
		Scanner ler = new Scanner (System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("****Cadastro de Pessoa****");
		System.out.println("-");
		System.out.println("Informe seu Nome:");
		pessoa.setNome(ler.next());
		System.out.println("Informe seu Telefone:");
		pessoa.setTelefone(ler.next());
		System.out.println("Informe sua E-mail:");
		pessoa.setEmail(ler.next());
		System.out.println("-");
		System.out.println("Cadastro Realizado!!!");
		System.out.println("********************");
		
		pessoaview(pessoa);
		
	}
	public void listar(Pessoa pessoa) {
		
		System.out.println("***Lista Pessoa***");
	    System.out.println("-");
	    System.out.println("Nome:"+pessoa.getNome());
	    System.out.println("Telefone:"+pessoa.getTelefone());
	    System.out.println("E-mail:"+pessoa.getEmail());
	    System.out.println("-");
	    System.out.println("*****************************");

	pessoaview(null);
	}
	}

