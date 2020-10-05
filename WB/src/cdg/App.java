package cdg;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		String path = "C: + \\cadastros.txt";
		
		menu.printMenu();
		scan controle = new scan();
		int escolha = controle.opcao();
		
		List<clientes> cad = new ArrayList<clientes>();
		
		while(escolha != 0) {
			if(escolha == 1) {
				controle = new scan();
				
				System.out.println("Digite o nome e sobrenome do cliente");
				String nome = controle.texto();
				
				System.out.println("Digite o telefone do cliente");
				String telefone = controle.texto();
				
				System.out.println("Digite a data de nascimento do cliente");
				String data = controle.texto();
				
				System.out.println("Digite o genero do cliente ( masculino ou feminino )");
				String genero = controle.texto();
	
				clientes clientes = new clientes(nome, telefone, data, genero);
				System.out.println("\n * Cadastro concluido com sucesso. * \n");
				
				cad.add(clientes);
				
				}
				if(escolha == 9) {
					System.out.println("\nClientes já cadastrados ordenados em ordem alfabética\n");
					ArrayList<String> alfa = new ArrayList<>();
					for(clientes cadastros : cad) {
						alfa.add(cadastros.getNome());
						alfa.sort(String.CASE_INSENSITIVE_ORDER);	
					}
					System.out.println(alfa);
					
				
				}
				if(escolha == 8) {
					System.out.println("\nLista de pessoas do gênero masculino");
					for(clientes m : cad) {
						if(m.getGenero().startsWith("m") == true ) {
							System.out.println(m.getNome() + " - " + "Masculino");
						}
					}
					System.out.println("\nLista de pessoa do gênero feminino");
					for(clientes f : cad) {
						if(f.getGenero().startsWith("f") == true) {
							System.out.println(f.getNome() + " - " + "Feminino");
						}
					}
					
					
				}
				
				if(escolha == 7) {
					int datas = 0;
					int idades = 2020;
					for(clientes idade : cad) {
						datas = Integer.parseInt(idade.getData().substring(6));
						idades = idades - datas;
						System.out.println(datas);
					}
					System.out.println("A média de idade geral dos clientes cadastrados é: " + idades + " " + "anos");
				}
					
						
				
				if(escolha == 2) {
					System.out.println("\n## - Escolha o número correspondente da edição que você queira realizar - ##\n");
					menu.printEdit();
					scan selecao = new scan();
					int escolha2 = selecao.opcao();
					
						if(escolha2 == 5) {
							System.out.println("\nEscolha o ID do cliente que queira editar o nome:");
							for(clientes cadastros : cad){
								System.out.println("\n" + cad.indexOf(cadastros) + " - " + cadastros.getNome());									
							}
							scan editnome = new scan();
							int idcliente = editnome.opcao();
							
							System.out.println("\nAgora, escolha o novo nome do cadastro");
							scan newnome = new scan();
							String novonome = newnome.texto();
			
							for(clientes nomes : cad) {
								if(idcliente == cad.indexOf(nomes)) {
									nomes.setNome(novonome);	
									
								}
									System.out.println("Cliente renomeado com sucesso");
									
							}
							
							
							
						}
						if(escolha2 == 4) {
							System.out.println("\nEscolha o ID do cliente que queira editar o telefone");
							for(clientes cadastrostelefone : cad) {
								System.out.println("\n" + cad.indexOf(cadastrostelefone) + " - " + cadastrostelefone.getNome() + " - " + cadastrostelefone.getTelefone());
							}
							scan editTelefone = new scan();
							int telefoneCliente = editTelefone.opcao();
							
							System.out.println("\nAgora, escolha o novo telefone do cadastro");
							scan novoTelefone = new scan();
							String newTelefone = novoTelefone.texto();
							
							for(clientes telefones : cad) {
								if(telefoneCliente == cad.indexOf(telefones)) {
									telefones.setTelefone(newTelefone);
								}
								System.out.println("\nTelefone alterado com sucesso");
							}
							
										
						}
						
						if(escolha2 == 3) {
							System.out.println("\nEscolha o ID da data de nascimento do cliente que queira editar");
							for(clientes cadastrosnascimento : cad) {
								System.out.println(cad.indexOf(cadastrosnascimento) + " - " + cadastrosnascimento.getNome() + " - " + cadastrosnascimento.getData());
							}
							scan editData = new scan();
							int dataCliente = editData.opcao();
							
							System.out.println("\nAgora, digite a nova data de nascimento do cliente");
							scan novaData = new scan();
							String newData = novaData.texto();
							
							for(clientes datas : cad) {
								if(dataCliente == cad.indexOf(datas)) {
									datas.setData(newData);
								}
								System.out.println("\nData alterada com sucesso");
							}
						}
						if(escolha2 == 2) {
							System.out.println("\nEscolha o ID do gênero do cliente que queira editar");
							for(clientes cadastrosgenero : cad) {
								System.out.println(cad.indexOf(cadastrosgenero) + " - " + cadastrosgenero.getNome() + " - " + cadastrosgenero.getGenero());
							}
							scan editGenero = new scan();
							int generoCliente = editGenero.opcao();
							
							System.out.println("\nAgora, digite o novo gênero do cliente no cadastro");
							scan novoGenero = new scan();
							String newGenero = novoGenero.texto();
							
							for(clientes generos : cad) {
								if(generoCliente == cad.indexOf(generos)) {
									generos.setGenero(newGenero);
								}
								System.out.println("\nTelefone alterado com sucesso\n");
								
							}
						}
				}
				if(escolha == 3) {
						System.out.println("\nQual cadastro você quer remover?\n");
						for(clientes cadastros : cad) {
							System.out.println(cad.indexOf(cadastros) + " - " + cadastros.getNome());
						}
						
						System.out.println("Escolha o ID correspondente do cadastro:");
						scan escolher = new scan();
						int escolhido = escolher.opcao();
						cad.remove(escolhido);
						System.out.println("\nCadastro removido com sucesso\n");
								
						}
								
						
					if(escolha == 4) {
						cad.forEach(pessoa -> System.out.println("\n" + pessoa + "\n"));
						if (cad.isEmpty()) {
							System.out.println("ERRO: Não existem cadastros.");
					}				
			}
					if(escolha == 5) {
						FileOutputStream canal = new FileOutputStream(path);
						ObjectOutputStream escritor = new ObjectOutputStream(canal);
						escritor.writeObject(cad);
						escritor.close();
						System.out.println("\nCadastro dos clientes salvos com sucesso!\n");
					}
					if(escolha == 6) {
							FileInputStream canal = new FileInputStream(path);
							ObjectInputStream leitor = new ObjectInputStream(canal);
							cad = (List<clientes>)
							leitor.readObject();
							leitor.close();
							System.out.println("\nCadastro dos clientes lidos com sucesso!\n");
					}
			
			
			menu.printMenu();
			controle = new scan();
			escolha = controle.opcao();

		}	
	}
}



		
		
		
		
		
		


