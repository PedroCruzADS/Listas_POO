package org.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Veiculo implements Serializable {
	public String numeroplaca;
	public String modelo;
	public String anofabricacao;
	public String valorcompra;
	public List<Servico> servicos = new ArrayList<>();

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s", numeroplaca, modelo, anofabricacao, valorcompra);
	}
}
