/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teckit.Modelo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) throws ParseException {
        boolean open = true;
        ArrayList <Evento> eventos = new ArrayList<>();
        ArrayList <Vendedor> vendedores = new ArrayList<>();
        ArrayList <Cliente> clientes = new ArrayList<>();
        while(open) {
            System.out.print("Bienvenido: Escoja una opción digitando el número:\n");
            System.out.print("1 : Crear Evento\n");
            System.out.print("2 : Crear Vendedor\n");
            System.out.print("3 : Crear Cliente\n");
            System.out.print("4 : Usar Entrada (no implementado por tiempo)\n");
            System.out.print("5 : Vender Entrada a cliente\n");
            System.out.print("6 : Cambio estado Evento\n");
            System.out.print("0 : Salir\n");
            Scanner in = new Scanner(System.in);
            String value = in.nextLine();
            
            switch (value){
                
                case "0":
                    open = false;
                    break;
                case "1":
                    Evento nuevaEntrada = Evento.CrearEvento();
                    eventos.add(nuevaEntrada);
                    break;
                    
                case "2":
                    Vendedor nuevoVendedor = Vendedor.CrearVendedor();
                    vendedores.add(nuevoVendedor);
                    break;
                    
                case "3":
                    Cliente nuevoCliente = Cliente.CrearCliente();
                    clientes.add(nuevoCliente);
                    break;
                    
                case "5":
                    if(vendedores.size()==0) {
                        System.out.println("Debe crear al menos un vendedor para vender una entrada a algún cliente\n");
                    } else if (clientes.size()==0) {
                        System.out.println("Debe crear al menos un cliente para vender una entrada.\n");
                    } else if(eventos.size()==0) {
                        System.out.println("Debe crear al menos un evento para vender una entrada.\n");
                    } else {
                        Evento.venderEntrada(eventos, vendedores, clientes);
                    }
                    break;
                case "6":
                    Evento.cambioEstadoEvento(eventos);
                    break;
                default:
                    System.out.print("Datos incorrectos\n");
                    break;
            } 
                        
        }
        
    }
    
}
