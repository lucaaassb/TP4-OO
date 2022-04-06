package Model;

import java.util.*;

import modelo.Telefone;

public class Cliente {
	private String nomeCliente, emailCliente, enderecoCliente, senhaCliente;
	private Telefone telCliente;

	public Cliente(String nomeCliente, String emailCliente, String enderecoCliente, String senhaCliente, Telefone telCliente) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.senhaCliente = senhaCliente;
		this.telCliente = telCliente;
	}

	public Cliente() {
		super();
	}
	
	public String toString() {
		return "Nome do cliente" + nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	public Telefone getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(Telefone telCliente) {
		this.telCliente = telCliente;
	}
}
