package Model;
public class Cliente {
	String nomeCliente, sobrenomeCliente, emailCliente, enderecoCliente, senhaCliente, telefoneCliente;

	Cliente(String nomeCliente, String sobrenomeCliente, String emailCliente, String enderecoCliente, String senhaCliente, String telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.senhaCliente = senhaCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public Cliente() {
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public String getCelularCliente() {
		return telefoneCliente;
	}
	
}
