import java.rmi.*;

public class CalculadoraClient{
  
  public static void main (String args[]) throws RemoteException
  {
    String msg;
    
    try {
     
	  CalculadoraClient obj = (CalculadoraClient) Naming.lookup("//localhost/CalculadoraServer");
  	  msg = obj.somar(5, 10);
  	  System.err.println(msg);
      
    } catch (Exception e) {
       System.err.println("Falha de conexao : " + e.toString());
    }

  }

}
