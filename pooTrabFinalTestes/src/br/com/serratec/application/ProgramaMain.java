package br.com.serratec.application;

import java.util.Scanner;

import br.com.serratec.conta.ContaCorrente;
import br.com.serratec.conta.ContaPoupanca;
import br.com.serratec.entities.Cliente;
import br.com.serratec.entities.Diretor;
import br.com.serratec.entities.Gerente;
import br.com.serratec.entities.Presidente;

public class ProgramaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char continuar='s';

		
		ContaCorrente cp = new ContaCorrente("123456", "1234566247", 2000.00);
		ContaPoupanca cc = new ContaPoupanca("25156","154843");
		
		Cliente cl = new Cliente("Gabriel","123" ,"1234", "24988744102");
		Gerente ger = new Gerente("Joao", "1234", "1234", "24988121780");
		Diretor dir = new Diretor("Carlos", "12345", "1234", "24988185783");
		Presidente pres = new Presidente("Felipe", "123456", "1234", "24988621840");

		System.out.print("------------- LOGIN -------------\nDigite seu CPF: ");
		String cpf = sc.next();
		System.out.print("Digite sua senha: ");
		String senha = sc.next();
		System.out.print("---------------------------------\n");
		
		if ( cpf.equals( cl.getCpf() ) && senha.equals( cl.getSenha() ) ) {
			
			do {
			System.out.println("\n     BEM VINDO AO SISTEMA: CLIENTE!\n");
			System.out.println("------ Movimentaçoes Disponiveis ------\n1- Saque\n2- Depósito\n3- Transferencia para outra conta\n---------------------------------------");
			System.out.print("\nEscolha uma opção: ");
			int opcao = sc.nextInt();
			
			switch (opcao) {
				case 1: 
					System.out.print("Saldo atual: "+cp.getSaldo()+"\nInforme o valor para fazer o saque: ");
					double valorSaque = sc.nextDouble();
					cp.saque(valorSaque);
					System.out.println("Novo saldo: "+cp.getSaldo());
					System.out.print("Deseja fazer outra operação? Responda s/n: ");
					continuar = sc.next().charAt(0);
					System.out.print("\n\n");
					break;
				case 2:
					System.out.print("Saldo atual: "+cp.getSaldo()+"\nInforme o valor para fazer o deposito: ");
					double valorDeposito = sc.nextDouble();
					cp.deposito(valorDeposito);
					System.out.println("Novo saldo: "+cp.getSaldo());
					System.out.print("Deseja fazer outra operação? Responda s/n: ");
					continuar = sc.next().charAt(0);
					System.out.print("\n\n");
					break;
				case 3:
					System.out.print("Saldo atual: "+cp.getSaldo()+"\nInforme o valor para fazer a transferencia: ");
					double valorTransferencia = sc.nextDouble();
					break;
			}
			
		}while(continuar=='s' || continuar=='S');
		}
	
		if ( cpf.equals( ger.getCpf() ) && senha.equals( ger.getSenha() ) ) {
			System.out.println("GERENTE!");
			
		}
		
		if ( cpf.equals( dir.getCpf() ) && senha.equals( dir.getSenha() ) ) {
			System.out.println("DIRETOR!");
		}
		
		if ( cpf.equals( pres.getCpf() ) && senha.equals( pres.getSenha() ) ) {
			System.out.println("PRESIDENTE!");
		}
		
		sc.close();
	}
}