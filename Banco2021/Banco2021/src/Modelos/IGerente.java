package Modelos;

public interface IGerente extends IUsuario{
    public void Desactivar();
    public void Activar();
    public void Modificar(double Saldo, String Numero, String Titular);//Modificar los datos de la cuenta
}
