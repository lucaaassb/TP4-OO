package Model;

/**
 * Classe de Serviços, contendo os metodos desta classe e servindo para
 * armazenar os dados dos serviços, e apresentando na combo box de cadastro de Pet Sitter
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class Servico {
	private String tipoServico;
	
	Servico(int tipoServico) {
		
		switch(tipoServico) {
		case 1:
			this.tipoServico = "Hospedagem";
			break;
		case 2:
			this.tipoServico = "Creche";
			break;
		case 3:
			this.tipoServico = "Pet Sitter";
			break;
		default:
			this.tipoServico = "Outro servi�o";
		}
	}

	public String getTipoServico() {
		return tipoServico;
	}
}

//teste