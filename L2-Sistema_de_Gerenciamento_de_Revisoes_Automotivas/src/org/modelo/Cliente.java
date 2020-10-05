package org.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Cliente implements Serializable {
	public String nome;
	public String telefone;
	public String endereco;
	public String cpf;
	public List<Veiculo> veiculos = new ArrayList<>();

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s", nome, telefone, endereco, cpf);
	}
}
