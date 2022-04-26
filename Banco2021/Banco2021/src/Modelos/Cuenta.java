package Modelos;

import Excepciones.SaldoInsuficienteExcepcion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cuenta implements IUsuario, ICliente, IGerente, ICajero{
    private double Saldo;
    private String Numero;
    private String Clave;
    private String Titular;
    private boolean Estado;

    public Cuenta(){
        this.Saldo = 10000;
        this.Numero = String.valueOf((int)Math.floor(Math.random()*(99999-10000+1)+(10000)))+String.valueOf((int)Math.floor(Math.random()*(99999-10000+1)+(10000)));
        this.Clave = String.valueOf((int)Math.floor(Math.random()*(99999-10000+1)+(10000)));
        this.Titular = "Isabella";
        this.Estado = false;
    }
    
    public Cuenta(String Numero) {
        this.Numero = Numero;
    }
    
    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    @Override
    public double ConsultarSaldo() {
        return this.getSaldo();
    }

    @Override
    public void Depositar(double Monto) {
        this.setSaldo(this.getSaldo()+Monto);
    }

    @Override
    public void Retirar(double Monto) {
        if((this.getSaldo()-Monto)<0){
            try {
                throw new SaldoInsuficienteExcepcion();
            } catch (SaldoInsuficienteExcepcion ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hubo un problema", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            this.setSaldo(this.getSaldo()-Monto);
        }
    }

    @Override
    public void Transferir(double Monto, Cuenta CuentaDestino) {
        this.setSaldo(this.getSaldo()-Monto);
        CuentaDestino.setSaldo(CuentaDestino.getSaldo()+Monto);
    }

    @Override
    public void CambiarClave(String NuevaClave) {
        this.setClave(NuevaClave);
    }

    @Override
    public void Desactivar() {
        this.setEstado(false);
    }

    @Override
    public void Activar() {
        this.setEstado(true);
    }

    @Override
    public void Modificar(double Saldo, String Numero, String Titular) {
        this.setSaldo(Saldo);
        this.setNumero(Numero);
        this.setTitular(Titular);
    }
}
