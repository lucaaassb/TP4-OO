package Model;

/**
 * Classe de Avaliação, usada para armazenar os comentários
 * e avaliações dos clientes no ArrayList
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class Avaliacao {
	String comentario;
	
	Avaliacao(String comentario){
		this.comentario = comentario;
	}

	public String getComentario() {
		return comentario;
	}
	
}