/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd.controlador;

import java.sql.SQLException;
import clase1conexionbd.TipoUsuario;
import java.sql.Connection;
import java.sql.Statement;
import clase1conexionbd.Clase1ConexionBD;


/**
 *
 * @author joang
 */
public class TipoUsuarioDB {

    // Registrar tipoUsuario en la base de datos.
    public boolean registrarTipoUsuario(TipoUsuario tipoUsuario) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        String sql = "INSERT INTO `ejercicio`.`tipo_usuario` (`tipo_usuario_sistema`, `id_persona_sistema`, `contrasenia`) VALUES ("
                + "'" + tipoUsuario.getPersonaIdPersonaSistema() + "', "
                + "'" + tipoUsuario.getPersonaIdPersonaSistema() + "', "
                + "'" + tipoUsuario.getPersonaIdPersonaSistema() + "');";
        try {
            //Es una instancia de la conexion previamente creada.
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

    //ACtualizar la tipoUsuario e la base de datos.
    public boolean actualizar(TipoUsuario tipoUsuario) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            connect = conexion.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }

    //Eliminar una tipoUsuario en base al ID de la tipoUsuario seleccionada de la base de datos.
    public boolean eliminar(TipoUsuario tipoUsuario) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `ejercicio`.`tipoUsuario` WHERE (`idtipoUsuario` = '" + String.valueOf(tipoUsuario.getIdTipoUsuario()) + "');";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
}
