package Controlador;

import Modelos.Cuenta;
import Modelos.IGerente;
import Vistas.Gerente.VistaGerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class ControladorGerente implements ActionListener {

    private final VistaGerente vista;
    private final IGerente gerente;
    private final Cuenta cuenta;
    
    public ControladorGerente(VistaGerente vista, Cuenta cuenta){
        this.vista = vista;
        this.gerente = cuenta;
        this.cuenta = cuenta;
        this.vista.getBtnActivar().addActionListener(this);
        this.vista.getBtnConsultarSaldo().addActionListener(this);
        this.vista.getBtnDepositar().addActionListener(this);
        this.vista.getBtnDesactivar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getjMenuItem1().addActionListener(this);
        this.vista.getLabelTitular().setText("Titular: "+cuenta.getTitular());
        this.vista.getLabelNumeroCuenta().setText("Nro: "+cuenta.getNumero());
        this.ActualizarEstado(this.cuenta);
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
        this.vista.setTitle("Vista Gerente");
    }
    
     public void ActualizarEstado(Cuenta cuenta){
        if(cuenta.isEstado())
            this.vista.getLabelEstadoCuenta().setText("Estado: "+"Activo");
        else{
            this.vista.getLabelEstadoCuenta().setText("Estado:"+"Inactivo");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.vista.getjMenuItem1()) {
            this.ActualizarEstado(cuenta);
            this.vista.getLabelTitular().setText("Titular: " + cuenta.getTitular());
            this.vista.getLabelNumeroCuenta().setText("Nro: " + cuenta.getNumero());
        }
        if(ae.getSource() == this.vista.getBtnActivar()){
            this.gerente.Activar();
            JOptionPane.showMessageDialog(null, "Cuenta activada exitosamente!!!", "Activación de cuenta", JOptionPane.PLAIN_MESSAGE);
        }
        if(ae.getSource() == this.vista.getBtnDesactivar()){
            this.gerente.Desactivar();
            JOptionPane.showMessageDialog(null, "Cuenta desactivada!", "Desactivación de cuenta", JOptionPane.PLAIN_MESSAGE);
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
            this.gerente.Depositar(ValDepositar);
        }
        if(ae.getSource() == this.vista.getBtnConsultarSaldo()){
            JOptionPane.showMessageDialog(null, "El saldo de la cuenta es de $"+this.gerente.ConsultarSaldo(), "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
        }
        if(ae.getSource() == this.vista.getBtnSalir()){
            this.vista.setVisible(false);
            this.vista.dispose();
        }
        this.ActualizarEstado(cuenta);
    }
    
}
