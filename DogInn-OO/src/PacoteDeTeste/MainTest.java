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

    @SuppressWarnings("static-access")
    @Test
    void testSenha() {
    	assertTrue(test.senhaPetSitter(123));
    	assertFalse(test.senhaPetSitter(321));

    }
}
