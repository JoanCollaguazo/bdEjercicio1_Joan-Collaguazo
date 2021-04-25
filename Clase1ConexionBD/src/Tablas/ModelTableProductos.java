/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Vistas.GestionContable;
import clase1conexionbd.Inventario;
import clase1conexionbd.ProductoVenta;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joang
 */
public class ModelTableProductos extends AbstractTableModel {

    private String[] m_colNames = {"CANTIDAD", "DESCRIPCION", "SUBTOTAL", "TOTAL"};
    private List<ProductoVenta> productoVenta;
    private GestionContable gContable;

    public ModelTableProductos(List<ProductoVenta> productoVenta, GestionContable gCOntable) {
        this.productoVenta = productoVenta;
        this.gContable = gCOntable;
    }

    @Override
    public int getRowCount() {
        return productoVenta.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductoVenta proveedor = productoVenta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return proveedor.getCantidad();
            case 1:
                return proveedor.getDescripcion();
            case 2:
                return proveedor.getSubTotal();
            case 3:
                return proveedor.getTotal();
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //OJO CON ESTA LINEA DE CODIGO: 
        gContable.clickProductoVender(productoVenta.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }


    public List<ProductoVenta> getProductos() {
        return productoVenta;
    }

    public void setProductos(List<ProductoVenta> inventarios) {
        this.productoVenta = inventarios;
    }

}
