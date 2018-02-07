package bo.edu.umss.cs.ceis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiqueta;
    private JTextField campo;
    private JButton jugar;
    private JDialog dia;
    private JLabel etiqueta2;

    public Ventana() {
        super("Juego de numeros");
        etiqueta = new JLabel("Dime un numero");
        campo = new JTextField(3);
        jugar = new JButton("Jugar");
        dia = new JDialog(this);
        dia.setSize(300, 300);
        etiqueta2 = new JLabel("No");
        FlowLayout f = new FlowLayout();
        setLayout(f);
        add(etiqueta);
        add(campo);
        add(jugar);
        dia.add(etiqueta2);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });
    }

    private void jugar() {
        String valor = campo.getText();
        int val = Integer.parseInt(valor);
        val++;
        etiqueta2.setText("Mi numero es" + " " + val + " " + "te gane perro Daniel");
        dia.setVisible(true);

    }
}
