package logica;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Cliente {

    private String priNombre;
    private String priApellido;
    private String cedula;
    private boolean compro;
    private int numTarjeta,pin;
    private String fechaExpiracion;

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public int getPin() {
        return pin;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
    

    public Cliente() {
    }

    public Cliente(String priNombre, String priApellido, String cedula, boolean compro) {
        this.priNombre = priNombre;
        this.priApellido = priApellido;
        this.cedula = cedula;
        this.compro = compro;
    }

    public String getPriNombre() {
        return priNombre;
    }

    public void setPriNombre(String priNombre) {
        this.priNombre = priNombre;
    }

    public String getPriApellido() {
        return priApellido;
    }

    public void setPriApellido(String priApellido) {
        this.priApellido = priApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isCompro() {
        return compro;
    }

    public void setCompro(boolean compro) {
        this.compro = compro;
    }
    
    public void registrarCliente(){
        String cadenaDatos=" ";
        cadenaDatos=cedula+" , "+priNombre+" , "+priApellido;
        
        FileWriter fichero;
        PrintWriter pw;
        try{
            fichero = new FileWriter("Clientes.txt",true);
            pw=new PrintWriter (fichero);
            pw.println(cadenaDatos);
            pw.close();
            fichero.close();
            
            JOptionPane.showMessageDialog(null, "Datos ingresados al archivo correspondiente");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
