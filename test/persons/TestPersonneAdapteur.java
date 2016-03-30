package persons;

import org.junit.Before;

public class TestPersonneAdapteur extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.maman = new PersonneAdapteur("Maman", "Letourneur", 1963, 12, 18);
	}
}
