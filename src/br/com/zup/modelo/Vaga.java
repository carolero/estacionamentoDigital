package br.com.zup.modelo;

public class Vaga {
	
	// Atributos
	private String tipoVaga;
	private boolean disponibilidade;
	private int vagasCarros;
	private int vagasMoto;
	
	// Construtors
	public Vaga(String tipoVaga, boolean disponibilidade, int vagasCarros, int vagasMoto) {
		super();
		this.tipoVaga = tipoVaga;
		this.disponibilidade = disponibilidade;
		this.vagasCarros = vagasCarros;
		this.vagasMoto = vagasMoto;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getVagasCarros() {
		return vagasCarros;
	}

	public void setVagasCarros(int vagasCarros) {
		this.vagasCarros = vagasCarros;
	}

	public int getVagasMoto() {
		return vagasMoto;
	}

	public void setVagasMoto(int vagasMoto) {
		this.vagasMoto = vagasMoto;
	}
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Tipo da vaga -> " + this.getTipoVaga() + "\n";
		modelo += "Disponibilidade -> " + this.isDisponibilidade() + "\n";
		modelo += "Vagas para carro -> " + this.getVagasCarros() + "\n";
		modelo += "Vagas para moto -> " + this.getVagasMoto() + "\n";
		
		return modelo;
	}


}
