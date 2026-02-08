/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ValentinaT
 */
public class Articulo3View extends JFrame {
        
    public Articulo3View() {
        setTitle("Artículo 2");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        // Evitar que se expanda horizontalmente
        contenedor.setMaximumSize(new Dimension(550, Integer.MAX_VALUE));
        contenedor.setPreferredSize(new Dimension(550, contenedor.getPreferredSize().height));

// Título
        JLabel titulo = new JLabel("ARTÍCULO 3");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        contenedor.add(titulo);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL DATOS BÁSICOS
        JPanel panelInfo = new JPanel(new GridLayout(5, 2, 10, 10));
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información del artículo"));

        panelInfo.add(new JLabel("Cadena de búsqueda:"));
        panelInfo.add(new JLabel("TITLE-ABS-KEY (operating system OR OS AND memory management OR virtual memory )"));

        panelInfo.add(new JLabel("Título:"));
        panelInfo.add(new JLabel("MxGPU: Efficient and safe communication between GPGPU applications in an OS-controlled GPGPU multiplexing environment"));

        panelInfo.add(new JLabel("Autores:"));
        panelInfo.add(new JLabel("Lütke Dreimann, M., & Spinczyk, O."));

        panelInfo.add(new JLabel("Año de publicación:"));
        panelInfo.add(new JLabel("2026"));

        panelInfo.add(new JLabel("Revista / Fuente:"));
        panelInfo.add(new JLabel(" Journal of Systems Architecture, 172"));

        contenedor.add(panelInfo);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL RESUMEN
        JPanel panelResumen = new JPanel(new BorderLayout());
        panelResumen.setBorder(BorderFactory.createTitledBorder("Resumen"));
        JTextArea resumenArea = new JTextArea("Con la creciente demanda de inteligencia artificial y otras aplicaciones que utilizan muchos datos, también ha aumentado la demanda de unidades de procesamiento gráfico (GPU). Si bien existen numerosos enfoques para multiplexar GPU, ninguno de los conocidos permite al sistema operativo integrar de forma coherente los recursos de la GPU junto con los de la CPU en una gestión holística de recursos. Debido a la historia de las GPU, los controladores de GPU siguen siendo una parte importante y aislada dentro de la pila de controladores de los sistemas operativos. Este documento pretende realizar un estudio de caso sobre cómo podría ser una solución de multiplexación para GPGPU, donde el sistema operativo pueda definir políticas de programación para las tareas de GPGPU y gestionar la memoria de la GPU. La gestión de la memoria de la GPU controlada por el sistema operativo puede ser especialmente útil para una comunicación eficiente y segura entre aplicaciones GPGPU. Analizaremos y evaluaremos la arquitectura de MxGPU , que ofrece multiplexación basada en software de GPU Intel integradas. MxGPU tiene una base de código pequeña, lo cual es una condición previa para los enfoques de verificación formal y el uso en entornos críticos para la seguridad. Los experimentos con nuestro prototipo demuestran que MxGPU permite al sistema operativo controlar los recursos de la GPU, a la vez que permite más sesiones de GPU. Además, MxGPU permite la ejecución de tareas GPGPU con menor latencia en comparación con Linux y facilita una comunicación eficiente y segura entre aplicaciones de GPU.");
        resumenArea.setFont(new Font("Arial", Font.PLAIN, 14));
        resumenArea.setEditable(false);
        resumenArea.setFocusable(false);
        resumenArea.setLineWrap(true);
        resumenArea.setWrapStyleWord(true);
        panelResumen.add(new JScrollPane(resumenArea));

        contenedor.add(panelResumen);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL PALABRAS CLAVE
        JPanel panelKeywords = new JPanel(new BorderLayout());
        panelKeywords.setBorder(BorderFactory.createTitledBorder("Palabras clave"));
        JTextArea keywordsArea = new JTextArea("GPGPU, Multiplexing, Resource management, Operating system");
        keywordsArea.setFont(new Font("Arial", Font.PLAIN, 14));
        keywordsArea.setEditable(false);
        keywordsArea.setFocusable(false);
        keywordsArea.setLineWrap(true);
        keywordsArea.setWrapStyleWord(true);
        panelKeywords.add(new JScrollPane(keywordsArea));

        contenedor.add(panelKeywords);

        add(new JScrollPane(contenedor), BorderLayout.CENTER);
        setVisible(true);
    }
}
