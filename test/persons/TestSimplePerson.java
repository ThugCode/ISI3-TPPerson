package persons;

import org.junit.Before;

import people.SimplePerson;

/**
 * Classe de test de la classe SimplePerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestSimplePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new SimplePerson("Nom", "Prenom", 1963, 12, 18);
	}
}
