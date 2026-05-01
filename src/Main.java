import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroConta;
		double saldo = 0.00;
		double deposito = 0.00;
		double saque = 0.00;
		String nomeTitular;
		char decisao;
		
		System.out.println("Seja bem-vindo ao banco JVC!");
		System.out.print("Digite o nome do titular: ");
		nomeTitular = entrada.nextLine();	
		System.out.print("Agora digite o número da conta de 5 dígitos: ");
		numeroConta = entrada.nextInt();
		if (numeroConta > 99999 || numeroConta < 10000) {
			System.out.println("Digite uma conta válida!");
			System.out.println("Exemplo: 1****");
			System.out.println("Tente novamente: ");
			numeroConta = entrada.nextInt();
			
		}
			
		System.out.println("Olá " + nomeTitular + ", seja bem-vindo a sua conta do banco JVC!");
		System.out.println();
		System.out.printf("Seu saldo atual é de: %.2f %n", saldo);
		System.out.println();
		System.out.print("Você gostaria de fazer um deposito? s/n  ");
		decisao = entrada.next().charAt(0);
		if (decisao == 's') {
			System.out.print("Informe o valor do depósito inicial:");
			deposito = entrada.nextDouble();
		}
		if(deposito < 0.00 ) { 
			System.out.println("Você não pode depositar um valor negativo, tente novamente");
			System.out.print("Informe o valor do depósito inicial:");
			deposito = entrada.nextDouble();
			saldo = saldo + deposito;
			System.out.printf("Seu saldo atual é de: %.2f %n", saldo);	
		}
		else {
			saldo = deposito;
			System.out.printf("Seu saldo atual é de: %.2f %n", saldo);	
		}
		
	  
	    System.out.print("Gostaria de fazer um saque? s/n  ");
	    decisao = entrada.next().charAt(0);
	    if (decisao == 's') {
	    System.out.print("Informe o valor do saque: ");
	    saque = entrada.nextDouble();
		   
	    if ( saque < 0) {
	    	System.out.println("Valor de saque inválido. Operação cancelada.");
	    	
			
	    }
	    else if (saque > saldo) {
			System.out.println("Saldo insuficiente!");
			}
		else   {
			saldo = saldo - saque;
	    }  
	    }
	    System.out.println();
	    System.out.println("Extrato da conta:");
	    System.out.println("Conta: " + numeroConta);
	    System.out.println("Nome: " + nomeTitular);
	    System.out.printf("Saldo final: %.2f %n ", saldo);
	    
	    
	    entrada.close(); 
	}

}
