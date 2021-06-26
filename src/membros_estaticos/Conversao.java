package membros_estaticos;

public class Conversao {
	
	
	public static final double IOF = 0.06; 
	
	public static double total(double dolar, double quantidade) {
		
		double reais = quantidade * dolar;
		double percent = reais * IOF;
		double valorfinal = reais + percent;
		
		return valorfinal;
		
	}

}
