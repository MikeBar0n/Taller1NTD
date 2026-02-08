/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ValentinaC
 */
public class Articulo2View extends JFrame {
        
    public Articulo2View() {
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
        JLabel titulo = new JLabel("ARTÍCULO 2");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        contenedor.add(titulo);
        contenedor.add(Box.createVerticalStrut(20));
        
        // Evitar que se expanda horizontalmente
        contenedor.setMaximumSize(new Dimension(550, Integer.MAX_VALUE));
        contenedor.setPreferredSize(new Dimension(550, contenedor.getPreferredSize().height));

// PANEL DATOS BÁSICOS
        JPanel panelInfo = new JPanel(new GridLayout(5, 2, 10, 10));
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información del artículo"));

        panelInfo.add(new JLabel("Cadena de búsqueda:"));
        panelInfo.add(new JLabel("TITLE-ABS-KEY((operatingsystem OR OS) AND (Linux OR Windows OR Android)) AND PUBYEAR > 2020"));

        panelInfo.add(new JLabel("Título:"));
        panelInfo.add(new JLabel("LE OS: A lightweight edge operating system for industrial internet of things under resource constraints"));

        panelInfo.add(new JLabel("Autores:"));
        panelInfo.add(new JLabel("Xianhui Liu, Yangyang Yang, Chenlin Zhu, Yihan Hu, Weidong Zhao,"));

        panelInfo.add(new JLabel("Año de publicación:"));
        panelInfo.add(new JLabel("2026"));

        panelInfo.add(new JLabel("Revista / Fuente:"));
        panelInfo.add(new JLabel("Future Generation Computer Systems Volume 179"));

        contenedor.add(panelInfo);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL RESUMEN
        JPanel panelResumen = new JPanel(new BorderLayout());
        panelResumen.setBorder(BorderFactory.createTitledBorder("Resumen"));
        JTextArea resumenArea = new JTextArea("Con el auge de la Industria 4.0 y la computación en el borde, la fabricación inteligente ha experimentado un rápido desarrollo. Sin embargo, la investigación existente sobre sistemas operativos para dispositivos en el borde con recursos limitados aún presenta limitaciones significativas: los sistemas operativos convencionales requieren grandes recursos de hardware y carecen de adaptabilidad para la implementación en el borde; el Internet industrial carece de un marco unificado y eficiente de programación y gestión para dispositivos a gran escala; y los sistemas monolíticos tradicionales sufren un fuerte acoplamiento de componentes, donde un fallo de un solo componente puede causar caídas en todo el sistema, poniendo en peligro la estabilidad de la producción. Para abordar estos desafíos, este artículo propone LE OS, un sistema operativo ligero en el borde, diseñado para entornos de Internet industrial con recursos limitados. LE OS aprovecha la tecnología de contenedores para encapsular componentes a nivel de sistema en contenedores funcionales y los integra con el microkernel seL4, formando un sistema operativo ligero y contenedorizado. La evaluación experimental muestra que LE OS mejora el rendimiento de la CPU y de E/S entre un 10 % y un 40 % y reduce el uso de memoria a nivel de sistema en más del 70 % en comparación con los sistemas operativos convencionales, a la vez que mantiene una alta eficiencia de recursos y un sólido aislamiento. Estos resultados demuestran que LE OS supera eficazmente las limitaciones de los sistemas existentes y proporciona una base práctica y escalable para los sistemas operativos de borde de Internet industrial de próxima generación.");
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
        JTextArea keywordsArea = new JTextArea("Angiosperms353, Ophrys, Orchidinae, Phylogenetics, Species delimitation, Target capture");
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
