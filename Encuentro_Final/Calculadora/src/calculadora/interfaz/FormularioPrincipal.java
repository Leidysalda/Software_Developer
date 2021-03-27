package calculadora.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioPrincipal {
    private JPanel panelPrincipal;
    private JTextField primerNum;
    private JTextField segundoNum;
    private JButton divButton;
    private JButton cleanButton;
    private JButton outButton;
    private JFormattedTextField resultadoOp;
    private JButton addButton;
    private JButton mulButton;
    private JButton subButton;

    public FormularioPrincipal() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Realiza la suma
                    int numUno = Integer.parseInt(primerNum.getText());
                    int numDos = Integer.parseInt(segundoNum.getText());
                    int result = numUno + numDos;
                    resultadoOp.setText(String.format("%d", result));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Debes ingresar números!");
                }
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Realiza la suma
                    int numUno = Integer.parseInt(primerNum.getText());
                    int numDos = Integer.parseInt(segundoNum.getText());
                    int result = numUno - numDos;
                    resultadoOp.setText(String.format("%d", result));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Debes ingresar números!");
                }

            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Realiza la suma
                    int numUno = Integer.parseInt(primerNum.getText());
                    int numDos = Integer.parseInt(segundoNum.getText());
                    int result = numUno * numDos;
                    resultadoOp.setText(String.format("%d", result));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Debes ingresar números!");
                }

            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Realiza la división
                    int numUno = Integer.parseInt(primerNum.getText());
                    int numDos = Integer.parseInt(segundoNum.getText());
                    double result = (double) numUno / numDos;
                    resultadoOp.setText(String.format("%.2f", result));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Debes ingresar números!");
                }
            }
        });

        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primerNum.setText("");
                segundoNum.setText("");
                resultadoOp.setText("");
            }
        });
        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resp = JOptionPane.showConfirmDialog(null,
                        "¿Desea finalizar el programa",
                        "Convertidor",
                        JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
