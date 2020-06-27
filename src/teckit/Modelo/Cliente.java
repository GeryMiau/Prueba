/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teckit.Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Geraldine
 */
public class Cliente extends Persona {

    public Cliente(String rut, String nombre, String apellido, Date fechaNacimiento) {
        super (rut, nombre, apellido, fechaNacimiento);
    }

    static void verClientes(ArrayList<Cliente> clientes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int count = 1;
        for(Cliente c:clientes){
            System.out.printf("%d - %s\n", count, c.nombre);
            count ++;
        }
    }
    
    static Cliente CrearCliente() throws ParseException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Ingrese rut de cliente: \n");
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String rut = st.nextLine();
        System.out.print("Ingrese nombre de cliente: \n");
        String nombre = st.nextLine();
        System.out.print("Ingrese apellido de cliente: \n");
        String apellido = st.nextLine();
        System.out.print("Ingrese fecha nacimiento de cliente (DD/MM/AAAA): \n");
        String nac = st.nextLine();
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(nac); 
        Cliente v = new Cliente(rut, nombre, apellido, date1);
        System.out.printf("Creando Cliente %s  \n \n \n", nombre);
        return v;
    }
    
    public String getNombre() {
        // TO DO: crear metodo getNombre
        return this.nombre;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido() {
        return this.apellido;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getRut() {
        return this.rut;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
