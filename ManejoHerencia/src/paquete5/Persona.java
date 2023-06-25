/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author villa
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String username;

    public Persona(String n,String a, String u){
        nombre =n;
        apellido = a;
        username=u;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public String obtenerUsername() {
        return username;
    }

    public void establecerUsername(String u) {
        username = u;
    }
}
