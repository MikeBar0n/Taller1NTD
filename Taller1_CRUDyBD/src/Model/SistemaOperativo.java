/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ValentinaC
 */
public class SistemaOperativo {

    private String nombre;
    private String empresa;
    private String fechaLanzamiento;
    private String version;
    private String categoria; // móvil, computador o electrónica

    public SistemaOperativo(String nombre, String empresa, String fechaLanzamiento, String version, String categoria) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.fechaLanzamiento = fechaLanzamiento;
        this.version = version;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getVersion() {
        return version;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setFechaLanzamiento(String f) {
        this.fechaLanzamiento = f;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre + ";" + empresa + ";" + fechaLanzamiento + ";" + version + ";" + categoria;
    }

    public static SistemaOperativo fromString(String linea) {
        String[] p = linea.split(";");
        return new SistemaOperativo(p[0], p[1], p[2], p[3], p[4]);
    }
}
