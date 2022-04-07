package Model;

/**
 * Classe de Contrato, contendo os metodos desta classe e servindo para
 * armazenar o contrato entre o Cliente e a Babá, sendo herdado por quase todas as classes do projeto
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class TermoDeAceite {
	String criterioCadastro;
	
	TermoDeAceite(String criterioCadastro){
		this.criterioCadastro = criterioCadastro;
	}

	public String getCriterioCadastro() {
		return criterioCadastro;
	}

	public void setCriterioCadastro(String criterioCadastro) {
		this.criterioCadastro = criterioCadastro;
	}
}

//teste
