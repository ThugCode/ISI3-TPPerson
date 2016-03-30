package persons;

import org.junit.Before;

import people.OneMorePerson;

/**
 * Classe de test de la classe OneMorePerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestOneMorePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new OneMorePerson("Nom", "Prenom", 1963, 12, 18);
	}
}
