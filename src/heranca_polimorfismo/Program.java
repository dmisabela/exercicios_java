package heranca_polimorfismo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Dados do produto #" + i);
			
			System.out.println("Comum, usado ou importado? (C/U/I): ");
			char ch = sc.next().charAt(0); 			
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Preço: ");
			Double price = sc.nextDouble();			
			
			if (ch == 'C') {	   
	        	
	        	Product p = new Product(name, price);
				list.add(p);					
			}
	            
			else if (ch  == 'U') {
	        	
	        	System.out.println("Data de fabricação: ");
	        	String dt = sc.next();	        	
	        	DateFormat sdf = new SimpleDateFormat("dd/MM/yy"); 
	        	Date date =  sdf.parse(dt);	 
	        	
	        	Product p = new UsedProduct(name, price, date);
				list.add(p);		
	        	
			}
	            
			else if (ch == 'I') {
	        	
	        	System.out.println("Taxa alfandegária: ");
	        	Double customsFee = sc.nextDouble();	
	        	
	        	Product p = new ImportedProduct(name, price, customsFee);
	        	list.add(p);	        	
			}

			else {
	            System.out.println("O tipo de produto selecionado não é uma opção válida. ");
			}
			
		}
		
		System.out.println("Etiquetas: ");
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
		
	}

}
