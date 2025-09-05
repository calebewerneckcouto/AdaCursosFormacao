package GuiSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Calculadora Avançada");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Criando campos de entrada
        JLabel label1 = new JLabel("Número 1:");
        label1.setBounds(30, 30, 80, 25);
        frame.add(label1);

        JTextField num1 = new JTextField();
        num1.setBounds(120, 30, 100, 25);
        frame.add(num1);

        JLabel label2 = new JLabel("Número 2:");
        label2.setBounds(30, 70, 80, 25);
        frame.add(label2);

        JTextField num2 = new JTextField();
        num2.setBounds(120, 70, 100, 25);
        frame.add(num2);

        // Campo de resultado
        JLabel labelResult = new JLabel("Resultado:");
        labelResult.setBounds(30, 150, 80, 25);
        frame.add(labelResult);

        JTextField resultado = new JTextField();
        resultado.setBounds(120, 150, 150, 25);
        resultado.setEditable(false);
        frame.add(resultado);

        // Botões de operação
        JButton soma = new JButton("+");
        soma.setBounds(250, 30, 50, 30);
        frame.add(soma);

        JButton sub = new JButton("-");
        sub.setBounds(310, 30, 50, 30);
        frame.add(sub);

        JButton mult = new JButton("*");
        mult.setBounds(250, 70, 50, 30);
        frame.add(mult);

        JButton div = new JButton("/");
        div.setBounds(310, 70, 50, 30);
        frame.add(div);

        // Adicionando ações aos botões
        soma.addActionListener(e -> calcular(num1, num2, resultado, "+"));
        sub.addActionListener(e -> calcular(num1, num2, resultado, "-"));
        mult.addActionListener(e -> calcular(num1, num2, resultado, "*"));
        div.addActionListener(e -> calcular(num1, num2, resultado, "/"));

        // Tornar visível
        frame.setVisible(true);
    }

    // Método para calcular
    private static void calcular(JTextField n1, JTextField n2, JTextField res, String operacao) {
        try {
            double numero1 = Double.parseDouble(n1.getText());
            double numero2 = Double.parseDouble(n2.getText());
            double resultadoCalc = 0;

            switch (operacao) {
                case "+" -> resultadoCalc = numero1 + numero2;
                case "-" -> resultadoCalc = numero1 - numero2;
                case "*" -> resultadoCalc = numero1 * numero2;
                case "/" -> {
                    if (numero2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                        return;
                    }
                    resultadoCalc = numero1 / numero2;
                }
            }
            res.setText(String.valueOf(resultadoCalc));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos!");
        }
    }
}
