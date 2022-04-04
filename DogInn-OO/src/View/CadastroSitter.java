package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CadastroSitter implements ActionListener {
	private static JFrame janela = new JFrame ("DogInn");
	private static JLabel labelNome = new JLabel("Nome");
	private static JTextField valorNome = new JTextField(200);
	private static JLabel labelEmail = new JLabel("E-mail");
	private static JTextField valorEmail = new JTextField(200);
	private static JLabel labelEnd = new JLabel("Endereco");
	private static JTextField valorEnd = new JTextField(200);
	private static JLabel labelSenha = new JLabel("Senha");
	private static JTextField valorSenha = new JTextField(200);
	private static JLabel labelServico = new JLabel("Serviço prestado");
	private static JTextField valorServico = new JTextField(200);
	private static JLabel labelTelefone = new JLabel("Telefone");
	private static JTextField valorDDD = new JTextField(3);
	private static JTextField valorTelefone = new JTextField(10);
	private static JButton botaoCadastrar = new JButton("Cadastrar");
	private static JCheckBox termosAceite = new JCheckBox("Li e concordo com os termos");
	
	public CadastroSitter () {
		labelNome.setBounds(40, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(40, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelSenha.setBounds(40, 110, 180, 25);
		valorSenha.setBounds(180, 110, 180, 25);
		labelServico.setBounds(40, 140, 150, 25);
		valorServico.setBounds(180, 140, 180, 25);
		labelTelefone.setBounds(40, 170, 150, 25);
		valorDDD.setBounds(180, 170, 28, 25);
		valorTelefone.setBounds(210, 170, 80, 25);
		botaoCadastrar.setBounds(245, 205, 115, 30);
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
		janela.add(labelServico);
		janela.add(valorServico);
		janela.add(labelTelefone);
		janela.add(valorDDD);
		janela.add(valorTelefone);
		janela.add(botaoCadastrar);
		janela.add(termosAceite);
		
		janela.setSize(400, 280);
		janela.setVisible(true);

	}
	
	public static void main(String[] args) {
		CadastroSitter menu = new CadastroSitter();
		
		botaoCadastrar.addActionListener(menu);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
