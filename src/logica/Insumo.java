package logica;

import java.util.ArrayList;
import java.util.Scanner;

import grafica.Buscar;
import grafica.Principal;
import java.io.*;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Insumo {

    JFrame ventana2 = new JFrame();
    Scanner dato = new Scanner(System.in);
    private ArrayList<String> tipo;
    private ArrayList<String> nombre;
    private ArrayList<Double> precio;
    private ArrayList<Integer> cantidad;
    private ArrayList<Integer> codigo;

    public Insumo() {//CONSTRUCTOR POR DEFECTO
        tipo = new ArrayList<>(); //INICIALIZO ARRAY LISTS
        nombre = new ArrayList<>();
        precio = new ArrayList<>();
        cantidad = new ArrayList<>();
        codigo = new ArrayList<>();
    }

    public Insumo(ArrayList<String> tipo, ArrayList<String> nombre, ArrayList<Double> precio, ArrayList<Integer> cantidad, ArrayList<Presupuesto> presupuesto) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //SETTERS Y GETTES
    public String getTipo(int posicion) {
        return (tipo.get(posicion));
    }

    public int getCodigo(int posicion) {
        return (codigo.get(posicion));
    }

    public void setCodigo(int codigo) {
        this.codigo.add(codigo);
    }

    public void setTipo(String tipo) {
        this.tipo.add(tipo);
    }

    public String getNombre(int posicion) {
        return (this.nombre.get(posicion));
    }

    public void setNombre(String nombre) {
        this.nombre.add(nombre);
    }

    public double getPrecio(int posicion) {
        return (precio.get(posicion));
    }

    public void setPrecio(double precio) {
        this.precio.add(precio);
    }

    public int getCantidad(int posicion) {
        return (cantidad.get(posicion));
    }

    public void setCantidad(int cantidad) {
        this.cantidad.add(cantidad);
    }

    public String precioToString(int posicion) {
        double precio = this.precio.get(posicion);
        return String.valueOf(precio);
    }

    public String cantidadToString(int posicion) {
        int cantidad = this.cantidad.get(posicion);
        return String.valueOf(cantidad);
    }

    //FIN SETTERS Y GETTERS
    public void ingresar() {//INICIO INGRESAR

        /*System.out.print("Ingrese el Tipo de producto(Ej:Ram,Mother,etc): ");
         tipo.add(dato.next().toLowerCase());
         System.out.print("Ingrese el Nombre del Producto: ");
         nombre.add(dato.next().toLowerCase());
         System.out.print("Ingrese el Precio en Dolares(Ej:20.0): ");
         precio.add(dato.nextDouble());
         System.out.print("Ingrese cuantos tiene(Ej:10): ");
         cantidad.add(dato.nextInt());*/
        tipo.add("mother");
        nombre.add("Asrock ZX3");
        precio.add(20.0);
        cantidad.add(3);
        codigo.add(123);

        tipo.add("cpu");
        nombre.add("intel I9");
        precio.add(20.0);
        cantidad.add(3);
        codigo.add(123);

        tipo.add("gpu");
        nombre.add("Radeon 560");
        precio.add(200.0);
        cantidad.add(10);
        codigo.add(123);

        tipo.add("fuente");
        nombre.add("evga 560w");
        precio.add(115.0);
        cantidad.add(5);
        codigo.add(123);

        tipo.add("cat-5");
        nombre.add("Cable de Red");
        precio.add(2.0);
        cantidad.add(5000);
        codigo.add(123);

        tipo.add("hdd");
        nombre.add("Western Digital Blue 1TB");
        precio.add(85.0);
        cantidad.add(6);
        codigo.add(123);

        tipo.add("torre");
        nombre.add("deepcool Wave V2");
        precio.add(25.0);
        cantidad.add(10);
        codigo.add(123);

        tipo.add("ram");
        nombre.add("Kingston 4GB");
        precio.add(34.0);
        cantidad.add(3);
        codigo.add(123);

        tipo.add("switch");
        nombre.add("Tp link Tl-sf1008d");
        precio.add(13.0);
        cantidad.add(5);
        codigo.add(123);

        tipo.add("router");
        nombre.add("Tp link 9dbi");
        precio.add(53.0);
        cantidad.add(4);
        codigo.add(123);

        tipo.add("mouse");
        nombre.add("Logitech 12asd");
        precio.add(7.0);
        cantidad.add(4);
        codigo.add(123);

        tipo.add("monitor");
        nombre.add("Samsung 23' masd1");
        precio.add(300.0);
        cantidad.add(4);
        codigo.add(123);

        tipo.add("teclado");
        nombre.add("Hp jdk");
        precio.add(12.0);
        cantidad.add(4);
        codigo.add(123);

        tipo.add("parlantes");
        nombre.add("Xion afd4");
        precio.add(600.0);
        cantidad.add(4);
        codigo.add(123);
    }//FIN INGRESAR

    public void eliminar(int pos) {//INICIO ELIMINAR
        tipo.remove(pos);
        nombre.remove(pos);
        precio.remove(pos);
        cantidad.remove(pos);
    }//FIN ELMINAR

    public void modificar() {//INICIO MODIFICAR
        int op;
        inventario();
        System.out.print("ingrese el indice del producto a modificar: ");
        int indi = dato.nextInt();
        do {
            System.out.println("MODIFICAR:");
            System.out.println("1.Tipo");
            System.out.println("2.Nombre");
            System.out.println("3.Precio");
            System.out.println("4.Cantidad");
            System.out.println("0.Salir");
            System.out.print("Opcion: ");
            op = dato.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el nuevo tipo: ");
                    tipo.remove(indi);
                    tipo.add(indi, dato.next());
                    break;
                case 2:
                    nombre.remove(indi);
                    System.out.print("Ingrese el nuevo nombre: ");
                    nombre.add(indi, dato.next());
                    break;
                case 3:
                    precio.remove(indi);
                    System.out.print("Ingrese el nuevo precio: ");
                    precio.add(indi, dato.nextDouble());
                    break;
                case 4:
                    cantidad.remove(indi);
                    System.out.print("Ingrese la nueva cantidad : ");
                    cantidad.add(indi, dato.nextInt());
                    break;
                default:
                    System.out.println("Ingrese una Opcion Valida[0-4]");
            }
        } while (op != 0);
    }//FIN MODIFICAR

    public void buscar() {//INICIO BUSCAR
        int op;
        do {
            System.out.println("MENU BUSCAR");
            System.out.println("1.Buscar por Tipo");
            System.out.println("2.Buscar por Nombre");
            System.out.println("0.salir");
            System.out.print("Opcion: ");
            op = dato.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el Tipo de componente(RAM,Mother,...): ");
                    mostrarTipo(dato.next());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del componente: ");
                    mostrarNombre(dato.next());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese un numero valido[0-2]");
            }
        } while (op != 0);
    }// FIN BUSCAR

    public void inventario() {//INICIO INVENTARIO
        if (nombre.size() > 0) {
            System.out.println("Indice — Tipo — Nombre — Precio — Cantidad");
            for (int cont = 0; cont < nombre.size(); cont++) {
                System.out.println(cont + " " + tipo.get(cont) + " " + nombre.get(cont) + " " + precio.get(cont) + " " + cantidad.get(cont));
            }
        } else {
            System.out.println("Tabla Vacia");
        }
    }//FIN INVENTARIO

    public void mostrarTipo(String componente) {
        componente.toLowerCase();
        System.out.println("indice — nombre — precio");
        for (int cont = 0; cont < tipo.size(); cont++) {
            if ((tipo.get(cont)).contains(componente)) {
                System.out.println(cont + "-" + nombre.get(cont) + " U$S" + precio.get(cont));
            }
        }
    }

    public void mostrarNombre(String componente) {
        componente.toLowerCase();
        System.out.println("indice — Tipo — precio");
        for (int cont = 0; cont < nombre.size(); cont++) {
            if ((nombre.get(cont)).contains(componente)) {
                System.out.println(cont + "-" + tipo.get(cont) + " U$S" + precio.get(cont));
            }
        }
    }
    
    public int posCable() {
        int pos = 0;
        for (int cont = 0; cont < tipo.size(); cont++) {
            if ((nombre.get(cont)).contains("cat-5")) {
                pos = cont;
            }
        }
        return pos;
    }
    public int tamanio() {
        return (tipo.size());
    }
}//FIN CLASE INSUMO
