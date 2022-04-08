package View;
/**
 * Tela para mostrar os dados do clientes selecionados
 * na JList
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import Controller.*;

public class CadastroCliente implements ActionListener {
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome");
	private JTextField valorNome;
	private JLabel labelEmail = new JLabel("E-mail");
	private JTextField valorEmail;
	private JLabel labelEnd = new JLabel("Endereco");
	private JTextField valorEnd;
	private JLabel labelSenha = new JLabel("Senha");
	private JTextField valorSenha;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoCadastrar = new JButton("Cadastrar");
	private String[] newData = new String[9];
	private JCheckBox termosAceite = new JCheckBox("Li e concordo com os termos");
	private static ControleDados dados;
	private int posicao;
	
	public void cadastraCliente (ControleDados d, Listas p, int pos) {
		posicao = pos;
		dados = d;
		
		janela = new JFrame("DogInn");
		
		valorNome = new JTextField(dados.getCliente()[pos].getNomeCliente(), 200); 
		valorEmail = new JTextField(dados.getCliente()[pos].getEmailCliente(), 200);
		valorEnd = new JTextField(dados.getCliente()[pos].getEnderecoCliente(), 200);
		valorSenha = new JTextField(dados.getCliente()[pos].getSenhaCliente(), 200);
		valorDDD = new JTextField(String.valueOf(dados.getCliente()[pos].getTelCliente().getDDD()), 3);
		valorTelefone = new JTextField(String.valueOf(dados.getCliente()[pos].getTelCliente().getNumero()), 10);
		
	
	//Montando a tela posicionando os botoes e campos de texto
		labelNome.setBounds(40, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(40, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelSenha.setBounds(40, 110, 180, 25);
		valorSenha.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(40, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 80, 25);
		botaoCadastrar.setBounds(245, 175, 115, 30);
		labelEmail.setBounds(40, 80, 150, 25);
		valorEmail.setBounds(180, 80, 180, 25);
		termosAceite.setBounds(37, 175, 190, 25);
		
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
		janela.add(botaoCadastrar);
		janela.add(termosAceite);
		
		this.janela.setSize(400, 250);
		this.janela.setVisible(true);
		
		botaoCadastrar.addActionListener(this);
	}
	//}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == botaoCadastrar) {
			try {
				boolean res;
				
				// Inserindo os dados pré cadastrados nos campos correspondentes
				newData[0] = Integer.toString(dados.getQtdCliente());
				newData[0] = Integer.toString(posicao);
				
				newData[1] = valorNome.getText();
				newData[2] = valorEmail.getText();
				newData[3] = valorEnd.getText();
				newData[4] = valorSenha.getText();
				newData[5] = valorDDD.getText();
				newData[6] = valorTelefone.getText();
				
				
				JOptionPane.showMessageDialog(null, 
					"Usuário cadastrado com sucesso", null, 
					JOptionPane.INFORMATION_MESSAGE);
			}catch (NullPointerException exc1) {
				mensagemErro();
			}
		}
	}
	
	public void mensagemErro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!", null, JOptionPane.ERROR_MESSAGE);
	}

}