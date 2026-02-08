package taller1_crudybd;

import Controller.Controller;
import Model.Model;
import View.MainView;
import javax.swing.*;

/**
 *
 * @author Daniel
 */

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView(new Controller(), new Model()));
    }
}
