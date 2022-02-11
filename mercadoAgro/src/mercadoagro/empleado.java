/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class empleado {
    
    private int cedula_empleado;
    private String nombre1_empleado;
    private String nombre2_empleado;
    private String apellido1_empleado;
    private String apellido2_empleado;
    private long telefono_empleado;
    private String correo_empleado;
    private String direccion_empleado;

    public int getCedula_empleado() {
        return cedula_empleado;
    }

    public void setCedula_empleado(int cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }

    public String getNombre1_empleado() {
        return nombre1_empleado;
    }

    public void setNombre1_empleado(String nombre1_empleado) {
        this.nombre1_empleado = nombre1_empleado;
    }

    public String getNombre2_empleado() {
        return nombre2_empleado;
    }

    public void setNombre2_empleado(String nombre2_empleado) {
        this.nombre2_empleado = nombre2_empleado;
    }

    public String getApellido1_empleado() {
        return apellido1_empleado;
    }

    public void setApellido1_empleado(String apellido1_empleado) {
        this.apellido1_empleado = apellido1_empleado;
    }

    public String getApellido2_empleado() {
        return apellido2_empleado;
    }

    public void setApellido2_empleado(String apellido2_empleado) {
        this.apellido2_empleado = apellido2_empleado;
    }

    public long getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(long telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public String getDireccion_empleado() {
        return direccion_empleado;
    }

    public void setDireccion_empleado(String direccion_empleado) {
        this.direccion_empleado = direccion_empleado;
    }
    
    public empleado(int cedula_e, String nombre1_e, String nombre2_e, String apellido1_e, String apellido2_e,
            long telefono_e, String correo_e, String direccion_e) {
        this.cedula_empleado = cedula_e;
        this.nombre1_empleado = nombre1_e;
        this.nombre2_empleado = nombre2_e;
        this.apellido1_empleado = apellido1_e;
        this.apellido2_empleado = apellido2_e;
        this.telefono_empleado = telefono_e;
        this.correo_empleado = correo_e;
        this.direccion_empleado = direccion_e;
    }
}
