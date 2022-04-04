package Model;

import Model.Cliente;

public class Pet {
	String raca, tamanho, sexo, nome;
	double peso;
	Cliente cliente;
	
	Pet(String raca, String tamanho, String sexo, String nome, double peso){
		this.nome = nome;
		this.raca = raca;
		this.tamanho = tamanho;
		this.sexo = sexo;
		this.peso = peso;
	}

	public Pet() {
		
	}

	public String getRaca() {
		return raca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getSexo() {
		return sexo;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
