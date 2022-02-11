/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

/**
 *
 * @author ASUS
 */
public class detalle_venta {
    
    private int id_venta;
    private int id_producto;
    private int cantidad_venta;
    private int valor_detalle;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad_venta() {
        return cantidad_venta;
    }

    public void setCantidad_venta(int cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
    }

    public int getValor_detalle() {
        return valor_detalle;
    }

    public void setValor_detalle(int valor_detalle) {
        this.valor_detalle = valor_detalle;
    }
    
    public detalle_venta(int id_v, int id_p, int cantidad_v, int valor_detallev){
        
        this.id_venta = id_v;
        this.id_producto = id_p;
        this.cantidad_venta = cantidad_v;
        this.valor_detalle = valor_detallev;
        
    }
    
}
