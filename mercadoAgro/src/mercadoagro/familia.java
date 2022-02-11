/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class familia {
    
    private int id_familia;
    private String nombre_familia;
    private String descripcion_familia;

    public int getId_familia() {
        return id_familia;
    }

    public void setId_familia(int id_familia) {
        this.id_familia = id_familia;
    }

    public String getNombre_familia() {
        return nombre_familia;
    }

    public void setNombre_familia(String nombre_familia) {
        this.nombre_familia = nombre_familia;
    }

    public String getDescripcion_familia() {
        return descripcion_familia;
    }

    public void setDescripcion_familia(String descripcion_familia) {
        this.descripcion_familia = descripcion_familia;
    }
    
    public familia(int id_f, String nombre_f, String descripcion_f){
        
        this.id_familia = id_f;
        this.nombre_familia = nombre_f;
        this.descripcion_familia = descripcion_f;
    }
            
}
