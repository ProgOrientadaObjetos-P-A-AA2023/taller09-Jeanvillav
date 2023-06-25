/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.*;
import paquete2.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        byte opc;
        String op;
        Scanner sc = new Scanner(System.in);
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        do {

            System.out.println("Menu=================");
            System.out.println("1. Prestamo Automovil");
            System.out.println("2. Prestamo Educativo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion:");
            opc = sc.nextByte();
            if (opc == 1) {
                sc.nextLine();
                System.out.println("Ingrese el nombre del beneficiario: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apellido del beneficiario: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el username del beneficiario: ");
                String username = sc.nextLine();
                System.out.println("Ingrese la ciudad del prestamo: ");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese el tiempo de prestamo en meses: ");
                int meses = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el tipo de auto: ");
                String tipo = sc.nextLine();
                System.out.println("Ingrese la marca del auto: ");
                String marca = sc.nextLine();
                System.out.println("Ingrese el nombre del garante del prestamo: ");
                String nombreG = sc.nextLine();
                System.out.println("Ingrese el apellido del garante del prestamo: ");
                String apellidoG = sc.nextLine();
                System.out.println("Ingrese el username del garante del prestamo: ");
                String usernameG = sc.nextLine();
                System.out.println("Ingrese el valor del automovil:");
                double vAuto = sc.nextDouble();

                Persona person = new Persona(nombre, apellido, username);
                PrestamoAutomovil pa = new PrestamoAutomovil(person, meses, ciudad);
                pa.establecerTiempoMeses(meses);
                pa.establecerCiudadPrestamo(ciudad);
                pa.establecerTipoAuto(tipo);
                pa.establecertMarcaAuto(marca);
                Persona garante = new Persona(nombreG, apellidoG, usernameG);
                pa.establecerGarante1(garante);
                pa.establecerValoAuto(vAuto);
                pa.calcularValorMensualPrestamo();
                prestamos.add(pa);
                sc.nextLine();
                System.out.println("Desea seguir agregando? Ingrese N para finalizar y presentar.");
                op= sc.nextLine();
                if(op.equals("N")){
                    opc=0;
                }
            } else if (opc == 2) {
                sc.nextLine();
                System.out.println("Ingrese el nombre del beneficiario: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apellido del beneficiario: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el username del beneficiario: ");
                String username = sc.nextLine();
                System.out.println("Ingrese la ciudad del prestamo: ");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese el tiempo de prestamo en meses: ");
                int meses = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nivel de estudio: ");
                String nivel = sc.nextLine();
                System.out.println("Ingrese el nombre de la institucion educativas: ");
                String nombreI = sc.nextLine();
                System.out.println("Ingrese las siglas de la institucion educativas: ");
                String siglasI = sc.nextLine();
                System.out.println("Ingrese el valor de la carrera: ");
                double valorC = sc.nextDouble();

                Persona persona = new Persona(nombre, apellido, username);
                PrestamoEducativo pe = new PrestamoEducativo(persona, meses, ciudad);
                pe.establecerTiempoMeses(meses);
                pe.establecerCiudadPrestamo(ciudad);
                pe.establecerNivelEstudio(nivel);
                InstitucionEducativa ie = new InstitucionEducativa(nombreI, siglasI);
                pe.establecerCentroEducativo(ie);
                pe.establecerValorCarrera(valorC);
                pe.calcularValorMensualCarrera();
                prestamos.add(pe);
                sc.nextLine();
                System.out.println("Desea seguir agregando? Ingrese N para finalizar y presentar.");
                op= sc.nextLine();
                if(op.equals("N")){
                    opc=0;
                }

            }
        } while (opc != 0);
        System.out.println("Lista Prestamos");
        for (int i = 0; i < prestamos.size(); i++) {
            // 1.  

            System.out.printf("Prestamo " + (i + 1)
                    + "\n"
                    + "%s\n",
                    prestamos.get(i));

        }

    }
}
