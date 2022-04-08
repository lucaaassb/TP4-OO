package Controller;

import Model.*;

/**
 * Verificar os dados salvos de Clientes, armazena, compara e procura nas classes
 * graficas
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 *
 */

public class ControleCliente {
	private Cliente[] c;
	private int qtdCliente;
	
	public ControleCliente(ControleDados d) {
		c = d.getCliente();
		qtdCliente = d.getQtdCliente();
	}
	//Garantido que a quantidade de informacoes coletadas e a mesma que as passadas
	public String[] getNomeClientes() {
		String[] s = new String[qtdCliente];
		for(int i = 0; i < qtdCliente; i++) {
			s[i] = c[i].getNomeCliente();
		}
		
		return s;
	}
	 public int getQtd() {
		 return qtdCliente;
	 }
	 
	 public void setQtd(int qtd) {
		 this.qtdCliente = qtd;
	 }
	 
	 public String getNome(int i) {		
			return c[i].getNomeCliente();
	 }
	 
	 public String getEmailCliente(int i) {		
			return c[i].getEmailCliente();
	 }
	 
	 public void setQtdCliente(int qtdCliente) {
			this.qtdCliente = qtdCliente;
	 }
	 
	 public String getEnderecoCliente(int i) {		
			return c[i].getEnderecoCliente();
	 }
	 
	 public Telefone getTelCliente(int i) {
			return c[i].getTelCliente();
	 }
	 
	 public String getSenhaCliente(int i) {		
			return c[i].getSenhaCliente();
	 }

}
