package Banco2021;

import Controlador.ControladorGerente;
import Modelos.Cuenta;
import Vistas.Gerente.VistaGerente;

public class ProcesoGerente extends Thread{
    private final VistaGerente vistaGerente;
    private final ControladorGerente controlgerente;
    
    public ProcesoGerente(Cuenta cuenta){
        this.vistaGerente  = new VistaGerente();
        this.controlgerente = new ControladorGerente(vistaGerente, cuenta);
    }
    
    @Override
    public void run(){
        this.controlgerente.iniciar();
    }
    
}
