package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import dados.Cheque;
import dados.Cliente;
import dados.Conta;
import dados.ContaCorrente;
import dados.ContaPoupanca;

public class AppSantader {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int key = 0,id,rg,cpf;
		String sobrenome;
		Cliente cliente = null;
		double deposito;
		
		Date date;			
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("***** Banco *****");
		System.out.println("Registe um cliente \nId:");
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Informe sobrenome: ");
		sobrenome = scanner.nextLine();
		
		System.out.println("Informe numero RG:");
		rg = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Informe numero CPF:");
		cpf = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Informe tipo da Conta \n1: Corrente \n2: Poupança");
		
		
		while(key != 1 && key !=2) {
			
			key = scanner.nextInt();
			switch (key) {
			
			case 1:
				
				System.out.println("Informe Saldo inicial");
				double saldo = scanner.nextDouble();
				System.out.println("Informe Limite do Cheque Especial");
				double limite = scanner.nextDouble();				
				
			    cliente = new Cliente(id, sobrenome, rg, cpf, new ContaCorrente(limite, saldo));
			    
				System.out.println(cliente);
				
				break;
				
			case 2:
				
				System.out.println("Informe Taxa de juros da Poupança");
				double taxa = scanner.nextDouble();
				System.out.println("Informe Saldo inicial dá Poupança");
				double saldoPoupanca = scanner.nextDouble();
				
				cliente = new Cliente(id, sobrenome, rg, cpf, new ContaPoupanca(taxa, saldoPoupanca));
				
				System.out.println(cliente);
				
				break;

			default:
				
				System.out.println("Informe valor valído!");
				
				break;
			}
		}
		
		
		
		System.out.println("\n**** Opções da conta  ****");
		System.out.println("Sacar Dinheiro \nQual é valor do saque:");
		
		double saque = scanner.nextDouble();
		cliente.getConta().saqueDinheiro(saque);
		
		scanner.nextLine();
		
		if(key == 1)
		{
			System.out.println("\nDepositar Dinheiro cheque");
			System.out.println("Nome Banco:");
			String banco = scanner.nextLine();
			
			
			System.out.println("Valor do deposito");
			 deposito = scanner.nextDouble();
			
			System.out.println("Data pagamento");
			date = sdf.parse(scanner.next());
			
			cliente.getConta().depositarCheques(new Cheque(deposito, banco, date));
		}
		if (key == 2)
		{
			System.out.println("Informe valor do deposito");
			deposito = scanner.nextDouble();
			//scanner.nextLine();
			
			cliente.getConta().depositarDinheiro(deposito);
			
			System.out.println("Recolher juros após 30 dias [s/n]");
			char op = scanner.next().charAt(0);
			
			if(op =='s') {
				cliente.getConta().recolherjuros();								
			}
			else
			{
				System.out.println(cliente);
				
			}
		}
		else
		{
			System.out.println(cliente);
		}		
		
		scanner.close();
	}

}
