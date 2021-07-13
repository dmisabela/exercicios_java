package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);	
		
			
		System.out.println("Quantos funcion�rios ser�o registrados? ");
		Integer quant = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		int i = 1;
		
		while (i <= quant) {
			
			System.out.println("Funcion�rio " + i);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(verificarId(list, id)) {
				//enquanto o ID j� existir na lista 
				System.out.println("Este ID j� existe. Informe outro:");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Sal�rio: ");
			Double salario = sc.nextDouble();			
			
			list.add(new Employee(id, nome, salario));
			
			i++;
			
		}
	
		
		System.out.println("Qual funcion�rio ter� aumento? ");
		int idAumento = sc.nextInt();
		
		Employee employee = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("Este id n�o existe.");
		}
		
		else {
		
		System.out.println("Qual a porcentagem de aumento? ");
		Double porcentagem = sc.nextDouble();		
		
		employee.aumentarSalario(porcentagem);
		
		}
		
		
		for (Employee x : list) {
			System.out.println(x);
			System.out.println("--------------------------------------");
		}	
		
		sc.close();

	}
	
	public static boolean verificarId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		//para verificar se o Id j� est� ocupado por outro funcion�rio 
	}

}
