import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class OlaMundoImpl extends UnicastRemoteObject implements OlaMundo{
  
  public OlaMundoImpl() throws RemoteException
  { 
  	  super(); 
	  System.err.println("Criada uma instancia desta classe...");
  }
  public String frase()  throws RemoteException
  {
	  System.err.println("Requisicao atendida !");
	  return "Ola Mundo ! (frase classica)";
  }
  public static void main (String args[]) throws Exception 
  {
	  OlaMundoImpl objMensagem = new OlaMundoImpl();
	  String nomeObjServidor = "//localhost/OlaMundoServer";
	  Naming.rebind(nomeObjServidor, objMensagem);
	  System.err.println("Servidor rodando...");
  }
}
