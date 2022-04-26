package Controlador;

import Modelos.Cuenta;
import Modelos.ICliente;
import Vistas.Cliente.VistaInicialCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class ControladorCliente implements ActionListener{
    private final VistaInicialCliente vista;
    private final ICliente cliente;
    private final Cuenta cuenta;

    public ControladorCliente(VistaInicialCliente vista, Cuenta cuenta) {
        this.vista = vista;
        this.cliente = cuenta;
        this.cuenta = cuenta;
        this.vista.getBtnCambiarClave().addActionListener(this);
        this.vista.getBtnConsultarSaldo().addActionListener(this);
        this.vista.getBtnDepositar().addActionListener(this);
        this.vista.getBtnRetirar().addActionListener(this);
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getBtnTransferir().addActionListener(this);
        this.vista.getjMenuItem1().addActionListener(this);
        this.vista.getLabelTitular().setText("Titular: "+cuenta.getTitular());
        this.vista.getLabelNumeroCuenta().setText("Nro: "+cuenta.getNumero());
        this.ActualizarEstado(cuenta);
    }
    
    public void ActualizarEstado(Cuenta cuenta){
        if(cuenta.isEstado())
            this.vista.getLabelEstadoCuenta().setText("Estado: "+"Activo");
        else{
            this.vista.getLabelEstadoCuenta().setText("Estado:"+"Inactivo");
        }
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
        this.vista.setTitle("Cliente vista inicial");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.vista.getjMenuItem1()) {
            this.ActualizarEstado(cuenta);
            this.vista.getLabelTitular().setText("Titular: " + cuenta.getTitular());
            this.vista.getLabelNumeroCuenta().setText("Nro: " + cuenta.getNumero());
        }
        if(ae.getSource() == this.vista.getBtnCambiarClave()){
            this.cliente.CambiarClave(JOptionPane.showInputDialog(null, "Ingrese la nueva clave", "Cambiar Clave", JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showMessageDialog(null, "Clave cambiada exitosamente", "Cambio de clave exitoso", JOptionPane.PLAIN_MESSAGE);
        }
        if(ae.getSource() == this.vista.getBtnConsultarSaldo()){
            JOptionPane.showMessageDialog(null, "El saldo de la cuenta es de $"+this.cliente.ConsultarSaldo(), "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (ae.getSource() == this.vista.getBtnDepositar()) {
            boolean HuboError;
            double ValDepositar = 0;
            String Monto;
            do {
                HuboError = false;
                Monto = JOptionPane.showInputDialog(vista, "Ingrese el monto a depositar:", "Depositar", JOptionPane.PLAIN_MESSAGE);
                if (Monto == null) {
                    JOptionPane.showMessageDialog(vista, "No ha ingresado ningún valor.", "¿Seguro que no quiere realizar el deposito?", JOptionPane.INFORMATION_MESSAGE);
                    Monto = "0";
                }
                try {
                    ValDepositar = Double.parseDouble(Monto);
                } catch (NumberFormatException ex) {
                    HuboError = true;
                    JOptionPane.showMessageDialog(vista, "El valor a depositar no es un valor númerico.", "Hubo un error", JOptionPane.ERROR_MESSAGE);
                }
            } while (HuboError);
            this.cliente.Depositar(ValDepositar);
        }
        if(ae.getSource() == this.vista.getBtnRetirar()){
            this.cliente.Retirar(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar: ", "Retirar", JOptionPane.QUESTION_MESSAGE)));
        }
        if(ae.getSource() == this.vista.getBtnSalir()){
            this.vista.setVisible(false);
            this.vista.dispose();
        }
        if(ae.getSource() == this.vista.getBtnTransferir()){ //Arreglar con archivos o bases de datos
            double Monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a transferir", "Monto a transferir", JOptionPane.QUESTION_MESSAGE));
            String NroCuentaDestino = JOptionPane.showInputDialog(null, "Ingrese el número de la cuenta de destino", "Cuenta Destino", JOptionPane.QUESTION_MESSAGE);
            Cuenta cuentaDestino = new Cuenta(NroCuentaDestino);
            this.cliente.Transferir(Monto,cuentaDestino);
        }
        this.ActualizarEstado(this.cuenta);
    }
    
}
