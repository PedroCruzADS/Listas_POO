package org.aplicacao;

import java.util.ArrayList;
import java.util.List;

import org.controle.Controle;
import org.controle.ControleMenu;
import org.controle.Menu;
import org.modelo.Cliente;

public class App {

	public static void main(String[] args) {
		Controle controle = new Controle();
		ControleMenu controlemenu = new ControleMenu();
		List<Cliente> clientes = new ArrayList<>();

		try {
			clientes = controlemenu.recuperarDados(clientes);
		} catch (Exception e) {
			System.out.println("Algo deu errado na leitura!");
			e.printStackTrace();
		}

		int escolha = 0;
		while (escolha != 7) {
			try {
				controlemenu.salvarDados(clientes);
			} catch (Exception e) {
				System.out.println("Algo deu errado no salvamento!");
				e.printStackTrace();
			}
			Menu.mostrarMenu();
			escolha = controle.opcao();

			if (escolha == 1) {
				controlemenu.cadastrarCliente(clientes, controle);
			}

			if (escolha == 2) {
				controlemenu.cadastrarVeiculo(clientes, controle);
			}

			if (escolha == 3) {
				controlemenu.agendarRevisao(clientes, controle);
			}

			if (escolha == 4) {
				controlemenu.alterarAgendamento(clientes, controle);
			}

			if (escolha == 5) {
				controlemenu.cancelarAgendamento(clientes, controle);
			}

			if (escolha == 6) {
				controlemenu.relatoriosServicos(clientes, controle);
			}
		}
		System.out.println("Aplicação Finalizada!");

	}

}
