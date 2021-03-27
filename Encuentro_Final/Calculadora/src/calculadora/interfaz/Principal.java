package calculadora.interfaz;

import javax.swing.*;

public class Principal extends JFrame {
    // Constructor
    public Principal() {
        super("Calcuadora");
        //setSize(600, 400);

        setResizable(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new FormularioPrincipal().getPanelPrincipal());

        pack();
        setVisible(true);

    }

    // Programa
    public static void main(String[] args) {
        Principal frame = new Principal();
    }
}
