/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
 /* beneficiario - de tipo Persona
tiempo de préstamo en meses
ciudad del préstamo (de tipo String)
La clase debe tener un constructor que reciba los parámetros 
para beneficiario, tiempo de préstamo en meses 
    y ciudad del préstamo.
    */   
    
    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoMeses = t;
        ciudadPrestamo = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public int obtenerTiempoMeses() {
        return tiempoMeses;
    }

    public void establecerTiempoMeses(int t) {
        tiempoMeses = t;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c;
    }
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Datos Beneficiario\n"
                + "Nombre del beneficiario: %s\n"
                + "Apellido del beneficiario: %s\n"
                + "Username del beneficiario: %s\n"
                + "Número de meses: %d\n"
                + "Ciudad: %s\n",
                obtenerBeneficiario().obtenerNombre(),
                obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUsername(),               
                obtenerTiempoMeses(),
                obtenerCiudadPrestamo());
        
        return cadenaFinal;
    }
    
}
