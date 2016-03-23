package persons;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;


public class TestPerson {
	
	IPerson maman;
	
	GregorianCalendar dateAujourdhui;
	GregorianCalendar dateAvant;
	GregorianCalendar dateNaissance;
	
	@Before
	public void setUp() {
		this.maman = new Person("Maman", "Letourneur", 1963, 12, 18);
		
		this.dateAujourdhui = new GregorianCalendar();
		this.dateAvant = new GregorianCalendar(1955, 12, 18);
		this.dateNaissance = new GregorianCalendar(1963, 12, 18);
	}
	
	@Test
	public void testAgeValide() {

		assertEquals(52,maman.getAge(this.dateAujourdhui));
		assertEquals(0,maman.getAge(this.dateNaissance));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testAgeInvalide() {
		
		assertEquals(52,maman.getAge(this.dateAvant));
	}
	
	@Test
	public void testBornValide() {
		
		assertFalse(maman.wasBorn(this.dateAvant));
		assertTrue(maman.wasBorn(this.dateAujourdhui));
		assertTrue(maman.wasBorn(this.dateNaissance));
	}
}
