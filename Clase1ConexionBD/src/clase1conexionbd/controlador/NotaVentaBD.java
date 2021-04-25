/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd.controlador;

import Utilidad.Utilidades;
import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import clase1conexionbd.NotaVenta;

/**
 *
 * @author joang
 */
public class NotaVentaBD {

    public Utilidades utilidades;

    public NotaVentaBD() {
        utilidades = new Utilidades();
    }

    public boolean registrarNotaVenta(NotaVenta notaVenta) {
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        String sql;
        sql = "INSERT INTO `ejercicio`.`nota_venta` (`id_nota_venta`, `numero_nota_venta`, `persona_id_persona`, `fecha_venta`, `sub_total`, `iva`, `total`, `tipo_pago`) VALUES ('" + notaVenta.getIdNotaVenta() + "', '" + notaVenta.getNumeroNotaVenta() + "', '" + notaVenta.getPersonaIdPersona() + "', '" + utilidades.devolverFecha(notaVenta.getFechaVenta()) + "', '" + notaVenta.getSubTotal() + "', '" + notaVenta.getIva() + "', '" + notaVenta.getTotal() + "', '" + notaVenta.getTipoPago() + "');";
        //SENTENCIA SQL
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
}