package Excepciones;

public class SaldoInsuficienteExcepcion extends Exception {

    public SaldoInsuficienteExcepcion() {
        super("Saldo Insuficiente para realizar la acción.");
    }
    
}
