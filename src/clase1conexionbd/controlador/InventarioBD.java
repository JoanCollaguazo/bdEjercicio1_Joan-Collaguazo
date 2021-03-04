/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd.controlador;

import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Inventario;
import clase1conexionbd.Proveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joang
 */
public class InventarioBD {

    public boolean registrarProducto(Inventario inventario) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        //SENTENCIA SQL
        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`codigo_pro`, `descripcion`, `precios_compra`, `precio_venta`, `can_prodcutos`) VALUES ('" + inventario.getCodProducto() + "', '" + inventario.getDescripcion() + "', '" + inventario.getPrecioCompra() + "', '" + inventario.getPrecioVenta() + "', '" + inventario.getCantProductos() + "');";
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
        System.out.println("ACTUALIZAR" + inventario);
        //RETORNO DEL METODO CUANDO SE REALICE LA ACTUALIZACION
        boolean editar = false;
        //INTERFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS 
        Connection con = null;
        //CONTATENANDO LA OPCION DE ACTUALIZACION
        String sql = "UPDATE `bdejercicio1`.`inventario` SET `codigo_pro` = '" + inventario.getCodProducto() + "', `descripcion` = '" + inventario.getDescripcion() + "', `precios_compra` = '" + inventario.getPrecioCompra() + "', `precio_venta` = '" + inventario.getPrecioVenta() + "', `can_prodcutos` = '" + inventario.getCantProductos() + "' WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
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

    public boolean eliminarInventario(Inventario inventario) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`inventario` WHERE (`idinventario` = '" + inventario.getIdInventario() + "');";
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

    public List<Inventario> obtenerProductosInventario() {
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;

        String sql = "SELECT * FROM bdejercicio1.inventario;";

        List<Inventario> ListaInventarios = new ArrayList<Inventario>();

        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getString(4));
                c.setPrecioVenta(rs.getNString(5));
                c.setCantProductos(rs.getString(6));
                ListaInventarios.add(c);

            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return ListaInventarios;
    }

    public List<Inventario> obtenerProductosInventarioCodigo(String codigo) {
        System.out.println("codigo" + codigo);
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE codigo_pro = '" + codigo + "';";
        List<Inventario> listaInventarioCodigo = new ArrayList<Inventario>();
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getNString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantProductos(rs.getString(6));
                listaInventarioCodigo.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaInventarioCodigo;
    }

    public List<Inventario> obtenerProductosInventarioDescripcion(String descripcion) {
        System.out.println("descripcion"+descripcion);
        Connection con = null;
        Statement stm = null;
        //SENTECIA DE JDBC  PARA OBTENER VALORES DE LA BASE DE DATOS
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario WHERE descripcion like \"%" + descripcion + "%\"";
        List<Inventario> listaInventarioDescripcion = new ArrayList<Inventario>();       
        try {
            con = new Clase1ConexionBD().conectarBaseDatos();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getNString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantProductos(rs.getString(6));
                listaInventarioDescripcion.add(c);
            }
            stm.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaInventarioDescripcion;
    }

}
