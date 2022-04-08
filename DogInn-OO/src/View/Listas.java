package View;
/**
 * Conjunto de telas com um switch, que mostra 
 * JLists de Pet, Clientes e PetSitters já cadastrados
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controller.*;
import View.CadastroCliente;


public class Listas implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton atualizaPet;
	private JButton cadastraPet;
	private JButton atualizaCliente;
	private JButton cadastraCliente;
	private JButton atualizaSitter;
	private JButton cadastraSitter;
	private static ControleDados dados;
	private JList<String> listaPets;
	private JList<String> listaClientes;
	private JList<String> listaSitter;
	private String[] lista = new String[50];
	
	public void mostrarDados(ControleDados d, int opt) {
		dados = d;
		
		//Switch para definir qual JList será mostrada ao usuário de acordo com o botao selecionado
		switch (opt) {
		//Lista de pets
		case 1:
			lista = new ControlePet(dados).getNomePet();
			listaPets = new JList<String>(lista);
			janela = new JFrame("DogInn");
			titulo = new JLabel("Pets Cadastrados");
			atualizaPet = new JButton("Atualizar");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaPets.setBounds(20, 50, 350, 120);
			listaPets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaPets.setVisibleRowCount(10);
			
			atualizaPet.setBounds(200, 177, 100, 30);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(listaPets);
			janela.add(atualizaPet);
			
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			atualizaPet.addActionListener(this);
			listaPets.addListSelectionListener(this);
			
			break;
		
		//Lista de Clientes
		case 2:
			lista = new ControleCliente(dados).getNomeClientes();
			listaClientes = new JList<String>(lista);
			janela = new JFrame("DogInn");
			titulo = new JLabel("Clientes Cadastrados");
			cadastraCliente = new JButton("Cadastrar");
			atualizaCliente = new JButton("Atualizar");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaClientes.setBounds(20, 50, 350, 120);
			listaClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaClientes.setVisibleRowCount(10);
			
			cadastraCliente.setBounds(40, 177, 100, 30);
			atualizaCliente.setBounds(200, 177, 100, 30);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(listaClientes);
			janela.add(atualizaCliente);
			janela.add(cadastraCliente);
			
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			atualizaCliente.addActionListener(this);
			cadastraCliente.addActionListener(this);
			listaClientes.addListSelectionListener(this);
			
			break;
			
		//Lista de Sitters
		case 3:
			lista = new ControlePetSitter(dados).getNomePetSitters();
			listaSitter = new JList<String>(lista);
			janela = new JFrame("DogInn");
			titulo = new JLabel("Pet Sitters Cadastrados");
			atualizaSitter = new JButton("Atualizar");
			
			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaSitter.setBounds(20, 50, 350, 120);
			listaSitter.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaSitter.setVisibleRowCount(10);
			
			atualizaSitter.setBounds(200, 177, 100, 30);
			
			janela.setLayout(null);
			
			janela.add(titulo);
			janela.add(listaSitter);
			janela.add(atualizaSitter);
			
			janela.setSize(400, 250);
			janela.setVisible(true);
			
			atualizaSitter.addActionListener(this);
			listaSitter.addListSelectionListener(this);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == cadastraCliente)
			new CadastroCliente().cadastraCliente(dados, this, 0);
		
		//Atualiza a lista de pets
		if(src == atualizaPet) {
			listaPets.setListData(new ControlePet(dados).getNomePet());
			listaPets.updateUI();
		}
		
		//atualiza a lista de clientes
		if(src == atualizaCliente) {
			listaClientes.setListData(new ControleCliente(dados).getNomeClientes());
			listaClientes.updateUI();
		}
		
		//atualiza a lista de petSitters
		if(src == atualizaSitter) {
			listaSitter.setListData(new ControlePetSitter(dados).getNomePetSitters());
			listaSitter.updateUI();
		}
		
	}

	// implementa as ações nos elementos das JLists criadas anteriormente
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClientes) {
			new CadastroCliente().cadastraCliente(dados, this, 
					listaClientes.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaSitter) {
			new CadastroSitter().cadastraSitter(dados, this, 
					listaSitter.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaPets) {
			new CadastroPet().cadastraPet(dados, this, 
					listaPets.getSelectedIndex());
		}

	}

}
