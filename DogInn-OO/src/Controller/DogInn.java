package Controller;

import Model.*;
import View.*;

/**
 * Verificar os dados salvos,armazena,compara e procura nas classes
 * graficas
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 *
 */

public class DogInn {
	public static void main(String[] args) {

		PetSitter babaPet = new PetSitter("Lucas", "Soares", "teste@gmail.com", "Qnp 18", "123", "(61) 91111-1111");
		Main.getPetSitters().add(babaPet);

	}

	/**
	 * Armazena os dados das Babas
	 */
	private final static ArrayList<PetSitter> PetSitters = new ArrayList<PetSitter>();


	/**
	 * serve para retorna as Babas
	 *
	 * @return uma função para retorna as Babas
	 */
	public static ArrayList<PetSitter> getPetSitters() {
		return PetSitters;
	}

	/**
	 * Pega todos as Babas
	 *
	 * @return retorna todos as Babas pegados da função getPetSitters()
	 */
	public static Object[] todasAsBabas() {
		ArrayList<String> modelo = new ArrayList<String>();
		for (PetSitter atual : Main.getPetSitters()) {
			modelo.add(atual.getNome());
		}
		return modelo.toArray();
	}
}