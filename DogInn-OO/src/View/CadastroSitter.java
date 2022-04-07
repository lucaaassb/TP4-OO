package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.ControleDados;

import javax.swing.JCheckBox;

public class CadastroSitter implements ActionListener {
	private static JFrame janela;
	private static JLabel labelNome = new JLabel("Nome");
	private static JTextField valorNome;
	private static JLabel labelEmail = new JLabel("E-mail");
	private static JTextField valorEmail;
	private static JLabel labelEnd = new JLabel("Endereco");
	private static JTextField valorEnd;
	private static JLabel labelSenha = new JLabel("Serviço");
	private static JTextField valorSenha;
	private static JLabel labelTelefone = new JLabel("Telefone");
	private static JTextField valorDDD;
	private static JTextField valorTelefone;
	private String[] newData = new String[9];
	private static JButton botaoContratar = new JButton("Contratar");
	private static JCheckBox termosAceite = new JCheckBox("Li e concordo com os termos");
	private static ControleDados dados;
	private int posicao;
	
	public void cadastraSitter(ControleDados d, Listas p, int pos) {
		// TODO Auto-generated method stub
		posicao = pos;
		dados = d;
		
		janela = new JFrame("DogInn");
		
		valorNome = new JTextField(dados.getSitter()[pos].getNomePetSitter(), 200);
		valorEmail = new JTextField(dados.getSitter()[pos].getEmailPetSitter(), 200);
		valorEnd = new JTextField(dados.getSitter()[pos].getEnderecoPetSitter(), 200);
		valorSenha = new JTextField(dados.getSitter()[pos].getSenhaPetSitter(), 200);
		valorDDD = new JTextField(String.valueOf(dados.getSitter()[pos].getTelPetSitter().getDDD()), 3);
		valorTelefone = new JTextField(String.valueOf(dados.getSitter()[pos].getTelPetSitter().getNumero()), 10);
	
	//public CadastroSitter () {
		labelNome.setBounds(40, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(40, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelSenha.setBounds(40, 110, 180, 25);
		valorSenha.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(40, 170, 150, 25);
		valorDDD.setBounds(180, 170, 28, 25);
		valorTelefone.setBounds(210, 170, 80, 25);
		botaoContratar.setBounds(245, 205, 115, 30);
		labelEmail.setBounds(40, 80, 150, 25);
		valorEmail.setBounds(180, 80, 180, 25);
		termosAceite.setBounds(37, 205, 190, 25);
		
		janela.setLayout(null);
		
		janela.add(labelNome);
		janela.add(valorNome);
		janela.add(labelEmail);
		janela.add(valorEmail);
		janela.add(labelEnd);
		janela.add(valorEnd);
		janela.add(labelSenha);
		janela.add(valorSenha);
		janela.add(labelTelefone);
		janela.add(valorDDD);
		janela.add(valorTelefone);
		janela.add(botaoContratar);
		janela.add(termosAceite);
		
		janela.setSize(400, 280);
		janela.setVisible(true);
		
		botaoContratar.addActionListener(this);
	}
		


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == botaoContratar)
			JOptionPane.showMessageDialog(null, 
					"Serviço contratado com sucesso!\n Entre em contato com seu Pet Sitter", null, 
					JOptionPane.INFORMATION_MESSAGE);
		
	}

}	
