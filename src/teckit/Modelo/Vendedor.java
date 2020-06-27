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
public class Vendedor extends Persona {


    public int entradasNormalesVendidas;
    public int entradasVipVendidas;
    
    public Vendedor(String rut, String nombre, String apellido, Date fechaNacimiento) {
        super (rut, nombre, apellido, fechaNacimiento);
        this.entradasNormalesVendidas =0;
        this.entradasVipVendidas = 0 ;     
    }
    //Encapsulamiento de enradas vendidas
    static void verVendedores(ArrayList<Vendedor> vendedores) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int count = 1;
        for(Vendedor v:vendedores){
            System.out.printf("%d - %s\n", count, v.nombre);
            count ++;
        }
    }
    
    static Vendedor CrearVendedor() throws ParseException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Ingrese rut de vendedor: \n");
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String rut = st.nextLine();
        System.out.print("Ingrese nombre de vendedor: \n");
        String nombre = st.nextLine();
        System.out.print("Ingrese apellido de vendedor: \n");
        String apellido = st.nextLine();
        System.out.print("Ingrese fecha nacimiento de vendedor (DD/MM/AAAA): \n");
        String nac = st.nextLine();
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(nac); 
        Vendedor v = new Vendedor(rut, nombre, apellido, date1);
        System.out.printf("Creando Vendedor %s  \n \n \n", nombre);
        return v;
    }
    
   //Geters y seters permiten trabajar correctamente el encapsulamiento. Son necesarios para hacer implementar correctamente la orientación a objetos. COn get pido al encapsulamiento la información 
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
}
