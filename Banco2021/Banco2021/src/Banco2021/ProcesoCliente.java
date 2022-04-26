package Banco2021;

import Controlador.ControladorCliente;
import Modelos.Cuenta;
import Vistas.Cliente.VistaInicialCliente;

public class ProcesoCliente extends Thread{
    private final VistaInicialCliente VistaCliente;
    private final ControladorCliente controlcliente;

    public ProcesoCliente(Cuenta cuenta) {
        this.VistaCliente = new VistaInicialCliente();
        this.controlcliente = new ControladorCliente(VistaCliente, cuenta);
    }
    
    @Override
    public void run(){
        this.controlcliente.iniciar();
    }
    
}

