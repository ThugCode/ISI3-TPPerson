package persons;

import org.junit.Before;

import people.SmallCodePerson;

public class TestSmallCodePerson extends TestPerson {

	@Before
	@Override
	public void setUp() {
		super.setUp();
		this.maman = new SmallCodePerson("Maman", "Letourneur", 1963, 12, 18);
	}
}
