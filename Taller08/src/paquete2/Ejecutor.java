/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingresa un numero");
        int numero = entrada.nextInt();

        if ((numero != 1) && (numero != 2)) {
            System.out.println("Error. Opción no válida");
        } else {
            if (numero == 1) {
                System.out.println("Ingrese el nombre del profesor");
                entrada.nextLine();
                String nombres = entrada.nextLine();
                System.out.println("Ingrese el numero de identificacion del docente");
                String cedula = entrada.nextLine();
                System.out.println("Ingrese el sueldo del docente");
                double sueldoDocente = entrada.nextDouble();
                System.out.println("Ingrese el costo de la hora extra");
                double costoHoraExtra = entrada.nextDouble();
                System.out.println("Ingrese el numero de horas extras");
                int nHorasExtras = entrada.nextInt();

                DocenteNombramiento docente = new DocenteNombramiento();
                docente.establecerNombreDocente(nombres);
                docente.establecerCedulaDocente(cedula);
                docente.establecerValorSueldo(sueldoDocente);
                docente.establecerValorHoraExtra(costoHoraExtra);
                docente.establecerNumeroHorasExtras(nHorasExtras);
                docente.calcularSueldoTotal();

                System.out.println("-----------------------------------------");

                System.out.printf("%s", docente);
            } else {
                if (numero == 2) {
                    System.out.println("Ingrese el nombre del profesor");
                    entrada.nextLine();
                    String nombres = entrada.nextLine();
                    System.out.println("Ingrese el numero de identificacion del docente");
                    String cedula = entrada.nextLine();
                    System.out.println("Ingrese el valor de la factura");
                    double factura = entrada.nextDouble();
                    System.out.println("Ingrese el valor del iva");
                    int iva = entrada.nextInt();
                    
                    DocenteFactura docente = new DocenteFactura();
                    docente.establecerNombreDocente(nombres);
                    docente.establecerCedulaDocente(cedula);
                    docente.establecerValorFactura(factura);
                    docente.establecerIvaDescuento(iva);
                    docente.calcularValorCancelar();

                    System.out.println("-----------------------------------------");

                    System.out.printf("%s", docente);
                }
            }
        }
        System.out.println("");
    }

}
