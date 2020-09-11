import java.rmi.*;
public interface OlaMundo extends Remote{
	public String frase() throws RemoteException;
}
