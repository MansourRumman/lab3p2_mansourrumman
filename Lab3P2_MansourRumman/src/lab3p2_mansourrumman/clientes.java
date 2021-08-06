/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

/**
 *
 * @author manso
 */
public class clientes {
  private String nombre,apellido,domicilio;
  private int id,npedi;

    public clientes(String nombre, String apellido, String domicilio, int id, int npedi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.id = id;
        this.npedi = npedi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNpedi() {
        return npedi;
    }

    public void setNpedi(int npedi) {
        this.npedi = npedi;
    }
      @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" su apellido:"+apellido
                +"su id:"+id
                +"su domicilio: "+domicilio
                +"veces que ha pedido de la aplicacion: "+npedi;
                
    }
}
