package Atividade4;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gasolina {
    private JFrame frame;
    private JTextField precoField;
    private JTextField valorField;
    private JLabel litrosLabel;
    private JLabel lblprecoField;
    private JLabel lblvalorField;

    public Gasolina() {
        criarInterface();
    }

    private void criarInterface() {
        frame = new JFrame("Cálculo de Litros de Gasolina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); 

        precoField = new JTextField(10);
        precoField.setBounds(124, 11, 100, 20); 

        valorField = new JTextField(10);
        valorField.setBounds(124, 42, 100, 20); 

        JButton botao = new JButton("Calcular");
        botao.setBounds(53, 69, 100, 20); 
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double preco = Double.parseDouble(precoField.getText());
                double valor = Double.parseDouble(valorField.getText());
                double litros = calcularLitros(preco, valor);
                litrosLabel.setText(String.format("Litros: %.2f", litros));
            }
        });

        litrosLabel = new JLabel();
        litrosLabel.setBounds(10, 100, 200, 20); 

        frame.getContentPane().add(new JLabel("Preço do litro (R$):"));
        frame.getContentPane().add(precoField);
        frame.getContentPane().add(new JLabel("Valor final do pagamento (R$):"));
        frame.getContentPane().add(valorField);
        frame.getContentPane().add(botao);
        frame.getContentPane().add(litrosLabel);
        
        lblprecoField = new JLabel("Preco");
        lblprecoField.setBounds(28, 14, 46, 14);
        frame.getContentPane().add(lblprecoField);
        
        lblvalorField = new JLabel("Valor");
        lblvalorField.setBounds(28, 45, 46, 14);
        frame.getContentPane().add(lblvalorField);

        frame.setSize(250, 200); 
        frame.setVisible(true);
    }

    private double calcularLitros(double preco, double valor) {
        return valor / preco;
    }

    public static void main(String[] args) {
        new Gasolina();
    }
}
