package br.com.zup.modelo;

public class Estacionamento {
	
	// Atributos
	private int horarioEntrada;
	private int horarioSaida;
	private double valorEstacionamento;
	
	// Construtor
	public Estacionamento(int horarioEntrada, int horarioSaida, double valorEstacionamento) {
		super();
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.valorEstacionamento = valorEstacionamento;
	}
	
	// Getters & Setters
	public int getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(int horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public int getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(int horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public double getValorEstacionamento() {
		return valorEstacionamento;
	}

	public void setValorEstacionamento(double valorEstacionamento) {
		this.valorEstacionamento = valorEstacionamento;
	}
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Horário de entrada -> " + this.getHorarioEntrada() + "\n";
		modelo += "Horário de saída -> " + this.getHorarioSaida() + "\n";
		modelo += "Valor total a pagar: R$" + this.getValorEstacionamento() + "\n";
		
		return modelo;
	}
	
}
