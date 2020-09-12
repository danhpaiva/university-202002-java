import java.rmi.*;

public interface Calculadora extends Remote{
    public String somar() throws RemoteException;
    public String subtrair() throws RemoteException;
    public String multiplicar() throws RemoteException;
    public String dividir() throws RemoteException;
}
