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
    private String codProducto;
    private String descripcion;
    private String precioCompra;
    private String precioVenta;
    private String cantProductos;
    
    
    public Inventario(){
    
    }

    public Inventario(int idInventario, String codProducto, String descripcion, String precioCompra, String precioVenta, String cantProductos) {
        this.idInventario = idInventario;
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantProductos = cantProductos;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(String cantProductos) {
        this.cantProductos = cantProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codProducto=" + codProducto + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", cantProductos=" + cantProductos + '}';
    }


    
    

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
