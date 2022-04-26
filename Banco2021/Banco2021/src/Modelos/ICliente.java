package Modelos;

public interface ICliente extends IUsuario{
    public void Retirar(double Monto);
    public void Transferir(double Monto, Cuenta CuentaDestino);
    public void CambiarClave(String NuevaClave);
}
