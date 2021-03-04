/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

import clase1conexionbd.Persona;
import clase1conexionbd.Proveedores;
import clase1conexionbd.Inventario;


/**
 *
 * @author joang
 */
public interface ComunicacionVistaModeloTablas {
    void clickPersona(Persona p);
    void clickInventario(Inventario p);
    void clickProveedores(Proveedores p);
    
}
