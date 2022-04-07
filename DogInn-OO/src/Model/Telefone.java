package Model;

/**
 * Classe de Telefone, contendo os metodos desta classe e servindo para
 * armazenar os dados dos telefones dos clientes
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 */

public class Telefone {
	
	private int DDD;
	private int numero;
	

	public Telefone(int cod, int num) {
		DDD = cod;
		numero = num;
	}
	
	public Telefone() {
		
	}
	
	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}

	public int getDDD() {
		return DDD;
	}


	public void setDDD(int dDD) {
		DDD = dDD;
	}


	public int getNumero() {
		return numero;
	}
}
