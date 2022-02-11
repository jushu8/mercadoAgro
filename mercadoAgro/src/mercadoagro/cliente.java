/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class cliente {

    private int cedula_cliente;
    private String nombre1_cliente;
    private String nombre2_cliente;
    private String apellido1_cliente;
    private String apellido2_cliente;
    private long telefono_cliente;
    private String correo_cliente;
    private String direccion_cliente;

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getNombre1_cliente() {
        return nombre1_cliente;
    }

    public void setNombre1_cliente(String nombre1_cliente) {
        this.nombre1_cliente = nombre1_cliente;
    }

    public String getNombre2_cliente() {
        return nombre2_cliente;
    }

    public void setNombre2_cliente(String nombre2_cliente) {
        this.nombre2_cliente = nombre2_cliente;
    }

    public String getApellido1_cliente() {
        return apellido1_cliente;
    }

    public void setApellido1_cliente(String apellido1_cliente) {
        this.apellido1_cliente = apellido1_cliente;
    }

    public String getApellido2_cliente() {
        return apellido2_cliente;
    }

    public void setApellido2_cliente(String apellido2_cliente) {
        this.apellido2_cliente = apellido2_cliente;
    }

    public long getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(long telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public cliente(int cedula_c, String nombre1_c, String nombre2_c, String apellido1_c, String apellido2_c,
            long telefono_c, String correo_c, String direccion_c) {
        this.cedula_cliente = cedula_c;
        this.nombre1_cliente = nombre1_c;
        this.nombre2_cliente = nombre2_c;
        this.apellido1_cliente = apellido1_c;
        this.apellido2_cliente = apellido2_c;
        this.telefono_cliente = telefono_c;
        this.correo_cliente = correo_c;
        this.direccion_cliente = direccion_c;
    }
}
