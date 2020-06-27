/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teckit.Modelo;

/**
 *
 * @author Geraldine
 */
public class EntradaVip extends Entrada{
    
    public EntradaVip(double valor, int asiento, boolean utilizada, String rutCliente, String rutVendedor)
    {
        super (valor, asiento, utilizada, rutCliente, rutVendedor);
        this.regaloRetirado = false;
    }
    
private boolean regaloRetirado;

    //Geters y seters
    public boolean getRegaloRetirado() {
        return this.regaloRetirado;
    }
}

//Encapsulamiento...