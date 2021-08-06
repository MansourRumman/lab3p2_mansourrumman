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
public class comida {
    private int id,cant,precio;
    private String nombre;

    public comida(int id, int cant, int precio, String nombre) {
        this.id = id;
        this.cant = cant;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
         @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" precio de la comida:"+precio
                +"su id:"+id
                +"cantidad de acompaniamientos: "+cant;        
    }
}
