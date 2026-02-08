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
public class Articulo1View extends JFrame {

    public Articulo1View() {
        setTitle("Artículo 1");
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
        JLabel titulo = new JLabel("ARTÍCULO 1");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        contenedor.add(titulo);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL DATOS BÁSICOS
        JPanel panelInfo = new JPanel(new GridLayout(5, 2, 10, 10));
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información del artículo"));

        panelInfo.add(new JLabel("Cadena de búsqueda:"));
        panelInfo.add(new JLabel("TITLE-ABS-KEY ( ( operating system OR OS ) ) AND PUBYEAR > 2020 AND NOT TITLE-ABS-KEY ( mobile OR smartphone OR embedded ) AND ( LIMIT-TO ( SUBJAREA , COMP ) )  "));

        panelInfo.add(new JLabel("Título:"));
        panelInfo.add(new JLabel("CPU-Limits kill Performance: Time to rethink Resource Control"));

        panelInfo.add(new JLabel("Autores:"));
        panelInfo.add(new JLabel("Shetty, C. C., Chakraborty, S., Franke, H., Shwartz, L., Narayanaswami, C., Jha, S., & Gupta, I."));

        panelInfo.add(new JLabel("Año de publicación:"));
        panelInfo.add(new JLabel("2026"));

        panelInfo.add(new JLabel("Revista / Fuente:"));
        panelInfo.add(new JLabel("In Proceedings of the 2025 ACM Symposium on Cloud Computing (pp. 125–133). ACM."));

        contenedor.add(panelInfo);
        contenedor.add(Box.createVerticalStrut(20));

// PANEL RESUMEN
        JPanel panelResumen = new JPanel(new BorderLayout());
        panelResumen.setBorder(BorderFactory.createTitledBorder("Resumen"));
        JTextArea resumenArea = new JTextArea("La investigación en la gestión de recursos computacionales para aplicaciones nativas de la nube está dominada por el problema de establecer límites óptimos de CPU ( c . limit ): un mecanismo fundamental del sistema operativo que restringe estrictamente el uso de CPU de un contenedor a su c . limit especificado . Los trabajos de ajuste de tamaño y escalado automático han innovado en políticas de asignación/escalado asumiendo la ubicuidad y necesidad de c . limit . Cuestionamos esto. Las experiencias prácticas de los usuarios de la nube indican que c . limit perjudica el rendimiento de la aplicación y cuesta más de lo que ayuda. Estas observaciones contradicen la sabiduría convencional presentada tanto en la investigación académica como en las mejores prácticas de la industria. Argumentamos que esta adopción indiscriminada de c . limits está impulsada por creencias erróneas de que c . limits es esencial para fines operativos y de seguridad. Proporcionamos evidencia empírica que justifica evitar por completo c . limits de las aplicaciones sensibles a la latencia. Esto impulsa un replanteamiento fundamental de los paradigmas de escalado automático y facturación y abre nuevas vías de investigación. Finalmente, destacamos escenarios específicos en los que c . limits puede ser beneficioso si se usa de manera bien razonada (por ejemplo, trabajos en segundo plano).");
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
        JTextArea keywordsArea = new JTextArea("CPU limits, Resource control, Cloud computing, Performance, Container resource management, Autoscaling, Compute resources");
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
