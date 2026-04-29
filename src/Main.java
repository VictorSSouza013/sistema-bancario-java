import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroConta;
		double saldo = 0.00;
		double deposito;
		double saque;
		String nomeTitular;
		
		System.out.println("Seja bem-vindo ao banco JVC!");
		System.out.print("Digite o nome do titular: ");
		nomeTitular = entrada.nextLine();	
		System.out.print("Agora digite o número da conta: ");
		numeroConta = entrada.nextInt();
		System.out.println("Olá " + nomeTitular + ", seja bem-vindo a sua conta do banco JVC!");
		System.out.println();
		System.out.printf("Seu saldo atual é de: %.2f %n", saldo);
		System.out.println();
		System.out.println("Informe o valor do depósito inicial:");
	    System.out.print("Quanto você quer depositar na sua conta? ");
	    deposito = entrada.nextDouble();
	    saldo = saldo + deposito;
	    System.out.printf("Seu saldo atual é de: %.2f %n", saldo);
	    System.out.println("Gostaria de fazer um saque? ");
	    System.out.print("Informe o valor do saque: ");
	    saque = entrada.nextDouble();
	    saldo = saldo - saque;
	    System.out.printf("Seu saldo atual é de: %.2f %n", saldo);
	    
	    System.out.println("Extrato da conta:");
	    System.out.println("Conta: " + numeroConta);
	    System.out.println("Nome: " + nomeTitular);
	    System.out.printf("Saldo final: %.2f %n ", saldo);
	    
	    
	   entrada.close(); 
	}

}
