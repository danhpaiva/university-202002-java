import java.rmi.*;

public class OlaMundoCli{
  
  public static void main (String args[]) throws RemoteException
  {
    String msg;
    
    try {
     
	  OlaMundo obj = (OlaMundo) Naming.lookup("//localhost/OlaMundoServer");
  	  msg = obj.frase();
  	  System.out.println(msg);
      
    } catch (Exception e) {
       System.err.println("Falha de conexao : " + e.toString());
    }

  }

}
