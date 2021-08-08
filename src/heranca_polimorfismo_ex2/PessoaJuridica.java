package heranca_polimorfismo_ex2;

public class PessoaJuridica extends Contribuintes {
	
	private int numEmpregados;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numEmpregados) {
		super(nome, rendaAnual);
		this.numEmpregados = numEmpregados;
	}

	public int getNumEmpregados() {
		return numEmpregados;
	}

	public void setNumEmpregados(int numEmpregados) {
		this.numEmpregados = numEmpregados;
	}
	
	@Override
	public Double taxa() {
		
		double valorTaxa = 0.0;
		
		if (numEmpregados > 10) {
			valorTaxa = (getRendaAnual() * 0.14);
		}
		
		else {
			valorTaxa = (getRendaAnual() * 0.16);
		}
			
		return valorTaxa;
		
	}

}
