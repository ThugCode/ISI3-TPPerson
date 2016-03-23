package persons;

import org.junit.Before;

import people.EfficientPerson;

public class TestEfficientPerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.maman = new EfficientPerson("Maman", "Letourneur", 52);
	}
}
