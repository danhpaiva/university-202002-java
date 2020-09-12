import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class CalculadoraServer extends UnicastRemoteObject implements Calculadora{
  
  public CalculadoraServer() throws RemoteException
  { 
  	  super(); 
	    System.out.println("Criada uma instancia desta classe...");
  }

  public int somar(int numero1, int numero2)  throws RemoteException
  {
	  return numero1 + numero2;
  }

  public int subtrair(int numero1, int numero2)  throws RemoteException
  {
	  return numero1 - numero2;
  }

  public int multiplicar(int numero1, int numero2)  throws RemoteException
  {
	  return numero1 * numero2;
  }

  public int dividir(int numero1, int numero2)  throws RemoteException
  {
	  return numero1 / numero2;
  }

  public static void main (String args[]) throws Exception 
  {
	  CalculadoraServer objMensagem = new CalculadoraServer();
	  String nomeObjServidor = "//localhost/CalculadoraServer";
	  Naming.rebind(nomeObjServidor, objMensagem);
	  System.out.println("Servidor rodando...");
  }
}
