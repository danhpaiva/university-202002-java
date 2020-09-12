import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class CalculadoraServer extends UnicastRemoteObject implements Calculadora{
  
  public CalculadoraServer() throws RemoteException
  { 
  	  super(); 
	  System.err.println("Criada uma instancia desta classe...");
  }
  public String somar(float numero1, float numero2)  throws RemoteException
  {
	  System.err.println("Requisicao atendida !");
	  return numero1 + numero2;
  }
  public static void main (String args[]) throws Exception 
  {
	  CalculadoraServer objMensagem = new CalculadoraServer();
	  String nomeObjServidor = "//localhost/CalculadoraServer";
	  Naming.rebind(nomeObjServidor, objMensagem);
	  System.err.println("Servidor rodando...");
  }
}
