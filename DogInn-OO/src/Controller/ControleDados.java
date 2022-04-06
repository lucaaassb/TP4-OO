package Controller;

import Model.*;
import Model.Dados;

public class ControleDados {
	private Dados d = new Dados();

	public Dados getD() {
		return d;
	}

	public void setD(Dados d) {
		this.d = d;
	}
	
	public Pet[] getPets() {
		return this.d.getPets();
	}
	
	public int getQtdPet() {
		return this.d.getQtdPet();
	}
	
	public int getQtdCliente() {
		return this.d.getQtdCliente();
	}
	
	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	
	public PetSitter[] getSitter() {
		return this.d.getSitter();
	}
	
	public int getQtdSitter() {
		return this.d.getQtdSitter();
	}
	
	public boolean inserirPet(String[] dadosPet) {
		if(!dadosPet[3].matches("[0-9]+") || !dadosPet[4].matches("[0-9]+") || 
				!dadosPet[5].matches("[0-9]+") || !dadosPet[6].matches("[0-9]+")) {
			return false;
		} else {
				Pet p = new Pet(dadosPet[1], (dadosPet[2]), 
						(dadosPet[3]), (dadosPet[4]), Double.parseDouble(dadosPet[6]));
				d.inserirPet(p, Integer.parseInt(dadosPet[0]));
				return true;
		}
	}

}
