package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginCliente implements ActionListener {
	
	private static JFrame janela = new JFrame("DogInn");
	private static JLabel user = new JLabel("Email");
	private static JTextField userText = new JTextField(20);
	private static JLabel senha = new JLabel("Senha");
	private static JPasswordField senhaText = new JPasswordField(20);
	private static JButton login = new JButton("Login");
	
	public LoginCliente () {
		
		user.setBounds(30, 40, 80, 25);
		userText.setBounds(90, 40, 230, 25);
		senha.setBounds(30, 90, 80, 25);
		senhaText.setBounds(90, 90, 230, 25);
		login.setBounds(140, 140, 100, 40);
		
		janela.setLayout(null);
		janela.add(user);
		janela.add(userText);
		janela.add(senha);
		janela.add(senhaText);
		janela.add(login);
		
		janela.setSize(400, 250);
        janela.setVisible(true);
        
        login.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
