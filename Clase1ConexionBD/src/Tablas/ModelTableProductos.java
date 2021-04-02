/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Vistas.GestionContable;
import clase1conexionbd.Inventario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joang
 */
public class ModelTableProductos extends AbstractTableModel {

    private String[] m_colNames = {"CANTIDAD", "DESCRIPCION", "SUBTOTAL", "TOTAL"};
    private List<Inventario> productos;
    private GestionContable gContable;

    public ModelTableProductos(List<Inventario> productos, GestionContable gCOntable) {
        this.productos = productos;
        this.gContable = gCOntable;
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario productos = this.productos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return productos.getCantidad();
            case 1:
                return productos.getDescripcion();
            case 2:
                return productos.getPrecioCompraSinIVA();
            case 3:
                double a = productos.getCantidad() * productos.getPrecioCompraSinIVA();
                return a;
        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public boolean isCellEditable(int rowIndex, int columnIndex) {
//        gContable.clickInventario(productos.get(rowIndex));
//        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
//    }
    public List<Inventario> getProductos() {
        return productos;
    }

    public void setProductos(List<Inventario> productos) {
        this.productos = productos;
    }

}
