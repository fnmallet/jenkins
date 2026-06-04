package jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona persona = new Persona(4);
		
		assertEquals(persona.getEdad(), 5);
	}

}
