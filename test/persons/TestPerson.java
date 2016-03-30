package persons;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de test des classes qui implémentent IPerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestPerson {
	
	/**
	 * IPerson servant au test
	 */
	IPerson person;
	
	/**
	 * Dates de test pour les méthodes wasBorn() et getAge()
	 */
	GregorianCalendar dateToday;
	GregorianCalendar dateBefore;
	GregorianCalendar dateBirth;
	
	/**
	 * Initialisation des données de test
	 */
	@Before
	public void setUp() {
		this.person = new Person("Nom", "Prenom", 1963, 12, 18);
		
		this.dateToday = new GregorianCalendar();
		this.dateBefore = new GregorianCalendar(1955, GregorianCalendar.DECEMBER, 18);
		this.dateBirth = new GregorianCalendar(1963, GregorianCalendar.DECEMBER, 18);
	}
	
	/**
	 * Test de l'age en fonction d'aujourd'hui
	 */
	@Test
	public void testAgeToday() {
		assertEquals(52,person.getAge(this.dateToday));
	}
	
	/**
	 * Test de l'age en fonction de la naissance
	 */
	@Test
	public void testAgeBirth() {
		assertEquals(0,person.getAge(this.dateBirth));
	}
	
	/**
	 * Test de l'age en fonction d'une date anterieure à la naissance
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testAgeException() {
		assertEquals(52,person.getAge(this.dateBefore));
	}
	
	/**
	 * Test de wasBorn() en fonction d'une date avant la naissance
	 */
	@Test
	public void testBornBefore() {
		assertFalse(person.wasBorn(this.dateBefore));
	}
	
	/**
	 * Test de wasBorn() en fonction d'aujourd'hui
	 */
	@Test
	public void testBornToday() {
		assertTrue(person.wasBorn(this.dateToday));
	}
	
	/**
	 * Test de wasBorn() en fonction de la date de la naissance
	 */
	@Test
	public void testBornBirth() {
		assertTrue(person.wasBorn(this.dateBirth));
	}
}
