package persons;

import org.junit.Before;

/**
 * Classe de test de la classe PersonneAdapteur
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestPersonneAdapteur extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.person = new PersonneAdapteur("Nom", "Prenom", 1963, 12, 18);
	}
}
