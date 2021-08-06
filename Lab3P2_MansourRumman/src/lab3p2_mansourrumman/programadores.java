/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

public class programadores {
   private String nombre,apellido,len,puesto;
   private int id,sal,hcom,hfinal,acar;

    public programadores(String nombre, String apellido, String len, String puesto, int id, int sal,int acar, int hcom, int hfinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.len = len;
        this.puesto = puesto;
        this.id = id;
        this.sal = sal;
        this.hcom = hcom;
        this.hfinal = hfinal;
        this.acar=acar;
    }

    public int getAcar() {
        return acar;
    }

    public void setAcar(int acar) {
        this.acar = acar;
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

    public String getLen() {
        return len;
    }

    public void setLen(String len) {
        this.len = len;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getHcom() {
        return hcom;
    }

    public void setHcom(int hcom) {
        this.hcom = hcom;
    }

    public int getHfinal() {
        return hfinal;
    }

    public void setHfinal(int hfinal) {
        this.hfinal = hfinal;
    }
     @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" su apellido:"+apellido
                +"su id:"+id
                +"su puesto: "+puesto
                +"tiempo que  ha esta en cargo: "+acar
                +"su salario base: "+sal
                +"lenaguaje de programacion que domina: "+len
                +"hora que empieza: "+hcom
                +"hora que finaliza: "+hfinal;        
    }
}