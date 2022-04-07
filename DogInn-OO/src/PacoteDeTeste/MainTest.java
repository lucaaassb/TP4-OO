package PacoteDeTeste;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Controller.DogInn;
import ControleDados;
import ControlePet;

/**
 * Classe de teste JUnit
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public class MainTest {
    DogInn test = new DogInn();

/**
 * Criado para validar a senha de um usuário.
 *
 */
    @SuppressWarnings("static-access")
    @Test
    void testSenha() {
    	assertTrue(test.senhaPetSitter());
    	assertEquals(true, test.senhaPetSitter());

    }

/**
 * Create a valid account.
 *
 */
    @SuppressWarnings("static-access")
    @Test
    void testNomeCliente_vazio() {
    	assertTrue(test.nomeCliente());
    	assertEquals(true, test.nomeCliente());

    }

/**
 * Criado para validar o valor dos serviços prestados.
 *
 */
    @SuppressWarnings("static-access")
    @Test
    void testPagamento() {
    	assertTrue(test.valorServico());
    	assertEquals(true, test.valorServico());

    }
}
