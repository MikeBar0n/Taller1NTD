/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Model {

    private final File file;

    public Model() {
        File carpeta = new File("src/data");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        file = new File(carpeta, "datos_so.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<SistemaOperativo> leerSO() {
        List<SistemaOperativo> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                lista.add(SistemaOperativo.fromString(linea));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void guardarSO(List<SistemaOperativo> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

            for (SistemaOperativo so : lista) {
                pw.println(so.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
