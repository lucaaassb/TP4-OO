package Model;

import Model.Cliente;

public class Pet {
	String animal, tamanho, sexo, nome;
	double peso;
	Cliente cliente;
	
	Pet(String animal, String tamanho, String sexo, String nome, double peso){
		this.nome = nome;
		this.animal = animal;
		this.tamanho = tamanho;
		this.sexo = sexo;
		this.peso = peso;
	}

	public Pet() {
		
	}

	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
