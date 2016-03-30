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
		this.dateAvant = new GregorianCalendar(1955, GregorianCalendar.DECEMBER, 18);
		this.dateNaissance = new GregorianCalendar(1963, GregorianCalendar.DECEMBER, 18);
	}
	
	@Test
	public void testAgeValideAujourdhui() {
		assertEquals(52,maman.getAge(this.dateAujourdhui));
	}
	
	@Test
	public void testAgeValideNaissance() {
		assertEquals(0,maman.getAge(this.dateNaissance));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testAgeInvalide() {
		assertEquals(52,maman.getAge(this.dateAvant));
	}
	
	@Test
	public void testBornValideAvant() {
		assertFalse(maman.wasBorn(this.dateAvant));
	}
	
	@Test
	public void testBornValideApres() {
		assertTrue(maman.wasBorn(this.dateAujourdhui));
	}
	
	@Test
	public void testBornValideMemeJour() {
		assertTrue(maman.wasBorn(this.dateNaissance));
	}
}
