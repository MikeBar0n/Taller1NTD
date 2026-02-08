/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import Model.Model;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Daniel
 */

public class MainView extends JFrame {

    public MainView(Controller controller, Model model) {
        setTitle("Sistemas Operativos");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

// TÍTULO CENTRADO
        JLabel titulo = new JLabel("Sistemas Operativos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 32));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(titulo, BorderLayout.NORTH);

// TEXTO CENTRADO
        JLabel texto = new JLabel("<html><div style='text-align:center;'>"
                + "Para la búsqueda el equipo escogió la base de datos académica Scopus.<br>"
                + "Cada integrante creó su cadena de búsqueda sobre sistemas operativos <br>"
                + "y posteriormente se seleccionó el artículo de interés."
                + "</div></html>");
        texto.setFont(new Font("Arial", Font.PLAIN, 18));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        add(texto, BorderLayout.CENTER);

// PANEL DE BOTONES CENTRADOS
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 4, 15, 15));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JButton b1 = new JButton("Artículo 1");
        JButton b2 = new JButton("Artículo 2");
        JButton b3 = new JButton("Artículo 3");
        JButton crud = new JButton("CRUD");

        Font btnFont = new Font("Arial", Font.BOLD, 16);
        b1.setFont(btnFont);
        b2.setFont(btnFont);
        b3.setFont(btnFont);
        crud.setFont(btnFont);

        panelBotones.add(b1);
        panelBotones.add(b2);
        panelBotones.add(b3);
        panelBotones.add(crud);

        add(panelBotones, BorderLayout.SOUTH);

        b1.addActionListener(e -> new Articulo1View());
        b2.addActionListener(e -> new Articulo2View());
        b3.addActionListener(e -> new Articulo3View());
        crud.addActionListener(e -> controller.abrirCRUD(model));

        setVisible(true);
    }
}
