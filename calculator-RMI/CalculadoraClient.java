import java.rmi.*;
import java.util.Scanner;

public class CalculadoraClient{
  
  public static void main (String args[]) throws RemoteException
  {
    int operacao, resultado;

    try {
      Scanner scan = new Scanner(System.in);
      Calculadora obj = (Calculadora) Naming.lookup("//localhost/CalculadoraServer");

      System.out.println("Qual operação deseja realizar: [1]Soma [2]Subtração [3]Multiplicação [4]Divisão");
      operacao = Integer.valueOf(scan.nextLine());

      System.out.println("Informe o primeiro valor: ");
      int valor1 = Integer.valueOf(scan.nextLine());
      
      System.out.println("Informe o segundo valor: ");
      int valor2 = Integer.valueOf(scan.nextLine());
      
      switch (operacao) {
        case 1:
          resultado = obj.somar(valor1, valor2);
          System.out.println("\nResultado: " + resultado);
          break;
        case 2:
          resultado = obj.subtrair(valor1, valor2);
          System.out.println("\nResultado: " + resultado);
          break;
        case 3:
          resultado = obj.multiplicar(valor1, valor2);
          System.out.println("\nResultado: " + resultado);
          break;
        case 4:
          resultado = obj.dividir(valor1, valor2);
          System.out.println("\nResultado: " + resultado);
          break;
        default:
          System.out.println("\nOperação inválida!");
          break;
      } 
    } catch (Exception e) {
       System.err.println("Falha de conexao : " + e.toString());
    }

  }

}
