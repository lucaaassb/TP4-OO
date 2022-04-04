package modelo;

public class PagamentoPix extends Pagamento{
	private String chavePIX;
	
	PagamentoPix(float valorServico, String pix) {
		super(valorServico);
		this.chavePIX = pix;
	}

	public PagamentoPix() {
		super();
	}


	public String getChavePIX() {
		return chavePIX;
	}
}
