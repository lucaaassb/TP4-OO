package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial implements ActionListener {

    private static JFrame janela = new JFrame("DogInn");
    private static JLabel titulo = new JLabel("Menu Principal");
    private static JButton cliente = new JButton("Cliente");
    private static JButton petSitter = new JButton("PetSitter");

    public TelaInicial () {
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(120, 10, 150, 30);
        cliente.setBounds(140, 55, 100, 40);
        petSitter.setBounds(140, 105, 100, 40);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(cliente);
        janela.add(petSitter);

        janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        TelaInicial menu = new TelaInicial();

        cliente.addActionListener(menu);
        petSitter.addActionListener(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	Object src = e.getSource();
    	
    	if(src == cliente)
			new TelaCliente();
    	
    	if(src == petSitter)
    		new TelaSitter();
		

    }

}