package atividade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperatura extends JFrame {
    private JTextField campoFahrenheit;
    private JLabel labelCelsius;

    public ConversorTemperatura() {
        setLayout(new FlowLayout());

        campoFahrenheit = new JTextField(10);
        labelCelsius = new JLabel("Celsius: ");

        JButton botaoConverter = new JButton("Converter");
        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(campoFahrenheit.getText());
                    double celsius = Conversao.calcularTemperatura(fahrenheit);
                    labelCelsius.setText("Celsius: " + String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            }
        });

        add(new JLabel("Fahrenheit:"));
        add(campoFahrenheit);
        add(botaoConverter);
        add(labelCelsius);

        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConversorTemperatura();
    }
}