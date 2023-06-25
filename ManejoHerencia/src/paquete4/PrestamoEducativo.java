/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete5.InstitucionEducativa;
import paquete2.Prestamo;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo(Persona b, int t, String c) {
        super(b, t, c);
    }
    
    

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public void establecerNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public void establecerCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public void establecerValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double obtenerValorMensualCarrera() {
        return valorMensualCarrera;
    }

    public void calcularValorMensualCarrera() {
        valorMensualCarrera = (valorCarrera/tiempoMeses) - ((0.10)*(valorCarrera/tiempoMeses));
    }
    /*nivel de estudio
Centro educativo de tipo Institución Educativa
valor de la carrera
valor mensual del pago del préstamo del valor de la carrera*/
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%sPrestamo Educativo\n"
                + "Nombre del centro Educativo: %s\n"
                + "Siglas del centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del pago del préstamo "
                + "del valor de la carrera: %.2f\n",
                cadenaFinal,
                obtenerCentroEducativo().obtenerNombre(),
                obtenerCentroEducativo().obtenerSiglas(),
                obtenerValorCarrera(),
                obtenerValorMensualCarrera());
        
        return cadenaFinal;
    }

}
