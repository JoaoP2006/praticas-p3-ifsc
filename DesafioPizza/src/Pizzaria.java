import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizzaria extends JFrame {
    private JCheckBox[] sabores;
    private JRadioButton comBorda;
    private JRadioButton semBorda;
    private JComboBox<String> entrega;
    private JCheckBox[] opcionais;
    private JButton calcular;
    private JLabel resultado;

    public Pizzaria() {
        setTitle("Pizzaria");
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sabores de pizza
        String[] saboresNomes = {"Margarita", "Pepperoni", "Vegetariana"};
        sabores = new JCheckBox[saboresNomes.length];
        for (int i = 0; i < saboresNomes.length; i++) {
            sabores[i] = new JCheckBox(saboresNomes[i]);
            sabores[i].setBounds(30, 30 + (i * 30), 150, 20);
            add(sabores[i]);
        }

     
        comBorda = new JRadioButton("Com Borda");
        semBorda = new JRadioButton("Sem Borda");
        ButtonGroup grupoBorda = new ButtonGroup();
        grupoBorda.add(comBorda);
        grupoBorda.add(semBorda);
        comBorda.setBounds(30, 150, 150, 20);
        semBorda.setBounds(30, 170, 150, 20);
        add(comBorda);
        add(semBorda);

        // Opções de entrega
        String[] tiposEntrega = {"Tele Entrega", "Retira", "No Local"};
        entrega = new JComboBox<>(tiposEntrega);
        entrega.setBounds(30, 210, 150, 20);
        add(entrega);

        // Opcionais
        String[] opcionaisNomes = {"Queijo Extra", "Azeitona", "Champignon"};
        opcionais = new JCheckBox[opcionaisNomes.length];
        for (int i = 0; i < opcionaisNomes.length; i++) {
            opcionais[i] = new JCheckBox(opcionaisNomes[i]);
            opcionais[i].setBounds(30, 240 + (i * 30), 150, 20);
            add(opcionais[i]);
        }

        // Botão de calcular
        calcular = new JButton("Calcular Total");
        calcular.setBounds(30, 360, 150, 30);
        add(calcular);

        // Label para resultado
        resultado = new JLabel("Valor Total: R$ 0.00");
        resultado.setBounds(200, 360, 150, 30);
        add(resultado);

        // Ação do botão
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        double total = 0.0;

        // Preço base por sabor
        double precoPizza = 20.0;
        int saboresSelecionados = 0;

        for (JCheckBox sabor : sabores) {
            if (sabor.isSelected()) {
                saboresSelecionados++;
                total += precoPizza;
            }
        }

         
        if (saboresSelecionados > 3) {
            JOptionPane.showMessageDialog(this, "Selecione no máximo 3 sabores!");
            return;
        }

        
        if (comBorda.isSelected()) {
            total += 5.0; 
       