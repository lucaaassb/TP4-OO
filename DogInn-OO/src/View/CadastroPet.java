package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CadastroPet implements ActionListener {
	private static JFrame janela = new JFrame ("DogInn");
	private static JLabel labelNome = new JLabel("Nome");
	private static JTextField valorNome = new JTextField(200);
	private static JLabel labelAnimal = new JLabel("Animal");
	private static JTextField valorAnimal = new JTextField(200);
	private static JLabel labelTamanho = new JLabel("Tamanho");
	private static JTextField valorTamanho = new JTextField(200);
	private static JLabel labelSexo = new JLabel("Sexo");
	private static JTextField valorSexo = new JTextField(200);
	private static JLabel labelPeso = new JLabel("Peso");
	private static JTextField valorPeso = new JTextField(200);
	private static JButton botaoCadastrar = new JButton("Cadastrar");

	
	public CadastroPet () {
		labelNome.setBounds(40, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelTamanho.setBounds(40, 50, 150, 25);
		valorTamanho.setBounds(180, 50, 180, 25);
		labelSexo.setBounds(40, 110, 180, 25);
		valorSexo.setBounds(180, 110, 180, 25);
		labelPeso.setBounds(40, 140, 150, 25);
		valorPeso.setBounds(180, 140, 180, 25);
		botaoCadastrar.setBounds(245, 175, 115, 30);
		labelAnimal.setBounds(40, 80, 150, 25);
		valorAnimal.setBounds(180, 80, 180, 25);
		
		janela.setLayout(null);
		
		janela.add(labelNome);
		janela.add(valorNome);
		janela.add(labelAnimal);
		janela.add(valorAnimal);
		janela.add(labelTamanho);
		janela.add(valorTamanho);
		janela.add(labelSexo);
		janela.add(valorSexo);
		janela.add(labelPeso);
		janela.add(valorPeso);
		janela.add(botaoCadastrar);
		
		janela.setSize(400, 250);
		janela.setVisible(true);

	}
	
	public static void main(String[] args) {
		CadastroPet menu = new CadastroPet();
		
		botaoCadastrar.addActionListener(menu);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
