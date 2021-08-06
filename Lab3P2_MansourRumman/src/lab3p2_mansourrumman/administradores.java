/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

public class administradores {
  private String nombre,apellido,puesto;
  private int id,acar,sal,exp;

    public administradores(String nombre, String apellido, String puesto, int id, int acar, int sal, int exp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.id = id;
        this.acar = acar;
        this.sal = sal;
        this.exp = exp;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    @Override
    public String toString() {
        return "los datos de este ´administrador son: "+ " nombre: "+nombre
                +" su apellido:"+apellido
                +"su id:"+id
                +"su puesto: "+puesto
                +"tiempo que  ha esta en cargo: "+acar
                +"su salario base: "+sal
                +"tiempo de experiencia: "+exp;
                
    }
    
}
