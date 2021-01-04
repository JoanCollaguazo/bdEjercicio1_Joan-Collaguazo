/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author OxOrboy!
 */
public class Main {

    public static void main(String[] args) {
        Clase1ConexionBD cn = new Clase1ConexionBD();
        cn.conector();

    }

}
