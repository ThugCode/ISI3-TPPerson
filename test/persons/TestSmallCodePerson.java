package persons;

import org.junit.Before;

import people.SmallCodePerson;

/**
 * Classe de test de la classe SmallCodePerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestSmallCodePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new SmallCodePerson("Nom", "Prenom", 1963, 12, 18);
	}
}
