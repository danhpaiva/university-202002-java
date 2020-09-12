import java.rmi.*;

public class CalculadoraClient{
  
  public static void main (String args[]) throws RemoteException
  {
    int resultado;
    
    try {
     
	  Calculadora obj = (Calculadora) Naming.lookup("//localhost/CalculadoraServer");
  	  resultado = obj.somar(10, 5);
  	  System.out.println(resultado);
      
    } catch (Exception e) {
       System.err.println("Falha de conexao : " + e.toString());
    }

  }

}
