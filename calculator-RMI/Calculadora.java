import java.rmi.*;

public interface Calculadora extends Remote{
    public int somar(int numero1, int numero2) throws RemoteException;
    public int subtrair(int numero1, int numero2) throws RemoteException;
    public int multiplicar(int numero1, int numero2) throws RemoteException;
    public int dividir(int numero1, int numero2) throws RemoteException;
}
