/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class proveedor {
    
    private int nit_proveedor;
    private String nombre_proveedor;
    private String correo_proveedor;
    private long telefono_proveedor;
    private String direccion_proveedor;

    public int getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(int nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }

    public long getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(long telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }
    
    public proveedor(int nit, String nombre_p, String correo_p , long telefono_p, String direccion_p) {
        this.nit_proveedor = nit;
        this.nombre_proveedor = nombre_p;
        this.correo_proveedor = correo_p;
        this.telefono_proveedor = telefono_p;
        this.direccion_proveedor = direccion_p;

    }
    
            
}
