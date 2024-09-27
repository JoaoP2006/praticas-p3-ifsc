import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frameactivity extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JButton btnTest1 = new JButton("test1");
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameactivity frame = new frameactivity();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frameactivity() {
		setTitle("EclipseWorkSpace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnTest1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,  "Iae gurizada do colorado!!");
				
			}
		});
		btnTest1.setBounds(10, 262, 57, 23);
		contentPane.add(btnTest1);
		
		JLabel lblSauda = new JLabel("Ola Mundo!");
		lblSauda.setBounds(176, 11, 79, 17);
		lblSauda.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblSauda);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(359, 262, 65, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		contentPane.add(btnFechar);
		
		JButton btnTeste2 = new JButton("Teste2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Voce gosta de minecraft?", "confirmaçao", JOptionPane.YES_NO_OPTION);
				System.out.println(resposta);
				if(resposta == 1) {
					JOptionPane.showMessageDialog(null, "Que pena cara", "RESPOSTA NAO", JOptionPane.ERROR_MESSAGE);
					
				}
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "Bacana", "RESPOSTA SIM", JOptionPane.INFORMATION_MESSAGE);
					
				}
					
			}
		});
		btnTeste2.setBounds(110, 262, 89, 23);
		contentPane.add(btnTeste2);
		
		JButton btnTest3 = new JButton("Test3");
		btnTest3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = JOptionPane.showInputDialog(null, "Qual é seu nome", "Entrada de nome ", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Que nome maravilhoso cara:" + nome);
			}
		});
		btnTest3.setBounds(240, 262, 89, 23);
		contentPane.add(btnTest3);
		
		textField = new JTextField();
		textField.setBounds(110, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 112, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(43, 61, 46, 14);
		contentPane.add(lblNome);
	}
}
