import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class OlaMundoImpl extends UnicastRemoteObject implements OlaMundo{
  
  public OlaMundoImpl() throws RemoteException
  { 
  	  super(); 
	  System.out.println("Criada uma instancia desta classe...");
  }
  public String frase()  throws RemoteException
  {
	  System.out.println("Requisicao atendida !");
	  return "Ola Mundo ! (frase classica)";
  }
  public static void main (String args[]) throws Exception 
  {
	  OlaMundoImpl objMensagem = new OlaMundoImpl();
	  String nomeObjServidor = "//localhost/OlaMundoServer";
	  Naming.rebind(nomeObjServidor, objMensagem);
	  System.out.println("Servidor rodando...");
  }
}
