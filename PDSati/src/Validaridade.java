import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validaridade extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtNome;
    private JTextField txtIdade;
    private JLabel lblResposta;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Validaridade frame = new Validaridade();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Validaridade() {
        setTitle("Validador");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(64, 61, 46, 14);
        getContentPane().add(lblNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(64, 104, 46, 14);
        getContentPane().add(lblIdade);

        txtNome = new JTextField();
        txtNome.setBounds(120, 58, 125, 20);
        getContentPane().add(txtNome);
        txtNome.setColumns(10);

        txtIdade = new JTextField();
        txtIdade.setBounds(120, 101, 69, 20);
        getContentPane().add(txtIdade);
        txtIdade.setColumns(10);

        lblResposta = new JLabel(" ");
        lblResposta.setBounds(66, 218, 300, 14);
        getContentPane().add(lblResposta);

        JButton btnValidar = new JButton("Validar");
        btnValidar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String idadeStr = txtIdade.getText();

                if (nome.isEmpty()) {
                    lblResposta.setText("Por favor, insira o nome!");
                    return;
                }

                try {
                    int idade = Integer.parseInt(idadeStr);
                    String mensagem = "Nome: " + nome + ", Idade: " + idade + " ";
                    
                    if (idade < 0) {
                    	lblResposta.setText("por favor, insira uma idade valida! :");
                    	return;
                    }

                    if (idade < 18) {
                        mensagem += "(Menor de idade)";
                    } else {
                        mensagem += "(Maior de idade)";
                    }

                    lblResposta.setText(mensagem);
                } catch (NumberFormatException ex) {
                    lblResposta.setText("Por favor, insira uma idade válida!");
                }
            }
        });
        btnValidar.setBounds(156, 171, 89, 23);
        getContentPane().add(btnValidar);
    }
}



