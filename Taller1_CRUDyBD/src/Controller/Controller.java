/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model;
import View.*;

/**
 *
 * @author Daniel
 */
public class Controller {

    public void abrirCRUD(Model model) {
        new CRUDView(model);
    }
}
