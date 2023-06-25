/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete2.Prestamo;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {
   private String tipoAuto;
   private String marcaAuto;
   private Persona garante1;
   private double valorAuto;
   private double valorMensualPrestamo;

    public PrestamoAutomovil(Persona b, int t, String c) {
        super(b, t, c);
    }

    
   

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public void establecerTipoAuto(String t) {
        tipoAuto = t;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public void establecertMarcaAuto(String m) {
        marcaAuto = m;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public void establecerGarante1(Persona g) {
        garante1 = g;
    }

    public double obtenerValoAuto() {
        return valorAuto;
    }

    public void establecerValoAuto(double v) {
        valorAuto = v;
    }

    public double obtenerValorMensualPrestamo() {
        return valorMensualPrestamo;
    }

    public void calcularValorMensualPrestamo() {
        valorMensualPrestamo = valorAuto/ tiempoMeses;
    }
    /*tipo de automóvil
marca de automóvil
garante1 tipo Persona
valor de automóvil
valor mensual de pago préstamo automóvil*/
   @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%sPrestamo Automovil\n"
                + "Tipo de Automovil: %s\n"
                + "Marca de Automovil: %s\n"
                + "Nombre del garante: %s\n"
                + "Apellido del garante: %s\n"
                + "Username del garante: %s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor Mensual del pago prestamo automovil: %.2f\n",
                cadenaFinal,
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerGarante1().obtenerUsername(),
                obtenerValoAuto(),
                obtenerValorMensualPrestamo());
        
        return cadenaFinal;
    }
   
}
