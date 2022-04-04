package Model;

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
			this.tipoServico = "Outro serviço";
		}
	}

	public String getTipoServico() {
		return tipoServico;
	}
}

//teste