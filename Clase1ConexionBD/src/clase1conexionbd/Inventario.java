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
public class Inventario {
    private int idInventario;
    private String codigoPro;
    private String descripcion;
    private String preciosCompra;
    private String preciosVenta;
    private String cantProductos;
    
    
    public Inventario(){
    
    }

    public Inventario(int idInventario, String codigoPro, String descripcion, String preciosCompra, String preciosVenta, String cantProductos) {
        this.idInventario = idInventario;
        this.codigoPro = codigoPro;
        this.descripcion = descripcion;
        this.preciosCompra = preciosCompra;
        this.preciosVenta = preciosVenta;
        this.cantProductos = cantProductos;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(String codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreciosCompra() {
        return preciosCompra;
    }

    public void setPreciosCompra(String preciosCompra) {
        this.preciosCompra = preciosCompra;
    }

    public String getPreciosVenta() {
        return preciosVenta;
    }

    public void setPreciosVenta(String preciosVenta) {
        this.preciosVenta = preciosVenta;
    }

    public String getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(String cantProductos) {
        this.cantProductos = cantProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codigoPro=" + codigoPro + ", descripcion=" + descripcion + ", preciosCompra=" + preciosCompra + ", preciosVenta=" + preciosVenta + ", cantProductos=" + cantProductos + '}';
    }

    

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
