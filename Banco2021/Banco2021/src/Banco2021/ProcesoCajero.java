package Banco2021;

import Controlador.ControladorCajero;
import Modelos.Cuenta;
import Vistas.Cajero.VistaCajero;

public class ProcesoCajero extends Thread{
    private final VistaCajero vista;
    private final ControladorCajero control;
    
    public ProcesoCajero(Cuenta cuenta){
        this.vista = new VistaCajero();
        this.control = new ControladorCajero(this.vista, cuenta);
    }

    @Override
    public void run(){
        this.control.iniciar();
    }
    
}
