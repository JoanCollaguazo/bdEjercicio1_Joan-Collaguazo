/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd;

/**
 *
 * @author joang
 */
public class ProductoVendido {
    private String idInventario;
    private String idNotaVenta;
    private int cantidadProductos;
    private String DescripcionInventario;
    private double valorTotal;

    public String getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public String getIdNotaVenta() {
        return idNotaVenta;
    }

    public void setIdNotaVenta(String idNotaVenta) {
        this.idNotaVenta = idNotaVenta;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDescripcionInventario() {
        return DescripcionInventario;
    }

    public void setDescripcionInventario(String DescripcionInventario) {
        this.DescripcionInventario = DescripcionInventario;
    }
    
    
}
