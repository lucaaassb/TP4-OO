package Controller;

import Model.*;

public class ControlePetSitter {
	private PetSitter[] ps;
	private int qtdSitter;
	
	public ControlePetSitter(ControleDados d) {
		ps = d.getSitter();
		qtdSitter = d.getQtdSitter();
	}
	
	public String[] getNomePetSitters() {
		String[] s = new String[qtdSitter];
		for(int i = 0; i < qtdSitter; i++) {
			s[i] = ps[i].getNomePetSitter();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdSitter;
	}
	
	public void setQtd(int qtd) {
		this.qtdSitter = qtd;
	}
	
	public String getNome(int i) {
		return ps[i].getNomePetSitter();
	}
	
	public String getEmailPetSitter(int i) {		
		return ps[i].getEmailPetSitter();
	}
	
	 public void setQtdSitter(int qtdSitter) {
			this.qtdSitter = qtdSitter;
	 }
	 
	 public String getEnderecoPetSitter(int i) {		
			return ps[i].getEnderecoPetSitter();
	 }
	 
	 public Telefone getTelPetSitter(int i) {
			return ps[i].getTelPetSitter();
	 }
	 
	 public String getSenhaPetSitter(int i) {		
			return ps[i].getSenhaPetSitter();
	 }

}
