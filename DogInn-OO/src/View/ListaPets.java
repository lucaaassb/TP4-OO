package View;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controller.*;


public class ListaPets implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroAluno;
	private JButton refreshAluno;
	private JButton cadastroProf;
	private JButton refreshProf;
	private static ControlePet dados;
	private JList<String> listaAlunosCadastrados;
	private JList<String> listaProfsCadastrados;
	private String[] listaNomes = new String[50];

}
