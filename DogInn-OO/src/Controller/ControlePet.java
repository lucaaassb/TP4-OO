package Controller;

import Model.*;


public class ControlePet {
	private Pet[] a;
	private int qtdPets;
	
	public ControlePet(ControleDados d) {
		a = d.getPets();
		qtdPets = d.getQtdPet();
	}
	
	//Garantido que a quantidade de informacoes coletadas e a mesma que as passadas
	public String[] getNomePet() {
		String[] s = new String[qtdPets];
		for(int i = 0; i < qtdPets; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdPets;
	}

	public void setQtd(int qtd) {
		this.qtdPets = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}
	
	public String getAnimal(int i) {
		String animal = String.valueOf(a[i].getAnimal());
		return animal;
	}
	
	public String getTamanho(int i) {
		String tamanho = String.valueOf(a[i].getTamanho());
		return tamanho;
	}
	
	public String getSexo(int i) {
		String sexo = String.valueOf(a[i].getSexo());
		return sexo;
	}
	
	public String getPeso(int i) {
		String peso = String.valueOf(a[i].getPeso());
		return peso;
	}

}
