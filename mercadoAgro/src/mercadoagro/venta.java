/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoagro;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class venta {
    
    private int id_venta;
    private java.util.Date fecha_venta;
    private int valortotal_venta;
    private int cedula_cliente;
    private int cedula_empleado;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getValortotal_venta() {
        return valortotal_venta;
    }

    public void setValortotal_venta(int valortotal_venta) {
        this.valortotal_venta = valortotal_venta;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public int getCedula_empleado() {
        return cedula_empleado;
    }

    public void setCedula_empleado(int cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }
    
    public venta(int id_v, Date fecha_v, int valortotal_v, int cedula_c, int cedula_e){
        
        this.id_venta = id_v;
        this.fecha_venta = fecha_v;
        this.valortotal_venta = valortotal_v;
        this.cedula_cliente = cedula_c;
        this.cedula_empleado = cedula_c;
        
    }
   
}
