package logica;
public class Factura {
    
    private double total;
    
    private Presupuesto presupuesto;
    private Cliente cliente;

    public Factura() {
    }

    public Factura(double total, Presupuesto presupuesto, Cliente cliente) {
        this.total = total;
        this.presupuesto = presupuesto;
        this.cliente = cliente;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double subtotal) {        
        double iva=subtotal*0.22;
        this.total=subtotal+iva;
    }
    @Override
    public String toString() {
        return "Factura{" + "total=" + total + ", presupuesto=" + presupuesto + ", cliente=" + cliente + '}';
    }
    
    
}
