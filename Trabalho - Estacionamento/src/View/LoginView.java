package View;

import java.util.Scanner;
import Model.Usuario;

public class LoginView {
	
		
	        public void login() {
			Scanner ler = new Scanner (System.in);
			
			
			Usuario user = new Usuario();
			
			System.out.println("**Login**");
			System.out.println("-");
			System.out.println("-");
			System.out.println("----------------");
			System.out.println("Usarname:");
			user.setUsername(ler.next());
			System.out.println("----------------");
			System.out.println("Password:");
			user.setPassword(ler.next());
			System.out.println("----------------");
			System.out.println("-");
			System.out.println("-");
			System.out.println("Logado com Sucesso");
			System.out.println("*********************");
			
			MenuView menu = new MenuView();
			menu.menu();
	}

				
			}

			

		
				

			
				
			

			

				
			
		
		

