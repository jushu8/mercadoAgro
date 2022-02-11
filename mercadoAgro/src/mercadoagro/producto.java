/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class producto {

    private int id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private int id_familia;
    private int nit_proveedor;
    private int existencia_producto;
    private int stock_minimo_producto;
    private int valor_producto;
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getId_familia() {
        return id_familia;
    }

    public void setId_familia(int id_familia) {
        this.id_familia = id_familia;
    }

    public int getNit_proveedor() {
        return nit_proveedor;
    }

    public void setNit_proveedor(int nit_proveedor) {
        this.nit_proveedor = nit_proveedor;
    }

    public int getExistencia_producto() {
        return existencia_producto;
    }

    public void setExistencia_producto(int existencia_producto) {
        this.existencia_producto = existencia_producto;
    }

    public int getStock_minimo_producto() {
        return stock_minimo_producto;
    }

    public void setStock_minimo_producto(int stock_minimo_producto) {
        this.stock_minimo_producto = stock_minimo_producto;
    }

    public int getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(int valor_producto) {
        this.valor_producto = valor_producto;
    }
    public producto(int id_p, String nombre_p, String descripcion_p, int id_f, int nit_p,
            int existencia_p, int stock_p, int valor_p ){
        
        this.id_producto = id_p;
        this.nombre_producto = nombre_p;
        this.descripcion_producto = descripcion_p;
        this.id_familia = id_f;
        this.nit_proveedor = nit_p;
        this.existencia_producto = existencia_p;
        this.stock_minimo_producto = stock_p;
        this.valor_producto = valor_p;
        
        
    }
}
