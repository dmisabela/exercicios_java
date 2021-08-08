package heranca_polimorfismo_ex2;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	
	@Override
	public Double taxa() {
		
		double valorTaxa = 0.0;
		
		if (rendaAnual < 20000.00) {
			valorTaxa = (getRendaAnual() * 0.15) - (gastosSaude * 0.50);
		}
		
		else {
			valorTaxa = (getRendaAnual() * 0.25) - (gastosSaude * 0.50);
		}
			
		return valorTaxa;
		
	}
	
	
	
	
	
	
	
}
