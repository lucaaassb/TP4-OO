package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaCliente implements ActionListener {
	private static JFrame janela = new JFrame("DogInn");
	private static JLabel titulo = new JLabel("Cliente");
	private static JButton login = new JButton("Login");
	private static JButton cadastro = new JButton("Cadastrar");
	
	public TelaCliente () {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(155, 10, 150, 30);
		login.setBounds(140, 55, 100, 40);
		cadastro.setBounds(140, 105, 100, 40);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(cadastro);
		janela.add(login);
		
		janela.setSize(400, 250);
        janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCliente menu = new TelaCliente();

        login.addActionListener(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	Object src = e.getSource();
    	
    	if(src==login)
			new LoginCliente();

    }

}