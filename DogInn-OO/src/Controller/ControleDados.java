package Controller;

import Model.*;

/**
 * Verificar os dados salvos, armazena, compara e procura nas classes
 * graficas
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 *
 */

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.preencherDados();
	}

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
	
	// Metodo que indica onde os dados dos pets devem ser cadastrados
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
	
	// Metodo que indica onde os dados dos clientes devem ser cadastrados
	public boolean inserirCliente(String[] dadosCliente) {
		if(!dadosCliente[3].matches("[0-9]+") || !dadosCliente[4].matches("[0-9]+") || 
				!dadosCliente[5].matches("[0-9]+") || !dadosCliente[6].matches("[0-9]+")) {
			return false;
		} else {
				Cliente c = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3], 
						                dadosCliente[4], new Telefone(Integer.parseInt(dadosCliente[5]),
								        Integer.parseInt(dadosCliente[6])));
				d.inserirCliente(c, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	
	// Metodo que indica onde os dados dos Sitters devem ser cadastrados
	public boolean inserirSitter(String[] dadosSitter) {
		if(!dadosSitter[3].matches("[0-9]+") || !dadosSitter[4].matches("[0-9]+") || 
				!dadosSitter[5].matches("[0-9]+") || !dadosSitter[6].matches("[0-9]+")) {
			return false;
		} else {
				PetSitter ps = new PetSitter(dadosSitter[1], dadosSitter[2], dadosSitter[3], 
						           dadosSitter[4], new Telefone(Integer.parseInt(dadosSitter[5]),
								   Integer.parseInt(dadosSitter[6])));
				d.inserirSitter(ps, Integer.parseInt(dadosSitter[0]));
				return true;
		}
	}
}
