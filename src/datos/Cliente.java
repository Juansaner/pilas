/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import pilas.Base;

/**
 *
 * @author jupas
 */
public class Cliente extends Base {
     private String nombre;
    private String telefono;
    private String direccion;
    private String codigo;
    private String correo;

    public Cliente() {
    }

    public Cliente(String codigo, String correo, String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigo = codigo;
        this.correo = correo;
    }

    public String getNombreC() {
        return nombre;
    }

    public void setNombreC(String nombreC) {
        this.nombre = nombreC;
    }

    public String getTelefonoC() {
        return telefono;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefono = telefonoC;
    }

    public String getDireccionC() {
        return direccion;
    }

    public void setDireccionC(String direccionC) {
        this.direccion = direccionC;
    }

    /**
     * Get the value of correoc
     *
     * @return the value of correoc
     */
    public String getCorreoc() {
        return correo;
    }

    /**
     * Set the value of correoc
     *
     * @param correoc new value of correoc
     */
    public void setCorreoc(String correoc) {
        this.correo = correoc;
    }

    /**
     * Get the value of codigocliente
     *
     * @return the value of codigocliente
     */
    public String getCodigocliente() {
        return codigo;
    }

    /**
     * Set the value of codigocliente
     *
     * @param codigocliente new value of codigocliente
     */
    public void setCodigocliente(String codigocliente) {
        this.codigo = codigocliente;
    }

    @Override
    public String toString() {
        return  nombre + ", " + telefono + ", " + direccion + ", " + codigo + ", " + correo + "\n";
    }

    @Override
    public Base copia() {
        return new Cliente(codigo, correo, nombre, telefono, direccion);
    }

}
