/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Model;
import Model.SistemaOperativo;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class CRUDView extends JFrame {

    public CRUDView(Model model) {
        setTitle("CRUD - Sistemas Operativos");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

// PANEL CONTENEDOR (con márgenes)
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(contenedor, BorderLayout.CENTER);

// LISTA
        String[] columnas = {"Nombre", "Versión", "Empresa", "Fecha", "Categoría"};
        DefaultTableModel tableModel = new DefaultTableModel(columnas, 0);

        List<SistemaOperativo> sistemas = model.leerSO();

        for (SistemaOperativo so : sistemas) {
            tableModel.addRow(new Object[]{
                so.getNombre(),
                so.getVersion(), // ← CAMBIO: versión va 2da
                so.getEmpresa(),
                so.getFechaLanzamiento(),
                so.getCategoria()
            });
        }

        JTable tabla = new JTable(tableModel);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.setRowHeight(25);

        contenedor.add(new JScrollPane(tabla), BorderLayout.CENTER);

// FORMULARIO
        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createTitledBorder("Registrar Sistema Operativo"));

        JTextField txtNombre = new JTextField();
        JTextField txtEmpresa = new JTextField();
        JTextField txtFecha = new JTextField();
        JTextField txtVersion = new JTextField();
        JTextField txtCategoria = new JTextField();

        form.add(new JLabel("Nombre del OS:"));
        form.add(txtNombre);
        form.add(new JLabel("Empresa creadora:"));
        form.add(txtEmpresa);
        form.add(new JLabel("Fecha de lanzamiento:"));
        form.add(txtFecha);
        form.add(new JLabel("Versión:"));
        form.add(txtVersion);
        form.add(new JLabel("Categoría:"));
        form.add(txtCategoria);

// BOTONES
        JPanel botones = new JPanel(new GridLayout(1, 3, 10, 10));
        JButton agregar = new JButton("Agregar");
        JButton eliminar = new JButton("Eliminar");
        JButton guardar = new JButton("Guardar");
        botones.add(agregar);
        botones.add(eliminar);
        botones.add(guardar);

// PANEL FORM y BOTONES
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(form, BorderLayout.CENTER);
        panelInferior.add(botones, BorderLayout.SOUTH);

        contenedor.add(panelInferior, BorderLayout.SOUTH);

// ACCIONES
        agregar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            String empresa = txtEmpresa.getText().trim();
            String fecha = txtFecha.getText().trim();
            String version = txtVersion.getText().trim();
            String categoria = txtCategoria.getText().trim();

            if (!nombre.isEmpty() && !empresa.isEmpty() && !fecha.isEmpty() && !version.isEmpty() && !categoria.isEmpty()) {

                tableModel.addRow(new Object[]{
                    nombre,
                    version,
                    empresa,
                    fecha,
                    categoria
                });

                txtNombre.setText("");
                txtEmpresa.setText("");
                txtFecha.setText("");
                txtVersion.setText("");
                txtCategoria.setText("");
            }
        });

        eliminar.addActionListener(e -> {
            int fila = tabla.getSelectedRow();

            if (fila >= 0) {
                tableModel.removeRow(fila);
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
            }
        });

        guardar.addActionListener(e -> {
            List<SistemaOperativo> lista = new ArrayList<>();

            for (int i = 0; i < tableModel.getRowCount(); i++) {

                SistemaOperativo so = new SistemaOperativo(
                        tableModel.getValueAt(i, 0).toString(), // Nombre
                        tableModel.getValueAt(i, 2).toString(), // Empresa
                        tableModel.getValueAt(i, 3).toString(), // Fecha
                        tableModel.getValueAt(i, 1).toString(), // Versión
                        tableModel.getValueAt(i, 4).toString() // Categoría
                );

                lista.add(so);
            }

            model.guardarSO(lista);
            JOptionPane.showMessageDialog(this, "Guardado exitosamente");
        });

        setVisible(true);
    }
}
