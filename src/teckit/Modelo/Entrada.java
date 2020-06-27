package teckit.Modelo;
/**
 *
 * @author Geraldine
 */
    public class Entrada {
        protected double valor;
        protected int asiento;
        protected String rutCliente;
        protected String rutVendedor;
        protected boolean utilizada;  
        
        public Entrada (double valor, int asiento, boolean utilizada, String rutCliente, String rutVendedor) {
            super ();
            this.valor = valor;
            this.asiento = asiento;
            this.utilizada = utilizada;
            this.rutCliente = rutCliente;
            this.rutVendedor = rutVendedor;
        //Encapsulamiento...
        }
     // Geters y seters
        public double getValor() {
        return this.valor;
        }
        public int getAsiento() {
        return this.asiento;
        }
        public boolean getUtilizada() {
        return this.utilizada;
        }
        public String getRutCliente() {
        return this.rutCliente;
        }
        public String getRutVendedor() {
        return this.rutVendedor;
        }
    }
