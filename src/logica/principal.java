package logica;

import java.util.Scanner;

public class principal {

    static Insumo insumo = new Insumo();
    static Presupuesto presu = new Presupuesto();
    static Scanner dato = new Scanner(System.in);
    static Factura factura = new Factura();
    static Cliente cliente = new Cliente();

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        insumo.ingresar(); //ingreso automatico para pruebas
        //insumo.recorrerTipo();
        int op = 0;
        do {
            System.out.println("Menu de Insumos");
            System.out.println("1.Ingresar");
            System.out.println("2.Buscar");
            System.out.println("3.Modificar");
            System.out.println("4.Eliminar");
            System.out.println("5.ver Inventario");
            System.out.println("6.Generar un Presupuesto");
            System.out.println("7.Ver Carrito de compra");
            System.out.println("0.Salir");
            System.out.print("Opcion: ");
            op = dato.nextInt();
            switch (op) {
                case 1:
                    insumo.ingresar(); //funciona
                    break;
                case 2:
                    insumo.buscar(); //funciona
                    break;
                case 3:
                    insumo.modificar();//funciona
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del Insumo a eliminar: ");
                    String insuElim = dato.next();
                    for (int cont = 0; cont < insumo.tamanio(); cont++) {
                        if (insumo.getNombre(cont).contains(insuElim)) {
                            insumo.eliminar(cont);
                            System.out.println("Insumo Eliminado con exito");
                        } else {
                            System.err.println("El insumo no concuerda con los ingresados o no existe");
                        }
                    }
                    break;
                case 5:
                    insumo.inventario(); //funciona
                    break;
                case 6:
                    int opG = 0;
                    do {
                        System.out.println("GENERAR PRESUPUESTOS");
                        System.out.println("1.Armar PC");
                        System.out.println("2.Cableado Estructurado");
                        System.out.println("0.salir");
                        System.out.print("Opcion: ");
                        opG = dato.nextInt();
                        switch (opG) {
                            case 1:
                                armarPc();
                                break;
                            case 2:
                                cableadoEstructurado();
                                break;
                            case 0:
                                break;
                        }
                    } while (opG != 0);
                    break;
                case 7:
                    boleta();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("ingrese un numero correcto [0-6]");
            }
        } while (op != 0);
    }//FIN MAIN

    /*Metodos ================================================================*/
    public static void armarPc() {
        System.out.println("1.Armado Basico");
        System.out.println("2.Armado Personalizado");
        System.out.print("Opcion: ");
        int op = dato.nextInt();
        switch (op) {
            case 1:
                System.out.println("EL armado basico incluye: ");
                System.out.println("Torre,Mother,CPU,RAM,Fuente,Disco HDD");
                do {
                    System.out.println("1.Elegir componentes ");
                    System.out.println("0.salir");
                    System.out.print("Opcion: ");
                    op = dato.nextInt();
                    switch (op) {
                        case 1:
                            eleccionComponentesPC();
                            break;
                        case 0:
                            break;
                    }
                } while (op != 0);
                System.out.println("Subtotal: " + presu.calculoPresupuesto());
                break;//fin armado basico funciona
            case 2:
                int posicionComp;
                System.out.println("El Armado Completo incluye lo basico mas un SO,Perifericos y tarjeta de video a eleccion");
                do {
                    System.out.println("1.Ingrese lo basico");
                    System.out.println("2.Elegir SO");
                    System.out.println("3.Elegir Perifericos");
                    System.out.println("4.Elegir Tarjeta de video");
                    System.out.println("0.Salir");
                    System.out.print("Opcion: ");
                    op = dato.nextInt();
                    switch (op) {
                        case 1:
                            eleccionComponentesPC();
                            break;
                        case 2:
                            insumo.mostrarTipo("so");
                            System.out.print("Ingrese el indice de la mother que desee: ");
                            posicionComp = dato.nextInt();
                            System.out.print("Cuantas desea?: ");
                            presu.setCantidades(dato.nextInt());
                            presu.setCarrito(posicionComp);
                            presu.setCosto(insumo.getPrecio(posicionComp));
                            break;//fin elegir Sistema Operativo
                        case 3:
                            do {
                                System.out.println("Elegir Perifericos: ");
                                System.out.println("1.Mouses");
                                System.out.println("2.Teclados");
                                System.out.println("3.Parlantes");
                                System.out.println("4.Monitores");
                                System.out.println("0.Salir");
                                System.out.print("Opcion: ");
                                op = dato.nextInt();
                                switch (op) {
                                    case 1:
                                        insumo.mostrarTipo("mouse");
                                        System.out.print("Ingrese el indice de la mother que desee: ");
                                        posicionComp = dato.nextInt();
                                        System.out.print("Cuantas desea?: ");
                                        presu.setCantidades(dato.nextInt());
                                        presu.setCarrito(posicionComp);
                                        presu.setCosto(insumo.getPrecio(posicionComp));
                                        break;
                                    case 2:
                                        insumo.mostrarTipo("teclado");
                                        System.out.print("Ingrese el indice de la mother que desee: ");
                                        posicionComp = dato.nextInt();
                                        System.out.print("Cuantas desea?: ");
                                        presu.setCantidades(dato.nextInt());
                                        presu.setCarrito(posicionComp);
                                        presu.setCosto(insumo.getPrecio(posicionComp));
                                        break;
                                    case 3:
                                        insumo.mostrarTipo("parlante");
                                        System.out.print("Ingrese el indice de la mother que desee: ");
                                        posicionComp = dato.nextInt();
                                        System.out.print("Cuantas desea?: ");
                                        presu.setCantidades(dato.nextInt());
                                        presu.setCarrito(posicionComp);
                                        presu.setCosto(insumo.getPrecio(posicionComp));
                                        break;
                                    case 4:
                                        insumo.mostrarTipo("monitor");
                                        System.out.print("Ingrese el indice de la mother que desee: ");
                                        posicionComp = dato.nextInt();
                                        System.out.print("Cuantas desea?: ");
                                        presu.setCantidades(dato.nextInt());
                                        presu.setCarrito(posicionComp);
                                        presu.setCosto(insumo.getPrecio(posicionComp));
                                        break;
                                    default:
                                        break;
                                }
                            } while (op != 0);
                            break;//fin elegir perifericos
                        case 4:
                            insumo.mostrarTipo("gpu");
                            System.out.print("Ingrese el indice de la mother que desee: ");
                            posicionComp = dato.nextInt();
                            System.out.print("Cuantas desea?: ");
                            presu.setCantidades(dato.nextInt());
                            presu.setCarrito(posicionComp);
                            presu.setCosto(insumo.getPrecio(posicionComp));
                            break;//fin elegir Tarjeta de Video
                        default:
                            System.out.println("Elija una opcion correcta.");
                            break;
                    }
                } while (op != 0);
                System.out.println("Subtotal: " + presu.calculoPresupuesto());
                break;//fin armado personalizado
        }//funciona
    }//Fin ArmadoPC

    public static void eleccionComponentesPC() {
        int posicionComp;
        insumo.mostrarTipo("mother");
        System.out.print("Ingrese el indice de la mother que desee: ");
        posicionComp = dato.nextInt();
        System.out.print("Cuantas desea?: ");
        presu.setCantidades(dato.nextInt());
        presu.setCarrito(posicionComp);
        presu.setCosto(insumo.getPrecio(posicionComp));

        insumo.mostrarTipo("ram");
        System.out.print("Ingrese el indice de la ram que desee: ");
        posicionComp = dato.nextInt();
        System.out.print("Cuantas desea?: ");
        presu.setCantidades(dato.nextInt());
        presu.setCarrito(posicionComp);
        presu.setCosto(insumo.getPrecio(posicionComp));

        insumo.mostrarTipo("fuente");
        System.out.print("Ingrese el indice de la fuente que desee: ");
        posicionComp = dato.nextInt();
        System.out.print("Cuantas desea?: ");
        presu.setCantidades(dato.nextInt());
        presu.setCarrito(posicionComp);
        presu.setCosto(insumo.getPrecio(posicionComp));

        insumo.mostrarTipo("cpu");
        System.out.print("Ingrese el indice de la cpu que desee: ");
        posicionComp = dato.nextInt();
        System.out.print("Cuantas desea?: ");
        presu.setCantidades(dato.nextInt());
        presu.setCarrito(posicionComp);
        presu.setCosto(insumo.getPrecio(posicionComp));

        insumo.mostrarTipo("hdd");
        System.out.print("Ingrese el indice del disco que desee: ");
        posicionComp = dato.nextInt();
        System.out.print("Cuantas desea?: ");
        presu.setCantidades(dato.nextInt());
        presu.setCarrito(posicionComp);
        presu.setCosto(insumo.getPrecio(posicionComp));
    }

    public static void cableadoEstructurado() {
        int op, posicionComp, metrosCable, posSwitch;
        do {
            System.out.println("¿Que tipo de cableado desea?");
            System.out.println("1.Hogar");
            System.out.println("2.Empresarial");
            System.out.println("0.volver");
            System.out.print("Opcion: ");
            op = dato.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese la cantidad de metros de cable CAT-5 que necesitan: ");
                    metrosCable = dato.nextInt();
                    presu.setCosto((metrosCable * 20));
                    presu.setCarrito(insumo.posCable());
                    presu.setCantidades(metrosCable);

                    insumo.mostrarTipo("tres en uno");
                    System.out.print("Ingrese el router 3 en uno que desea: ");
                    posicionComp = dato.nextInt();
                    System.out.print("Cuantas desea?: ");
                    presu.setCantidades(dato.nextInt());
                    presu.setCarrito(posicionComp);
                    presu.setCosto(insumo.getPrecio(posicionComp));
                    break;
                case 2:
                    System.out.println("Incluye un router y cantidad de metros de cable CAT-5");

                    insumo.mostrarTipo("router");
                    System.out.print("Ingrese el indice de la mother que desee: ");
                    posicionComp = dato.nextInt();
                    System.out.print("Cuantas desea?: ");
                    presu.setCantidades(dato.nextInt());
                    presu.setCarrito(posicionComp);
                    presu.setCosto(insumo.getPrecio(posicionComp));

                    System.out.print("Ingrese la cantidad de metros de cable CAT-5 que necesitan: ");
                    metrosCable = dato.nextInt();
                    presu.setCosto((metrosCable * 20));
                    presu.setCarrito(insumo.posCable());
                    presu.setCantidades(metrosCable);

                    insumo.mostrarTipo("switch");
                    System.out.print("Ingrese el indice de la mother que desee: ");
                    posicionComp = dato.nextInt();
                    System.out.print("Cuantas desea?: ");
                    presu.setCantidades(dato.nextInt());
                    presu.setCarrito(posicionComp);
                    presu.setCosto(insumo.getPrecio(posicionComp));

                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese un digito correcto!");
                    break;
            }
        } while (op != 0);
        System.out.println("Subtotal: " + presu.calculoPresupuesto());
    }//Fin Cableado

    public static void boleta() {
        factura.setTotal(presu.getSubtotal());
        int cantidad = 0, metodoPago = 0;
        System.out.println("Boleta: ");
        System.out.println("Producto — Precio");
        for (int cont = 0; cont < presu.carritoSize(); cont++) {
            System.out.println(insumo.getTipo(presu.getCarrito(cont))
                    + " " + insumo.getNombre(presu.getCarrito(cont))
                    + " x" + presu.getCantidades(cont)
                    + " US$ c/u" + presu.getCosto(cont));
        }
        System.out.println("                           SubTotal: " + presu.getSubtotal());
        System.out.println("                           Total IVA inc.: " + factura.getTotal());
        
        System.out.println("Desea confirmar la compra? si/no: ");
        
        if (dato.next().equalsIgnoreCase("si")) {
            cliente.setCompro(true);
            dato.nextLine();
            System.out.print("Ingrese su Nombre:");
            cliente.setPriNombre(dato.nextLine());
            System.out.print("Ingrese su apellido:");
            cliente.setPriApellido(dato.nextLine());
            System.out.print("Ingrese su cedula:");
            cliente.setCedula(dato.next());
            System.out.println("Elija un método de pago");
            System.out.println("1.Tarjeta");
            System.out.println("2.Efectivo");
            System.out.print("Opcion: ");
            metodoPago = dato.nextInt();
            switch (metodoPago) {
                case 1:
                    System.out.print("Ingrese numero de tarjeta :");
                    cliente.setNumTarjeta(dato.nextInt());
                    System.out.print("Ingrese el pin: ");
                    cliente.setPin(dato.nextInt());
                    System.out.print("Ingrese la fecha de expiracion: ");
                    cliente.setFechaExpiracion(dato.next());
                    break;
                case 2:
                    System.out.println("Con que moneda desea pagar");
                    System.out.println("1.Dolares");
                    System.out.println("2.Pesos");
                    System.out.print("Opcion: ");
                    int moneda = dato.nextInt();
                    switch (moneda) {
                        case 1:
                            System.out.println("El total en dolares es: US$" + factura.getTotal());
                            break;
                        case 2:
                            System.out.println("El total en pesos es: $" + (factura.getTotal()) * 37);
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                    break;

            }
            System.out.println("Agradecemos su compra!");
        } else {
            System.out.println("La compra no se concreto , esperamos volverlo a verlo");
        }
    }//fin boleta
}//Fin Clase
