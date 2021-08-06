/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_mansourrumman;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_MansourRumman {

    static Scanner ss = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<administradores> a = new ArrayList();
        ArrayList<programadores> p = new ArrayList();
        ArrayList<motorista> m = new ArrayList();
        ArrayList<clientes> c = new ArrayList();
        ArrayList<restaruante> r = new ArrayList();
        ArrayList<tiendas> t = new ArrayList();
        int pass = 1234;
        System.out.println("Ingrese el tipo de acceso 1.administrador,2.cliente,4.motorista,3.programador,, si es un nuevo cliente aprete 2 para ingresar su informcacion");
        int access = ss.nextInt();
        System.out.println("ingrese la contrasenia");
        int contra = ss.nextInt();
        if (contra == pass) {
            while (access != 5) {
                switch (access) {
                    case 1: {
                        while (opcion != 3) {
                            System.out.println("1. Agregar administrador\n"
                                    + "2. modificar datos \n"
                                    + "3. Salir\n"
                                    + "ingrese su opcion");
                            opcion = ss.nextInt();
                            switch (opcion) {
                                case 1: {
                                    System.out.println("ingrese el nombre del administrador");
                                    String nombre = ss.next();
                                    System.out.print("ingrese apellido");
                                    String apellido = ss.next();
                                    System.out.print("ingrese puesto");
                                    String puesto = ss.next();
                                    System.out.println("ingrese el id");
                                    int id = ss.nextInt();
                                    System.out.println("tiempo acargo");
                                    int acar = ss.nextInt();
                                    System.out.println("salario");
                                    int sal = ss.nextInt();
                                    System.out.println("tiempo experiencia");
                                    int exp = ss.nextInt();
                                    a.add(new administradores(nombre, apellido, puesto, id, acar, sal, exp));
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingrese su id para cambiar");
                                    int cambio = ss.nextInt();
                                    for (int i = 0; i < a.size(); i++) {
                                        if (a.get(i).getId() == cambio) {
                                            System.out.println("Que dato de los desea cambiar:\n"
                                                    + "1-) nombre\n"
                                                    + "2-) apellido\n"
                                                    + "3-) puesto\n"
                                                    + "4-) id\n"
                                                    + "5-) tiempo a acargo\n"
                                                    + "6-) salario\n"
                                                    + "7-) exp");
                                            int cam = ss.nextInt();
                                            switch (cam) {
                                                case 1:
                                                    System.out.println("Ingrese el nuevo nombre: ");
                                                    String cnombre = ss.next();
                                                    a.get(i).setNombre(cnombre);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese el apellido ");
                                                    String cslogan = ss.next();
                                                    a.get(i).setApellido(cslogan);
                                                    break;
                                                case 3:
                                                    System.out.println("cambie el puesto ");
                                                    String cRTN = ss.next();
                                                    a.get(i).setPuesto(cRTN);
                                                    break;
                                                case 4:
                                                    //nombre, slogan, RTN, cempleados, descrip, año, nsocios, ngerente, ubicacion, ventas, secsocial
                                                    System.out.println("cambie el id");
                                                    int ncempleados = ss.nextInt();
                                                    a.get(i).setId(ncempleados);
                                                    break;
                                                case 5:
                                                    System.out.println("cambie los anios a cargo ");
                                                    int cdescrip = ss.nextInt();
                                                    a.get(i).setAcar(cdescrip);
                                                    break;
                                                case 6:
                                                    System.out.println("cambie el salario");
                                                    int caño = ss.nextInt();
                                                    a.get(i).setSal(caño);
                                                    break;
                                                case 7:
                                                    System.out.println("cambie lso anios de experiencia: ");
                                                    int sngerente = ss.nextInt();
                                                    a.get(i).setExp(sngerente);
                                                    break;
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        }

                    }
                    case 2: {
                        while (opcion != 4) {
                            System.out.println("1. Hacer una orden \n"
                                    + "2. Listar todos los restuarantes \n"
                                    + "3. listar todas las tiendas \n"
                                    + " 4. ingresar informacion \n"
                                    + "5. Salir\n"
                                    + "ingrese su opcion");
                            opcion = ss.nextInt();
                            switch (opcion) {
                                case 1: {
                                    System.out.println("que quiere comprar 1.restuarante 2.tienda");
                                    int choice = ss.nextInt();
                                    if (choice == 1) {
                                        System.out.println("Ingrese de donde va  a pedir");
                                        int pedi = ss.nextInt();
                                        r.get(pedi);
                                        System.out.println("ingrese la comida que va a comprar");
                                        String elec = ss.next();
                                        if (r.get(pedi).getLista().equals(elec)) {
                                            System.out.println("ingrese el tipo acompaniamientos");
                                            String type = ss.next();
                                            System.out.println("ingrese cantidad de acompaniamientos");
                                            int num = ss.nextInt();
                                            System.out.println("se completado su orden ");
                                        }

                                    } else {
                                        System.out.println("no se vende eso lo siento");
                                    }
                                    break;
                                }
                                case 2: {
                                    for (int i = 0; i < r.size(); i++) {
                                        System.out.print(i + ". " + r.get(i) + "\n");
                                    }
                                    break;
                                }
                                case 3: {
                                    for (int i = 0; i < t.size(); i++) {
                                        System.out.print(i + ". " + t.get(i) + "\n");
                                    }
                                }
                                case 4: {
                                    System.out.println("ingrese el nombre");
                                    String nombre = ss.next();
                                    System.out.println("ingrese el apellido");;
                                    String apellido = ss.next();
                                    System.out.println("ingrese el domicilio");
                                    String domicilio = ss.next();
                                    System.out.println("ingrese id de la persona");
                                    int id = ss.nextInt();
                                    System.out.println("ingrese veces que ha ordenado");
                                    int npedi = ss.nextInt();
                                    c.add(new clientes(nombre, apellido, domicilio, id, npedi));
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 3: {
                        while (opcion != 3) {
                            System.out.println("1. Agregar motorista\n"
                                    + "2. modificar datos \n"
                                    + "3. Salir\n"
                                    + "ingrese su opcion");
                            opcion = ss.nextInt();
                            switch (opcion) {
                                case 1: {
                                    System.out.println("ingrese el nombre");
                                    String nombre = ss.next();
                                    System.out.println("ingrese el apellido");;
                                    String apellido = ss.next();
                                    System.out.println("ingrese el puesto");
                                    String puesto = ss.next();
                                    System.out.println("ingrese id de la persona");
                                    int id = ss.nextInt();
                                    System.out.println("tiempo acargo");
                                    int acar = ss.nextInt();
                                    System.out.println("salario");
                                    int sal = ss.nextInt();
                                    System.out.println("cantidad de comisiones");
                                    int comis = ss.nextInt();
                                    System.out.println("medio de transporte");
                                    String trans = ss.next();
                                    System.out.println("cantidad de recargos que puede llevar");
                                    int encargos = ss.nextInt();
                                    m.add(new motorista(nombre, apellido, puesto, trans, id, acar, sal, encargos, comis));
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingrese su id para cambiar");
                                    int cambio = ss.nextInt();
                                    for (int i = 0; i < a.size(); i++) {
                                        if (a.get(i).getId() == cambio) {
                                            System.out.println("Que dato de los desea cambiar:\n"
                                                    + "1-) nombre\n"
                                                    + "2-) apellido\n"
                                                    + "3-) puesto\n"
                                                    + "4-) trans\n"
                                                    + "5-) ida\n"
                                                    + "6-) acar\n"
                                                    + "8-) sal\n"
                                                    + "9-) encargos\n"
                                                    + "10-) comis");
                                            int cam = ss.nextInt();
                                            switch (cam) {
                                                case 1:
                                                    System.out.println("Ingrese el nuevo nombre: ");
                                                    String cnombre = ss.next();
                                                    a.get(i).setNombre(cnombre);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese el apellido ");
                                                    String cslogan = ss.next();
                                                    a.get(i).setApellido(cslogan);
                                                    break;
                                                case 3:
                                                    System.out.println("cambie el puesto ");
                                                    String cRTN = ss.next();
                                                    a.get(i).setPuesto(cRTN);
                                                    break;
                                                case 4:
                                                    System.out.println("ingrese medio de transporte");
                                                    String ntrans = ss.next();
                                                    m.get(i).setTrans(ntrans);
                                                case 5:
                                                    //nombre, slogan, RTN, cempleados, descrip, año, nsocios, ngerente, ubicacion, ventas, secsocial
                                                    System.out.println("cambie el id");
                                                    int ncempleados = ss.nextInt();
                                                    a.get(i).setId(ncempleados);
                                                    break;
                                                case 6:
                                                    System.out.println("cambie los anios a cargo ");
                                                    int cdescrip = ss.nextInt();
                                                    a.get(i).setAcar(cdescrip);
                                                    break;
                                                case 7:
                                                    System.out.println("cambie lso anios de experiencia: ");
                                                    int sngerente = ss.nextInt();
                                                    a.get(i).setExp(sngerente);
                                                    break;
                                                case 8:
                                                    System.out.println("cambie el salario");
                                                    int caño = ss.nextInt();
                                                    a.get(i).setSal(caño);
                                                    break;
                                                case 9:
                                                    System.out.println("cambie el numero de encargos ");
                                                    int nen = ss.nextInt();
                                                    m.get(i).setEncargos(nen);
                                                    break;
                                                case 10:
                                                    System.out.println("cambie las comisiones: ");
                                                    int ncomis = ss.nextInt();
                                                    m.get(i).setComis(ncomis);
                                                    break;
                                            }
                                            break;

                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                    case 4: {
                        while (opcion != 6) {
                            System.out.println("1. Agregar programador\n"
                                    + "2. modificar datos \n"
                                    + "3. agragar restuarante\n"
                                    + "4. agragar tienda\n"
                                    + "5. listar\n"
                                    + "6. Salir\n"
                                    + "ingrese su opcion");
                            opcion = ss.nextInt();
                            switch (opcion) {
                                case 1: {
                                    System.out.println("ingrese el nombre ");
                                    String nombre = ss.next();
                                    System.out.print("ingrese apellido");
                                    String apellido = ss.next();
                                    System.out.print("ingrese puesto");
                                    String puesto = ss.next();
                                    System.out.println("ingrese el id");
                                    int id = ss.nextInt();
                                    System.out.println("tiempo acargo");
                                    int acar = ss.nextInt();
                                    System.out.println("salario");
                                    int sal = ss.nextInt();
                                    System.out.println("lenguaje de programacion que domina");
                                    String len = ss.next();
                                    System.out.println("ingrese hora de entrada");
                                    int hcom = ss.nextInt();
                                    System.out.println("ingrese hora de salida");
                                    int hfinal = ss.nextInt();
                                    p.add(new programadores(nombre, apellido, len, puesto, id, sal, acar, hcom, hfinal));
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingrese su id para cambiar");
                                    int cambio = ss.nextInt();
                                    for (int i = 0; i < a.size(); i++) {
                                        if (p.get(i).getId() == cambio) {
                                            System.out.println("Que dato de los desea cambiar:\n"
                                                    + "1-) nombre\n"
                                                    + "2-) apellido\n"
                                                    + "3-) puesto\n"
                                                    + "4-) ida\n"
                                                    + "5-) acar\n"
                                                    + "6-) sal\n"
                                                    + "7-) lenguaje\n"
                                                    + "8.)horas comienza\n"
                                                    + "9-) hotras salida");
                                            int cam = ss.nextInt();
                                            switch (cam) {
                                                case 1:
                                                    System.out.println("ingrese el nombre ");
                                                    String nnombre = ss.next();
                                                    p.get(i).setNombre(nnombre);
                                                    break;
                                                case 2:
                                                    System.out.print("ingrese apellido");
                                                    String napellido = ss.next();
                                                    p.get(i).setApellido(napellido);
                                                    break;
                                                case 3:
                                                    System.out.print("ingrese puesto");
                                                    String npuesto = ss.next();
                                                    p.get(i).setPuesto(npuesto);
                                                    break;
                                                case 4:
                                                    System.out.println("ingrese el id");
                                                    int nid = ss.nextInt();
                                                    p.get(i).setId(nid);
                                                    break;
                                                case 5:
                                                    System.out.println("tiempo acargo");
                                                    int nacar = ss.nextInt();
                                                    p.get(i).setAcar(nacar);
                                                    break;
                                                case 6:
                                                    System.out.println("salario");
                                                    int nsal = ss.nextInt();
                                                    p.get(i).setSal(nsal);
                                                    break;
                                                case 7:
                                                    System.out.println("lenguaje de programacion que domina");
                                                    String nlen = ss.next();
                                                    p.get(i).setLen(nlen);
                                                    break;
                                                case 8:
                                                    System.out.println("ingrese hora de entrada");
                                                    int nhcom = ss.nextInt();
                                                    p.get(i).setHcom(nhcom);
                                                    break;
                                                case 9:
                                                    System.out.println("ingrese hora de salida");
                                                    int nhfinal = ss.nextInt();
                                                    p.get(i).setHcom(nhfinal);
                                                    break;
                                            }
                                        }

                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("ingresar ubicacion");
                                    String ubi = ss.next();
                                    System.out.println("ingresar nombre");
                                    String nombre = ss.next();
                                    System.out.println("ingresar rtn");
                                    int RTN = ss.nextInt();
                                    System.out.println("ingresar slogan");
                                    String slogan = ss.next();
                                    r.add(new restaruante(ubi, nombre, RTN, slogan));
                                    break;
                                }
                                case 4: {
                                    System.out.println("ingresar ubicacion");
                                    String ubi = ss.next();
                                    System.out.println("ingresar nombre");
                                    String nombre = ss.next();
                                    System.out.println("ingresar cantid de empleados");
                                    int cante = ss.nextInt();
                                    System.out.println("tiempo de esperar para preparar articulos");
                                    int tiempoe = ss.nextInt();
                                    t.add(new tiendas(nombre, ubi, cante, tiempoe));
                                    break;
                                }
                                case 5: {
                                    System.out.println("ingresa lista a listar 1. progra"
                                            + ",2.admin,"
                                            + "3.moto,"
                                            + "4.clientes,"
                                            + "5.restaruantes,"
                                            + "6.tiendas,"
                                            + "7salir");
                                    int e = ss.nextInt();
                                    while (e != 7) {
                                        switch (e) {
                                            case 1:
                                                for (int i = 0; i < p.size(); i++) {
                                                    System.out.print(i + ". " + p.get(i) + "\n");
                                                }
                                                break;
                                            case 2:
                                                for (int i = 0; i < a.size(); i++) {
                                                    System.out.print(i + ". " + a.get(i) + "\n");
                                                }
                                                break;
                                            case 3:
                                                for (int i = 0; i < m.size(); i++) {
                                                    System.out.print(i + ". " + m.get(i) + "\n");
                                                }
                                                break;
                                            case 4:
                                                for (int i = 0; i < c.size(); i++) {
                                                    System.out.print(i + ". " + c.get(i) + "\n");
                                                }
                                                break;
                                            case 5:
                                                for (int i = 0; i < r.size(); i++) {
                                                    System.out.print(i + ". " + r.get(i) + "\n");
                                                }
                                                break;
                                            case 6:
                                                for (int i = 0; i < t.size(); i++) {
                                                    System.out.print(i + ". " + t.get(i) + "\n");
                                                }
                                                break;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("contrasenia in correcta no se pudo acceder al sistema");
        }

    }

}
