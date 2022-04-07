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
			tele[i] = new Telefone(061, 99044112);
			cliente[i] = new Cliente("Gabriel Cabral", "gabrielbielcabral@gmail.com", "rua 6", "senha", tele[i]);
			pets[i] = new Pet("Cachorro", "pequeno", "macho", "Pacoca", 5);
			sitter[i] = new PetSitter("Lucas Soares", "lucassoares@gmail.com", "rua 8", "Hospedagem", tele[i]);
		}
		
		for(int i = 0; i < 1; i++) {
			tele[i] = new Telefone(061, 99947412);
			cliente[i] = new Cliente("Tony Stark", "tonystark@gmail.com", "Manhatam", "senha", tele[i]);
			pets[i] = new Pet("Cachorro", "grande", "femea", "Atena", 15);
			sitter[i] = new PetSitter("Thor Odinson", "thor@gmail.com", "Asgard", "Hospedagem", tele[i]);
		}
		
		for(int i = 0; i < 1; i++) {
			tele[i] = new Telefone(061, 99834112);
			cliente[i] = new Cliente("Peter Parker", "homemaranha@gmail.com", "queens", "senha", tele[i]);
			pets[i] = new Pet("Gato", "pequeno", "macho", "Bichano", 3);
			sitter[i] = new PetSitter("Steven Strange", "doutorestranho@gmail.com", "templo", "Passeio", tele[i]);
		}
		
		for(int i = 0; i < 1; i++) {
			tele[i] = new Telefone(061, 96956680);
			cliente[i] = new Cliente("Natasha Romanoff", "viuvanegra@gmail.com", "Russia", "senha", tele[i]);
			pets[i] = new Pet("Cachorro", "médio", "femea", "Mel", 10);
			sitter[i] = new PetSitter("Steve Rogers", "capitaoamerica@gmail.com", "Brooklyn", "PetSittering", tele[i]);
		}
		
		for(int i = 0; i < 1; i++) {
			tele[i] = new Telefone(061, 40028922);
			cliente[i] = new Cliente("Wanda Maximorf", "feiticeiraescarlate@gmail.com", "Sokovia", "senha", tele[i]);
			pets[i] = new Pet("Gato", "pequeno", "femea", "Bola de Pelo", 10);
			sitter[i] = new PetSitter("Carol Danvers", "capitamarvel@gmail.com", "Boston", "Passeio", tele[i]);
		}
		qtdPet = 5;
		qtdCliente = 5;
		qtdSitter = 5;
		qtdTele = 5;
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