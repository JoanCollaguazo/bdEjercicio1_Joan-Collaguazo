/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd.controlador;
import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Inventario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joang
 */
public class InventarioBD {
    
    public boolean registrarInventario(Inventario inventario) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        //SENTENCIA SQL
        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`codigo_pro`, `descripcion`, `precios_compra`, `precio_venta`, `can_prodcutos`) VALUES ('"+inventario.getCodigoPro()+"', '"+inventario.getDescripcion()+"', '"+inventario.getPreciosCompra()+"', '"+inventario.getPreciosVenta()+"', '"+inventario.getCantProductos()+"');";
        try {
            //ES UNA INSTANCIA DE LA CONEXION PREVIAMENTE CREADA
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;

    }

    public boolean editarInventario(Inventario inventario) {
        //RETORNO DEL METODO CUANDO SE REALICE LA ACTUALIZACION
        boolean editar = false;
        //INTERFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS 
        Connection con = null;
        //CONTATENANDO LA OPCION DE ACTUALIZACION
        String sql = "UPDATE `bdejercicio1`.`inventario` SET `codigo_pro` = '"+inventario.getCodigoPro()+"', `descripcion` = '"+inventario.getDescripcion()+"', `precios_compra` = '"+inventario.getPreciosCompra()+"', `precio_venta` = '"+inventario.getPreciosVenta()+"', `can_prodcutos` = '"+inventario.getCantProductos()+"' WHERE (`idinventario` = '"+inventario.getIdInventario()+"');";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            //PUENTE ENTRE LA CONEXION Y EL CODIGO 
            stm = con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return editar;
    }

    public boolean eliminarPersona(Inventario inventario) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`inventario` WHERE (`idinventario` = '"+inventario.getIdInventario()+"');";
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return eliminar;
    }
    
    
    
}
