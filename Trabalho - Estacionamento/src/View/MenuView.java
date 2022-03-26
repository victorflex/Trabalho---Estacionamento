package View;

import java.util.Scanner;

import View.LoginView;

public class MenuView {
	Scanner ler = new Scanner (System.in);

		public void menu(){
			int opcao;
			LoginView login = new LoginView();
			MenuView menu = new MenuView();
		
			System.out.println("****MENU****");
			System.out.println("-");
			System.out.printf("1- Cadastrar Usuario \n2- Cadastrar tipo de veiculo \n3- Cadastro Veiculo \n4- Cadastrar Pessoa \n5 - Cadastrar tipo Estacionamento \n9 - Sair");
			opcao = ler.nextInt();
			System.out.println("-");
			System.out.println("********************");
			
			if (opcao==9) {
				System.out.println("Você saiu do Sistema");
				System.exit(0);
				
			} else if (opcao == 1) {
			
				UsuarioView usuario = new UsuarioView();
				usuario.usuario(null);

			}
			
			
			}
		
		}

