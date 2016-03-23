package persons;

import org.junit.Before;

import people.OneMorePerson;

public class TestOneMorePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.maman = new OneMorePerson("Maman", "Letourneur", 1963, 12, 18);
	}
}
