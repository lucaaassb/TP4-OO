package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCliente2 implements ActionListener {
	private static JFrame janela = new JFrame("DogInn");
	private static JLabel titulo = new JLabel("Cliente");
	private static JButton contratar = new JButton("Contratar serviço");
	private static JButton cadastraPet = new JButton("Cadastrar Pet");
	
	public TelaCliente2 () {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(155, 10, 150, 30);
		contratar.setBounds(115, 55, 150, 40);
		cadastraPet.setBounds(115, 105, 150, 40);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(cadastraPet);
		janela.add(contratar);
		
		janela.setSize(400, 250);
        janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCliente2 menu = new TelaCliente2();

        cadastraPet.addActionListener(menu);
        contratar.addActionListener(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	Object src = e.getSource();
    	



    }

}