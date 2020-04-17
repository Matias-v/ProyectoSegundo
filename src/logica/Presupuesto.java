package logica;

import java.awt.BorderLayout;
import java.util.ArrayList;

public class Presupuesto {

    private ArrayList<Integer> carrito;
    private ArrayList<Double> costo;
    private ArrayList <Integer> cantidades;
    private double subtotal=0;
    //variable agregacion
    private ArrayList<Insumo> tiene;

    public Presupuesto() {/*Constructor comun*/
        tiene = new ArrayList<>();
        carrito = new ArrayList<>();
        costo = new ArrayList<>();
        cantidades = new ArrayList<>();
    }
    public Presupuesto(ArrayList<Integer> carrito, ArrayList<Double> costo, ArrayList<Integer> cantidades, ArrayList<Insumo> tiene) {
        this.carrito = carrito;
        this.costo = costo;
        this.cantidades = cantidades;
        this.tiene = tiene;
    }
    
    /*Getters y Setters ====================================================*/

    public int getCarrito(int posicion) {
        return (this.carrito.get(posicion));
    }
    public int carritoSize(){
        return this.carrito.size();
    }
    public void setCarrito(int carrito) {
        this.carrito.add(carrito);
    }

    public double getCosto(int posicion) {
        return costo.get(posicion);
    }
    public void setCosto(double precio){
        this.costo.add(precio);
    }
    
    
    public double getSubtotal(){
        return subtotal;
    }
    public double calculoPresupuesto(){
        double subTotal = 0;
        for (int cont=0;cont<costo.size();cont++){
            subTotal=(costo.get(cont) * cantidades.get(cont))+subTotal;
        }
        this.subtotal=subTotal;
        return  subTotal;
    }
    public void setCantidades(int cantidades){
        this.cantidades.add(cantidades); 
    }
    
    public int getCantidades(int posicion){
        return cantidades.get(posicion);
    }
    
    public void eliminar(int pos){
        carrito.remove(pos);
        cantidades.remove(pos);
        costo.remove(pos);
    }
    public int tamanio(){
        return carrito.size();
    }
    public String cantidadesToString(int pos){
        int cantidad = cantidades.get(pos);
        return String.valueOf(cantidad);
    }
    @Override
    public String toString() {
        return "Presupuesto{" + "carrito=" + carrito + ", insumo=" + tiene + '}';
    }
    
}
