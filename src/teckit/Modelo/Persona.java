/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teckit.Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Geraldine
 */
//Clase y atributos
public class Persona {
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;

    //Constructor, deja los parámetros asignados
    public Persona(String rut, String nombre, String apelido, Date fechaNacimiento) {
        this.rut = rut;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }
//Geters y Seters
    public String getRut() {
        return this.rut;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public Date getfechaNacimiento() {
        return this.fechaNacimiento;   
    }
    
    //Calcular edad
    public int calcularEdad() {
        return Period.between(LocalDate.of(this.fechaNacimiento.getYear(),
        this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDate()), 
        LocalDate.now()).getYears();
    }

}


