/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import Vistas.GestionContable;
import clase1conexionbd.Inventario;
import Tablas.ModelTableInventario;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import Tablas.ComunicacionVistaModeloTablas;

/**
 *
 * @author joang
 */
public class ModelTableInventario extends AbstractTableModel {

    //CREACION DE LOS NOMBRES DE LAS COLUMNAS USANDO ARREGLO
    private String[] m_colNames = {"CODIDO PRODUCTO", "DESCRIPCION", "PRECIO DE COMPRA", "PRECIO DE VENTA", "CANT PRODUCTO"};
    private List<Inventario> inventarios;
    private GestionContable gContable;

    public ModelTableInventario(List<Inventario> inventarios, GestionContable gContable) {
        this.inventarios = inventarios;
        this.gContable = gContable;
    }

//DETERMINA EL NUMERO DE FILAS QUE TENGO EN LA TABLA    
    @Override
    public int getRowCount() {
        return inventarios.size();
    }
//DETERMINA EL NUMERO DE COLUMNAS QUE TENGO EN LA TABLA

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = inventarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return inventario.getCodProducto();
            case 1:
                return inventario.getDescripcion();
            case 2:
                return inventario.getPrecioCompra();
            case 3:
                return inventario.getPrecioVenta();
            case 4:
                return inventario.getCantProductos();           
        }
        return new String();
    }
//ESTE METODO SIRVE PARA DEFINIR LOS NOMBRES DE LAS COLUMNAS 

    @Override
    public String getColumnName(int column) {
        //INSERCION DE NOMBRE DE LAS COLUMNAS USANDO EL ARRAY CREADO
        return m_colNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gContable.clickInventario(inventarios.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }



}
