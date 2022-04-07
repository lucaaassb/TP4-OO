package Model;

/**
 * Classe de PetSitter, contendo os metodos desta classe e servindo para
 * armazenar os dados das babás no ArrayList
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class PetSitter {
	private String nomePetSitter, emailPetSitter, enderecoPetSitter, senhaPetSitter;
	private Telefone telPetSitter;
	

	
	public PetSitter() {
		super();
	}

	public PetSitter(String nomePetSitter, String emailPetSitter, String enderecoPetSitter, String senhaPetSitter,
			Telefone telPetSitter) {
		// TODO Auto-generated constructor stub
		this.nomePetSitter = nomePetSitter;
		this.emailPetSitter = emailPetSitter;
		this.enderecoPetSitter = enderecoPetSitter;
		this.senhaPetSitter = senhaPetSitter;
		this.telPetSitter = telPetSitter;
	}

	public String toString() {
		return "Nome do cliente" + nomePetSitter;
	}

	public String getNomePetSitter() {
		return nomePetSitter;
	}

	public String getEmailPetSitter() {
		return emailPetSitter;
	}

	public String getEnderecoPetSitter() {
		return enderecoPetSitter;
	}

	public String getSenhaPetSitter() {
		return senhaPetSitter;
	}

	public Telefone getTelPetSitter() {
		return telPetSitter;
	}

	public void setNomePetSitter(String nomePetSitter) {
		this.nomePetSitter = nomePetSitter;
	}

	public void setEmailPetSitter(String emailPetSitter) {
		this.emailPetSitter = emailPetSitter;
	}

	public void setEnderecoPetSitter(String enderecoPetSitter) {
		this.enderecoPetSitter = enderecoPetSitter;
	}

	public void setSenhaPetSitter(String senhaPetSitter) {
		this.senhaPetSitter = senhaPetSitter;
	}

	public void setTelPetSitter(Telefone telPetSitter) {
		this.telPetSitter = telPetSitter;
	}
}
