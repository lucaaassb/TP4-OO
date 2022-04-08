package View;
/**
 * Tela para mostrar os dados do pets selecionados
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

import Controller.ControleDados;

import javax.swing.JCheckBox;

public class CadastroPet implements ActionListener {
	private static JFrame janela = new JFrame ("DogInn");
	private static JLabel labelNome = new JLabel("Nome");
	private static JTextField valorNome;
	private static JLabel labelAnimal = new JLabel("Animal");
	private static JTextField valorAnimal;
	private static JLabel labelTamanho = new JLabel("Tamanho");
	private static JTextField valorTamanho;
	private static JLabel labelSexo = new JLabel("Sexo");
	private static JTextField valorSexo ;
	private static JLabel labelPeso = new JLabel("Peso");
	private static JTextField valorPeso;
	private static JButton botaoCadastrar = new JButton("Selecionar");
	private static ControleDados dados;
	private int posicao;
	
	public void cadastraPet(ControleDados d, Listas p, int pos) {
		posicao = pos;
		dados = d;
		
		valorNome = new JTextField(dados.getPets()[pos].getNome(), 200);
		valorAnimal = new JTextField(dados.getPets()[pos].getAnimal(), 200);
		valorTamanho = new JTextField(dados.getPets()[pos].getTamanho(), 200);
		valorSexo = new JTextField(dados.getPets()[pos].getSexo(), 200);
		valorPeso = new JTextField(String.valueOf(dados.getPets()[pos].getPeso()), 200);

	
	//Posicionando os botoes e campos de texto na tela
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
		
		botaoCadastrar.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		
		if(src == botaoCadastrar)
			JOptionPane.showMessageDialog(null, 
					"Pet cadastrado com sucesso", null, 
					JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
