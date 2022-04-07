package Model;

public class Dados {
	private  Pet[] pets = new Pet[50];
	private int qtdPet = 0;
	private Cliente [] cliente = new Cliente[50];
	private int qtdCliente = 0;
	private PetSitter[] sitter = new PetSitter[50];
	private int qtdSitter = 0;
	
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