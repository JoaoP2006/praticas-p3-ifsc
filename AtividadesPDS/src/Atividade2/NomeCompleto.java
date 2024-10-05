package Atividade2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NomeCompleto {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField sobrenomeField;
    private JLabel nomeCompletoLabel;

    public NomeCompleto() {
        criarInterface();
    }

    private void criarInterface() {
        frame = new JFrame("Nome Completo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nomeField = new JTextField(20);
        sobrenomeField = new JTextField(20);
        nomeCompletoLabel = new JLabel();

        JButton botao = new JButton("Exibir Nome Completo");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String sobrenome = sobrenomeField.getText();
                nomeCompletoLabel.setText(nome + " " + sobrenome);
            }
        });
        frame.getContentPane().setLayout(new GridLayout(6, 6, 6, 6));

        frame.getContentPane().add(new JLabel("Nome:"));
        frame.getContentPane().add(nomeField);
        frame.getContentPane().add(new JLabel("Sobrenome:"));
        frame.getContentPane().add(sobrenomeField);
        frame.getContentPane().add(botao);
        frame.getContentPane().add(nomeCompletoLabel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NomeCompleto();
    }
}