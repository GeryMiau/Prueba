/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teckit.Modelo;

import java.util.ArrayList;
import java.util.Scanner;
import teckit.Modelo.Cliente;
import teckit.Modelo.Entrada;
import teckit.Modelo.EntradaVip;
import teckit.Modelo.Vendedor;

/**
 *
 * @author Geraldine
 */
public class Evento {

    int edad;
    int cupos;
    String nombreEvento;
    Boolean estadoEvento;
 //Tipo de dato <Variable> nombre variable 
    ArrayList<Entrada> entradas;
    
 //Cosntructor
    public Evento (int edad, String nombreEvento, Boolean estadoEvento, ArrayList<Entrada> entradas, int cupos ) {
    this.edad = edad;
    this.nombreEvento = nombreEvento;
    this.estadoEvento = estadoEvento;
    this.entradas = entradas;
    this.cupos = cupos;
    }
    
    static void cambioEstadoEvento(ArrayList<Evento> eventos) {
        Scanner in = new Scanner(System.in); //int scanner
        System.out.print("Seleccione evento: \n");
        Evento.verEventos(eventos);
        int indexEvento = in.nextInt();
        Evento seleccionadoE = eventos.get(indexEvento - 1);
        seleccionadoE.estadoEvento = !seleccionadoE.estadoEvento;
        System.out.printf("El evento %s ha cambiado de estado a %b \n", seleccionadoE.nombreEvento, seleccionadoE.estadoEvento);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static void verEventos(ArrayList<Evento> eventos) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int count = 1;
        for(Evento e:eventos){
            System.out.printf("%d - %s\n", count, e.nombreEvento);
            count ++;
        }
    }
    
    public static Evento CrearEvento() {
        System.out.print("Ingrese edad de evento: \n");
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        int edad = in.nextInt();
        boolean estadoEvento = true;
        System.out.print("Ingrese cupos de evento: \n");
        int cupos = in.nextInt();
        System.out.print("Ingrese nombre de evento: \n");
        String nombreEvento = st.nextLine();
        ArrayList<Entrada> entradas = new ArrayList<>();
        Evento ev = new Evento(edad, nombreEvento, estadoEvento, entradas, cupos);
        System.out.printf("Creando evento %s (Edad minima: %d) \n \n \n", nombreEvento, edad);
        return ev;
    }
    
    public static void venderEntrada(ArrayList <Evento> eventos, ArrayList <Vendedor> vendedores, ArrayList <Cliente> clientes){        
        
        Scanner in = new Scanner(System.in); //int scanner
        Scanner dou = new Scanner(System.in); //double scanner
        Scanner st = new Scanner(System.in); //string scanner
        
        System.out.print("Seleccione vendedor: \n");
        Vendedor.verVendedores(vendedores);
        int indexVendedor = in.nextInt();
        
        System.out.print("Seleccione cliente: \n");
        Cliente.verClientes(clientes);
        int indexCliente = in.nextInt();
        
        System.out.print("Seleccione evento: \n");
        Evento.verEventos(eventos);
        int indexEvento = in.nextInt();
        Evento seleccionadoE = eventos.get(indexEvento - 1);
        if(seleccionadoE.getCupos() <= 0) {
            System.out.print("Evento no tiene cupos \n");
            return;
        }
        
        System.out.print("Ingrese tipo de entrada: \n1) normal \n2) vip\n");
        int entradaTipo = in.nextInt();
        System.out.print("Ingrese valor: \n");
        double valor = dou.nextDouble();
        System.out.print("Ingrese asiento: \n");
        int asiento = in.nextInt();
        Cliente seleccionado = clientes.get(indexCliente - 1);
        Vendedor seleccionadoV = vendedores.get(indexVendedor - 1);
        
        if(entradaTipo == 1){
            Entrada nuevaEntrada = new Entrada(valor, asiento, true, seleccionado.getRut(), seleccionadoV.getRut());
            seleccionadoE.entradas.add(nuevaEntrada);
            seleccionadoV.entradasNormalesVendidas = seleccionadoV.entradasNormalesVendidas + 1;
            
        } else if(entradaTipo == 2) {
            Entrada nuevaEntradaVip = new EntradaVip(valor, asiento, true, seleccionado.getRut(), seleccionadoV.getRut());
            seleccionadoE.entradas.add(nuevaEntradaVip);
            seleccionadoV.entradasVipVendidas = seleccionadoV.entradasVipVendidas + 1;
        }
        seleccionadoE.cupos = seleccionadoE.cupos - 1;
        System.out.printf("Vendiendo Entrada a cliente %s para evento %s\n", seleccionado.nombre, seleccionadoE.nombreEvento);
        System.out.printf("El vendedor %s ha vendido:\n%s Entradas normales\n%s Entradas vip\n", seleccionadoV.nombre, seleccionadoV.entradasNormalesVendidas, seleccionadoV.entradasVipVendidas);
        
    }
    //TO DO: se deben implementar estas funciones
    private ArrayList<Entrada> getEntradas() {
        return this.entradas;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getEdadMinima() {
        return this.edad;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int getCupos() {
        return this.cupos;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
