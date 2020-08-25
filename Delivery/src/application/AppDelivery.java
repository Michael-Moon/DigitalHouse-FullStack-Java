package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import delivery.Bolo;
import delivery.Massa;
import delivery.Sanduiche;
import delivery.TiposMassa;

public class AppDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int key;
		do {
			System.out.println("*****Escolhar sua opção*****");
			System.out.println("1: Sanduiche \n2: Massas \n3: Bolos \n4: Sair ");
			
			key = scanner.nextInt();
			scanner.nextLine();
			
			switch (key) {
				case 1:
					
					menuSanduiche();
					
					break;
				case 2:
					menuMassa();
					break;
				case 3:
					menuBolo();
					break;
				case 4:
					System.out.println("Obrigado pela preferência!");
					break;
				default:
					break;
			}
			
		}while(key != 4);
		
		scanner.close();
	}
	
	private static void menuSanduiche() {
		Scanner scanner = new Scanner(System.in);
		List<String> ingredientes = new ArrayList<>();
		int key = 0;		
		do {
			
			System.out.println("Informe os ingredientes:");
			System.out.println("1: Pão \n2: Maionese \n3: Hamburguer \n4: Picles \n5: Bancom");
			System.out.println("6: queijo cheddar \n7: cream cheese \n8: frango defumado \n9: Cebola  \n10: Tomate ");
			System.out.println("11: Finalizar");
				
			
			key = scanner.nextInt();
			

			switch (key) {			
			
				case 1:					
					ingredientes.add("Pão");
					break;
				case 2:
					ingredientes.add("Maionese");
					break;
				case 3:
					ingredientes.add("Hamburguer");
					break;
				case 4:
					ingredientes.add("Picles");
					break;
				case 5:
					ingredientes.add("Bancom");
					break;
				case 6:
					ingredientes.add("queijo cheddar");
					break;
				case 7:
					ingredientes.add("cream cheese");
					break;
				case 8:
					ingredientes.add("frango defumado");
					break;
				case 9:
					ingredientes.add("Cebola");
					break;
				case 10:
					ingredientes.add("Tomate");
					break;
				case 11:
					System.out.println("Pedido Finalizado");
					break;
	
				default:
					System.out.println("Informe valor válido");
					break;
			}
			
		}while(key != 11 && ingredientes.size() < 10);
		

		Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
		
		System.out.println("Quantos Km de distância da sua casa até lanchonete");
		double distancia = scanner.nextDouble();
		for (String string : ingredientes) {
			System.out.println("Ingredietes Selecionados: "+ingredientes);
			break;
		}
		System.out.println("Sanduiche "+"Preço: " + sanduiche.getPreco() + " Tempo de Entregar: " + sanduiche.tempoPreparo(distancia) + " minutos");
		
	}
	
	private static void menuMassa() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String molho = null;
		int key;
		
		while(molho == null) {
			System.out.println("Escola Molho e Tipo da Massa:");
			System.out.println("Informe molho: \n1: Molho Tomate \n2: Molho Branco");
			key = scanner.nextInt();
			switch (key) {
			case 1:
				
				molho = "Tomate";
				break;
			case 2:
				
				molho = "Branco";
				break;

			default:
				System.out.println("Infome valor válido");				
				break;
			}
		}
		scanner.nextLine();
		
		TiposMassa tipo = null;
		
		do {
			
			System.out.println("Informte tipo massa:");
			System.out.println("1: Macarrão \n2: Pizza \n3: Lasanha");
			key = scanner.nextInt();
			
			
			switch (key) {
			case 1:
				
				tipo = TiposMassa.MACARRAO;
				break;
			case 2:
				tipo = TiposMassa.PIZZA;
				break;
			case 3:
				tipo = TiposMassa.LASANHA;
				break;
			default:
				System.out.println("Informte valor válido:");				
				break;
			}
		}while(key != 1 && key != 2 && key != 3);
		
		Massa massa = new Massa(25.0, molho, tipo);
		
	
		System.out.println("Quantos Km de distância da sua casa até lanchonete");
		double distancia = scanner.nextDouble();
		System.out.println("Nome: " + massa.getTipo() + " Molho: " + massa.getMolho()
		+"\nPreço: " + massa.getPreco() + " Tempo de Entregar: " + massa.tempoPreparo(distancia) + " minutos");
		
	}
	
	private static void menuBolo() {
		Scanner scanner = new Scanner(System.in);
		int key;
		System.out.println("Monte seu Bolo");
		
		String massa = null;
		String recheio = null;
		String cobertura = null;
		
		while(massa == null) {
			
			System.out.println("Informe massa do bolo:");
			System.out.println("1: Chocolate \n2: Fubá \n3: Baunilha");
			key = scanner.nextInt();
			switch (key) {
			case 1:				
				massa = "Chocolate";
				break;
			case 2:
				massa = "Fubá";
				break;
			case 3:
				massa = "Banilha";
				break;
			default:
				System.out.println("Informte valor válido:");				
				break;
			}
		}
		scanner.nextLine();
		
		
	while(recheio == null) {
			
			System.out.println("Informe recheio do bolo:");
			System.out.println("1: Chocolate \n2: Prestigio \n3: Sem Recheio");
			key = scanner.nextInt();
			switch (key) {
			case 1:				
				recheio = "Chocolate";
				break;
			case 2:
				recheio = "Prestigio";
				break;
			case 3:
				recheio = "Sem Recheio";
				break;
			default:
				System.out.println("Informte valor válido:");				
				break;
			}
		}
		scanner.nextLine();
				
		while(cobertura == null) {
			
			System.out.println("Informe cobertura do bolo:");
			System.out.println("1: Chocolate \n2: Prestigio \n3: Sem cobertura");
			key = scanner.nextInt();
			switch (key) {
			case 1:				
				cobertura = "Chocolate";
				break;
			case 2:
				cobertura = "Prestigio";
				break;
			case 3:
				cobertura = "Sem coberturao";
				break;
			default:
				System.out.println("Informte valor válido:");				
				break;
			}
		}
		scanner.nextLine();	
				
		Bolo bolo = new Bolo(57.99,massa ,recheio, cobertura);
	
		System.out.println("Quantos Km de distância da sua casa até lanchonete");
		double distancia = scanner.nextDouble();
		System.out.println("Bolo de "+ bolo.getMassa()+ ", Recheio: " + bolo.getRecheio() + " Cobertura: " + bolo.getCobertura()
		+"\nPreço: " + bolo.getPreco() + " Tempo de Entregar: " + bolo.tempoPreparo(distancia) + " minutos");
		
	}

}
