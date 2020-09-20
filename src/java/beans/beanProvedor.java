/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author cesar4rroyo
 */
public class beanProvedor {

    public String getDireccion_provedor() {
        return direccion_provedor;
    }

    public void setDireccion_provedor(String direccion_provedor) {
        this.direccion_provedor = direccion_provedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_Provedor() {
        return id_Provedor;
    }

    public void setId_Provedor(int id_Provedor) {
        this.id_Provedor = id_Provedor;
    }
    private String direccion_provedor;
    private String nombre;
    private String ruc;
    private String telefono;
    private int id_Provedor;

}
