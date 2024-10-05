package Atividade3;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Retangulo {
    private JFrame frame;
    private JTextField baseField;
    private JTextField alturaField;
    private JLabel perimetroLabel;
    private JLabel areaLabel;

    public Retangulo() {
        criarInterface();
    }

    private void criarInterface() {
        frame = new JFrame("Cálculo de Perímetro e Área");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); 

        baseField = new JTextField(10);
        baseField.setBounds(110, 11, 100, 20); 

        alturaField = new JTextField(10);
        alturaField.setBounds(110, 39, 100, 20); 

        JButton botao = new JButton("Calcular");
        botao.setBounds(10, 70, 100, 20); 
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double base = Double.parseDouble(baseField.getText());
                double altura = Double.parseDouble(alturaField.getText());
                double perimetro = calcularPerimetro(base, altura);
                double area = calcularArea(base, altura);
                perimetroLabel.setText(String.format("Perímetro: %.2f", perimetro));
                areaLabel.setText(String.format("Área: %.2f", area));
            }
        });

        perimetroLabel = new JLabel();
        perimetroLabel.setBounds(10, 100, 200, 20); 

        areaLabel = new JLabel();
        areaLabel.setBounds(10, 130, 200, 20); 

        frame.getContentPane().add(baseField);
        frame.getContentPane().add(alturaField);
        frame.getContentPane().add(botao);
        frame.getContentPane().add(perimetroLabel);
        frame.getContentPane().add(areaLabel);
        
        JLabel lblbaseField = new JLabel("Base");
        lblbaseField.setBounds(10, 14, 46, 14);
        frame.getContentPane().add(lblbaseField);
        
        JLabel lblalturaField = new JLabel("Altura");
        lblalturaField.setBounds(10, 42, 46, 14);
        frame.getContentPane().add(lblalturaField);

        frame.setSize(250, 200); 
        frame.setVisible(true);
    }

    private double calcularPerimetro(double base, double altura) {
        return 2 * (altura + base);
    }

    private double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        new Retangulo();
    }
}
