/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

public class motorista {
  private String nombre,apellido,puesto,trans;
  private int id,acar,sal,encargos,comis;

    public motorista(String nombre, String apellido, String puesto, String trans, int id, int acar, int sal, int encargos, int comis) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.trans = trans;
        this.id = id;
        this.acar = acar;
        this.sal = sal;
        this.encargos = encargos;
        this.comis = comis;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcar() {
        return acar;
    }

    public void setAcar(int acar) {
        this.acar = acar;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getEncargos() {
        return encargos;
    }

    public void setEncargos(int encargos) {
        this.encargos = encargos;
    }

    public int getComis() {
        return comis;
    }

    public void setComis(int comis) {
        this.comis = comis;
    }
      @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" su apellido:"+apellido
                +"su id:"+id
                +"su puesto: "+puesto
                +"tiempo que  ha esta en cargo: "+acar
                +"su salario base: "+sal
                +"comissiones: "+comis
                +"medio de transporte: "+trans
                +"encargos que puede hacer a la ves: "+encargos;        
    }
}
