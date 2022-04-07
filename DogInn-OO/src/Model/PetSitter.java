package Model;

/**
 * Classe de PetSitter, contendo os metodos desta classe e servindo para
 * armazenar os dados das babás no ArrayList
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class PetSitter {
	String nomePetSitter, sobrenomePetSitter, emailPetSitter, enderecoPetSitter, senhaPetSitter, telefonePetSitter;
	
	PetSitter(String nomePetSitter, String sobrenomePetSitter, String emailPetSitter, String enderecoPetSitter, String senhaPetSitter, String telefonePetSitter) {
		this.nomePetSitter = nomePetSitter;
		this.sobrenomePetSitter = sobrenomePetSitter;
		this.emailPetSitter = emailPetSitter;
		this.enderecoPetSitter = enderecoPetSitter;
		this.senhaPetSitter = senhaPetSitter;
		this.telefonePetSitter = telefonePetSitter;
	}

	public PetSitter() {
		
	}

	public String getNomePetSitter() {
		return nomePetSitter;
	}

	public String getSobrenomePetSitter() {
		return sobrenomePetSitter;
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

	public String getCelularPetSitter() {
		return telefonePetSitter;
	}

	public void setNomePetSitter(String nomePetSitter) {
		this.nomePetSitter = nomePetSitter;
	}

	public void setSobrenomePetSitter(String sobrenomePetSitter) {
		this.sobrenomePetSitter = sobrenomePetSitter;
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

	public void setTelefonePetSitter(String telefonePetSitter) {
		this.telefonePetSitter = telefonePetSitter;
	}
}
