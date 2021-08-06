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
public class tiendas {
    private String nombre,ubi;
    private int cante,tiempoe;
    private ArrayList<articulos> lista=new ArrayList();

    public tiendas(String nombre, String ubi, int cante, int tiempoe) {
        this.nombre = nombre;
        this.ubi = ubi;
        this.cante = cante;
        this.tiempoe = tiempoe;

    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public int getCante() {
        return cante;
    }

    public void setCante(int cante) {
        this.cante = cante;
    }

    public int getTiempoe() {
        return tiempoe;
    }

    public void setTiempoe(int tiempoe) {
        this.tiempoe = tiempoe;
    }
                @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" cantidad de empleados:"+cante
                +" productos :"+lista
                +"tiempo de entrega "+tiempoe;        
    }
}
