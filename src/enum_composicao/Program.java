//Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
//sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
//o instante do sistema: new Date()

package enum_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Entre com os dados do cliente: ");
		
		System.out.println("Nome: ");
		String name = sc.next(); 
		
		System.out.println("Email: ");
		String email = sc.nextLine(); 
		
		sc.next();
		
		System.out.println("BirthDate: (dd/MM/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client cliente = new Client (name, email, birthDate);
		
		System.out.println("---------------------------------");
		
		System.out.println("Entre com os dados do pedido: ");
		
		System.out.println("Status: ");
		OrderStatusEnum status = OrderStatusEnum.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.println("Quantos itens serão pedidos? ");
		int quant = sc.nextInt(); 		
		
		for (int i = 1; i <= quant; i++) {
			System.out.println("Informe os dados do pedido #" + i);
			
			System.out.println("Nome do produto: ");
			String prodname = sc.next();
			
			System.out.println("Preço do produto: ");
			Double prodprice = sc.nextDouble(); 
			
			System.out.println("Quantidade: ");
			Integer prodquant = sc.nextInt(); 
			
			Product product = new Product(prodname, prodprice);
			
			OrderItem item = new OrderItem(prodquant, prodprice, product);
					
			order.addItem(item);
			
		}
		
		System.out.println("--------------------------------------");
		System.out.println("ORDER SUMMARY: ");
		
		System.out.printf(
				"Order moment: " + order.getMoment() + "\n"
				+ "Order status: " + order.getStatus() + "\n"
				+ "Client: " + cliente.getName() + " " + cliente.getEmail() + " " + cliente.getBirthDate()
				+ "\n" + "Order items: " + "\n"
				+ order
				);
		
		
		sc.close();
		
		

	}

}
