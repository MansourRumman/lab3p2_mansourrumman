/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

import java.util.ArrayList;

/**
 *
 * @author manso
 */
public class restaruante {
    private String ubi,nombre,slogan;
    private int RTN;
    private ArrayList<comida>lista=new ArrayList();
    

    public restaruante(String ubi, String nombre, int RTN, String slogan) {
        this.ubi = ubi;
        this.nombre = nombre;
        this.RTN = RTN;
        this.slogan = slogan;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRTN() {
        return RTN;
    }

    public void setRTN(int RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
         @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" su RTN:"+RTN
                +"su slogan:"+slogan
                +" comidas :"+lista
                +"la ubicacion: "+ubi;   
    }
}
