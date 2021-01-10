/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd.controlador;

import clase1conexionbd.Clase1ConexionBD;
import clase1conexionbd.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author OxOrboy!
 */
public class PersonaBD {

    public boolean registrarPersona(Persona persona) {
        boolean registrar = false;
        Statement stm = null;
        
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`persona` (`idPersona`, `cedula`, `nombre`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('"+String.valueOf(persona.getIdPersona())+"', '"+persona.getCedula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getDireccion()+"', '"+persona.getCorreo()+"', '"+persona.getTelefono()+"')";
        try {
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
    public boolean editarPersona(){
        boolean editar = false;
        //NUEVAS VARIABLES PARA EDITAR LOS DATOS DE MYSQL:
        String nombre = null; 
        int idp;
        
        Statement stm = null;
        Connection con = null;
        //CLASE SCANNER PARA INGRESAR DATOS Y MODIFICAR DESDE LA CLASE:
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL ID DE LA PERSONA PARA EDITAR EL NOMBRE: ");
        idp = sc.nextInt();
        System.out.println("INGRESE EL NUEVO NOMBRE");
        nombre = sc.next();
        String sql ="UPDATE `bdejercicio1`.`persona` SET `nombre` = '"+nombre.toString()+"' WHERE (`idPersona` = '"+String.valueOf(idp)+"');";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return editar;
    }
    public boolean eliminarPersona(){
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        //CREACION DE VARIABLES PARA USAR EN LA SENTENCIA SQL:
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL ID DE LA PERSONA PARA ELIMINAR: ");
        op = sc.nextInt();               
        String sql = "DELETE FROM persona WHERE idPersona = "+String.valueOf(op)+"";
        try {
            Clase1ConexionBD conexion = new Clase1ConexionBD();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            editar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    
    return false;
    }
    
}
