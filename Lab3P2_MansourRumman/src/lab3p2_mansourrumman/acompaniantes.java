/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;


public class acompaniantes {
    private String nombre,tipo;
    private int precio;

    public acompaniantes(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
             @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" precio de la comida:"+precio
                +"el tipo de acompaniante: "+tipo;        
    }
}
