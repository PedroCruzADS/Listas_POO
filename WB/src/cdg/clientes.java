package cdg;

import java.io.Serializable;

@SuppressWarnings("serial")
public class clientes implements Serializable{
	private String nome;
	private String telefone;
	private String data;
	private String genero;
	
	public clientes(String nome, String telefone, String data, String genero) {
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getData() {
		return data;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		String dados = "Nome: " + nome + "\nTelefone: " + telefone + "\nData de nascimento: " + data + "\nGênero: " + genero;
		return dados;
	}

	
}






