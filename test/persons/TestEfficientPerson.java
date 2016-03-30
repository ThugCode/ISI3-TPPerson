package persons;

import org.junit.Before;

import people.EfficientPerson;

/**
 * Classe de test de la classe EfficientPerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestEfficientPerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new EfficientPerson("Nom", "Prenom", 52);
	}
}
