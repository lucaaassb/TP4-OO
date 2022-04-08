package View;
/**
 * Tela que contem os botoes que levam
 * a lista de pets e a lista de petSitters
 * para o serviço ser contratado
 *
 * @author Gabriel Cabral
 * @version 1.0 (Abril 2022)
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controller.*;

public class TelaCliente2 implements ActionListener {
	private static JFrame janela = new JFrame("DogInn");
	private static JLabel titulo = new JLabel("Cliente");
	private static JButton contratar = new JButton("Contratar serviço");
	private static JButton cadastraCliente = new JButton("Cadastrar Cliente");
	private static JButton listarPets = new JButton("Lista de Pets");
	public static ControleDados dados = new ControleDados();
	
	public TelaCliente2 () {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(155, 10, 150, 30);
		contratar.setBounds(115, 55, 150, 40);
		cadastraCliente.setBounds(115, 105, 150, 40);
		listarPets.setBounds(115, 105, 150, 40);
		
		janela.setLayout(null);
		janela.add(titulo);
		janela.add(contratar);
		janela.add(listarPets);
		
		janela.setSize(400, 250);
        janela.setVisible(true);
        
        cadastraCliente.addActionListener(this);
        contratar.addActionListener(this);
        listarPets.addActionListener(this);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	Object src = e.getSource();
    	
    	if(src == contratar)
    		new Listas().mostrarDados(dados, 3);
    	if(src == listarPets)
    		new Listas().mostrarDados(dados, 1);
    }

}