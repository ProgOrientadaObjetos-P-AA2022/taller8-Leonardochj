/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    protected String nombreProfesor;
    protected String cedula;

    public void establecerNombreDocente(String s) {
        nombreProfesor = s;
    }

    public void establecerCedulaDocente(String s) {
        cedula = s;
    }

    public String obtenerNombreDocente() {
        return nombreProfesor;
    }

    public String obtenerCedulaDocente() {
        return cedula;
    }
}
