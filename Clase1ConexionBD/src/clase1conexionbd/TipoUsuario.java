/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1conexionbd;

/**
 *
 * @author joang
 */
public class TipoUsuario {
     
    private int idTipoUsuario;
    private int tipoUsuarioSistema;
    private int personaIdPersonaSistema;
    private String contraseña;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getTipoUsuarioSistema() {
        return tipoUsuarioSistema;
    }

    public void setTipoUsuarioSistema(int tipoUsuarioSistema) {
        this.tipoUsuarioSistema = tipoUsuarioSistema;
    }

    public int getPersonaIdPersonaSistema() {
        return personaIdPersonaSistema;
    }

    public void setPersonaIdPersonaSistema(int personaIdPersonaSistema) {
        this.personaIdPersonaSistema = personaIdPersonaSistema;
    }

    public String getContrasenia() {
        return contraseña;
    }

    public void setContrasenia(String contrasenia) {
        this.contraseña = contrasenia;
    }
    
}
