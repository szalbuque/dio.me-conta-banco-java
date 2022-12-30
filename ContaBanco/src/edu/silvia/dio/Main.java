/** Projeto criado durante curso de Java Dio.me
 * @author Silvia Zveiter Rocha
 */
package edu.silvia.dio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Informe o numero da Conta: ");
		numeroConta = scanner.nextInt();
		System.out.println("Informe o codigo da agencia:");
		agencia = scanner.next();
		System.out.println("Informe o nome do cliente:");
		nomeCliente = scanner.next();
		System.out.println("Informe o saldo inicial:");
		saldo = scanner.nextDouble();
		scanner.close();

		ContaTerminal contaTerminal = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",contaTerminal.getNomeCliente(),contaTerminal.getAgencia(),contaTerminal.getNumeroConta(),contaTerminal.getSaldo());
	}

}
