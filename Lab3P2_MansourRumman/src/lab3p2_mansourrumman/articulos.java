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
public class articulos {
    private String nombre,categoria;
    private int prec;

    public articulos(String nombre, String categoria, int prec) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.prec = prec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrec() {
        return prec;
    }

    public void setPrec(int prec) {
        this.prec = prec;
    }
                @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" precio del articulo:"+prec
                +"la categoria: "+categoria;        
    }
}
