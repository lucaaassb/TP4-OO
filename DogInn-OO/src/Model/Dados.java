package Model;

/**
 * Classe de Dadps, contendo os metodos desta classe e servindo para
 * armazenar os dados do projeto, e ......
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 */

import java.util.*;

public class Dados {
	private  Pet[] pets = new Pet[50];
	private int qtdPet = 0;
	private Cliente [] cliente = new Cliente[50];
	private int qtdCliente = 0;
	private PetSitter[] sitter = new PetSitter[50];
	private int qtdSitter = 0;
	private Telefone[] tele = new Telefone[50];
	private int qtdTele = 0;
	
	public void preencherDados() {
		for(int i = 0; i < 1; i++) {
			tele[i] = new Telefone(061, 999044112);
			cliente[i] = new Cliente("Gabriel Cabral", "gabrielbielcabral@gmail.com", "rua 6", "senha", tele[i]);
			pets[i] = new Pet("Cachorro", "pequeno", "macho", "Pacoca", 10);
			sitter[i] = new PetSitter("Lucas Soares", "lucassoares@gmail.com", "rua 8", "senha2", tele[i]);
		}
		qtdPet = 1;
		qtdCliente = 1;
		qtdSitter = 1;
		qtdTele = 1;
	}
	
	public Pet[] getPets() {
		return pets;
	}
	
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	public int getQtdPet() {
		return qtdPet;
	}
	public void setQtdPet(int qtdPet) {
		this.qtdPet = qtdPet;
	}
	public Cliente[] getCliente() {
		return cliente;
	}
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	public int getQtdCliente() {
		return qtdCliente;
	}
	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	public PetSitter[] getSitter() {
		return sitter;
	}
	public void setSitter(PetSitter[] sitter) {
		this.sitter = sitter;
	}
	public int getQtdSitter() {
		return qtdSitter;
	}
	public void setQtdSitter(int qtdSitter) {
		this.qtdSitter = qtdSitter;
	}
	
	public Telefone[] getTele() {
		return tele;
	}
	
	public void setTele(Telefone[] tele) {
		this.tele = tele;
	}
	
	public int getQtdTele() {
		return qtdTele;
	}
	
	public void setQtdTele(int qtdTele) {
		this.qtdTele = qtdTele;
	}
	
	public void inserirPet(Pet p, int pos) {
		this.pets[pos] = p;
		if(pos == qtdPet) qtdPet++;
	}
	
	public void inserirCliente(Cliente c, int pos) {
		this.cliente[pos] = c;
		if(pos == qtdCliente) qtdCliente++;
	}

	public void inserirSitter(PetSitter ps, int pos) {
		// TODO Auto-generated method stub
		this.sitter[pos] = ps;
		if(pos == qtdSitter) qtdSitter++;
		
	}
	
}