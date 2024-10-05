package Atividade5;

import javax.swing.*;
import java.awt.event.*;

public class FomelandiaCalculator {
    private JFrame frame;
    private JTextField weightField;
    private JTextField priceField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FomelandiaCalculator() {
        frame = new JFrame("Fomelândia Calculator");
        frame.getContentPane().setLayout(null);
       

        // Create components
        weightField = new JTextField(10);
        weightField.setBounds(10, 10, 100, 25);
        frame.getContentPane().add(weightField);

        JLabel weightLabel = new JLabel("Peso do prato (kg):");
        weightLabel.setBounds(10, 35, 150, 25);
        frame.getContentPane().add(weightLabel);

        priceField = new JTextField(10);
        priceField.setBounds(10, 58, 100, 25);
        frame.getContentPane().add(priceField);

        JLabel priceLabel = new JLabel("Valor do quilo (R$):");
        priceLabel.setBounds(10, 85, 150, 25);
        frame.getContentPane().add(priceLabel);

        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 110, 100, 25);
        frame.getContentPane().add(calculateButton);

        resultLabel = new JLabel("Valor total a pagar: R$ 0,00");
        resultLabel.setBounds(10, 121, 238, 91);
        frame.getContentPane().add(resultLabel);

        // Add action listener to calculate button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });

        frame.setSize(332, 252);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void calculateTotal() {
        double weight = Double.parseDouble(weightField.getText());
        double price = Double.parseDouble(priceField.getText());
        double total = weight * price;
        resultLabel.setText("Valor total a pagar: R$ " + String.format("%.2f", total));
    }

    public static void main(String[] args) {
        new FomelandiaCalculator();
    }
}