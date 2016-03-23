package persons;

import org.junit.Before;

import people.SimplePerson;

public class TestSimplePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.maman = new SimplePerson("Maman", "Letourneur", 1963, 12, 18);
	}
}
