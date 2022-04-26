package Controlador;

import java.lang.NullPointerException;
import Modelos.Cuenta;
import Modelos.ICajero;
import Vistas.Cajero.VistaCajero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class ControladorCajero implements ActionListener {

    private final VistaCajero vista;
    private final ICajero cajero;
    private final Cuenta cuenta;

    public ControladorCajero(VistaCajero vista, Cuenta cuenta) {
        this.cuenta = cuenta;
        this.cajero = cuenta;
        this.vista = vista;
        this.vista.getBtnConsultarSaldo().addActionListener(this);
        this.vista.getBtnDepositar().addActionListener(this);
        this.vista.getBtnDesactivar().addActionListener(this);
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getjMenuItem1().addActionListener(this);
        this.vista.getLabelTitular().setText("Titular: " + cuenta.getTitular());
        this.vista.getLabelNumeroCuenta().setText("Nro: " + cuenta.getNumero());
        this.ActualizarEstado(this.cuenta);
    }

    public void iniciar() {
        this.vista.setVisible(true);
        this.vista.setTitle("Vista Cajero");
    }

    public void ActualizarEstado(Cuenta cuenta) {
        if (cuenta.isEstado()) {
            this.vista.getLabelEstadoCuenta().setText("Estado: " + "Activo");
        } else {
            this.vista.getLabelEstadoCuenta().setText("Estado:" + "Inactivo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.vista.getBtnConsultarSaldo()) {
            JOptionPane.showMessageDialog(null, "El saldo de la cuenta es de $" + this.cajero.ConsultarSaldo(), "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (ae.getSource() == this.vista.getBtnDesactivar()) {
            this.cajero.Desactivar();
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
            this.cajero.Depositar(ValDepositar);
        }
        if (ae.getSource() == this.vista.getjMenuItem1()) {
            this.ActualizarEstado(cuenta);
            this.vista.getLabelTitular().setText("Titular: " + cuenta.getTitular());
            this.vista.getLabelNumeroCuenta().setText("Nro: " + cuenta.getNumero());
        }
        if (ae.getSource() == this.vista.getBtnSalir()) {
            this.vista.setVisible(false);
            this.vista.dispose();
        }
        this.ActualizarEstado(cuenta);
    }

}
