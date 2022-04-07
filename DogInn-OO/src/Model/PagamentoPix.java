package Model;

/**
 * Classe de Pagamento Via PIX, contendo os metodos desta classe e servindo para
 * armazenar os dados das chaves no ArrayList
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

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

	public void setChavePIX(String chavePIX) {
		this.chavePIX = chavePIX;
	}
}
