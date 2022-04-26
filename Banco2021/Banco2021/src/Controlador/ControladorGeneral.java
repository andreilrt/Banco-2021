package Controlador;

import Banco2021.ProcesoCajero;
import Banco2021.ProcesoCliente;
import Banco2021.ProcesoGerente;
import Modelos.Cuenta;
import Vistas.General.VistaGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;

public final class ControladorGeneral implements ActionListener {

    private final VistaGeneral vista;
    private final Cuenta cuenta;

    public ControladorGeneral() {
        this.vista = new VistaGeneral();
        this.cuenta = new Cuenta();
        this.iniciar();
        this.vista.getVistaCajero().addActionListener(this);
        this.vista.getVistaCliente().addActionListener(this);
        this.vista.getVistaGerente().addActionListener(this);
        this.vista.getSalir().addActionListener(this);
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
        this.vista.setTitle("Vista General");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.vista.getVistaCliente()) {
            ProcesoCliente procesocliente = new ProcesoCliente(cuenta);
            procesocliente.start();
        }
        if (ae.getSource() == this.vista.getVistaCajero()) {
            ProcesoCajero procesocajero = new ProcesoCajero(cuenta);
            procesocajero.start();
        }
        if (ae.getSource() == this.vista.getVistaGerente()) {
            ProcesoGerente procesogerente = new ProcesoGerente(cuenta);
            procesogerente.start();
        }
        if(ae.getSource() == this.vista.getSalir()){
            exit(0);
        }
    }
}
