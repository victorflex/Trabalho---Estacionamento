package view;

import java.util.Scanner;

import model.Usuario;
import model.Veiculo;

public class VeiculoView {
	
	public void veiculomenu(Veiculo veiculo){
		Scanner ler = new Scanner (System.in);
		
		System.out.println("***MENU USUARIO***");
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
		cadastrar(veiculo);

	} else if (opcao == 2) {
		listar(null);
		
	}
	}
public void cadastrar(Veiculo veiculo) {
	Scanner ler = new Scanner (System.in);
	
	VeiculoView veiculomenu = new VeiculoView();
	VeiculoView cadastrar = new VeiculoView();
	
			System.out.println("****Cadastro Veiculo****");
			System.out.println("-");
			System.out.println("Informe a descrição");
			veiculo.setDescricao(ler.next());
			System.out.println("Informe sua Placa");
			veiculo.setPlaca(ler.next());
			System.out.println("Informe a Marca");
			veiculo.setMarca(ler.next());
			System.out.println("Informe o Ano");
			veiculo.setAno(ler.next());
			System.out.println("Informe o tipo do veiculo:");
			veiculo.setTipoveiculo(ler.next());
			System.out.println("-");
			System.out.println("Cadastro Realizado!!!");
			System.out.println("********************");
			
			veiculomenu(null);
		
	}

public void listar(Veiculo veiculo) {
	
	VeiculoView listar = new VeiculoView();

    System.out.println("***Lista de Usuario***");
    System.out.println("-");
    System.out.println("Descrição:"+veiculo.getDescricao());
    System.out.println("Placa:"+veiculo.getPlaca());
    System.out.println("Marca:"+veiculo.getMarca());
    System.out.println("Ano:"+veiculo.getAno());
    System.out.println("Tipo de veiculo:"+veiculo.getTipoveiculo());
    System.out.println("-");
    System.out.println("*****************************");

    veiculomenu(null);
}
}
