package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

/**
 * Classe de test des listes de IPerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class TestOutilsPerson {

	/**
	 * Liste de IPerson servant au test
	 */
	private ArrayList<IPerson> liste;
	@Mock
    private IPerson person1, person2, person3, person4;
	
	/**
	 * Date de test
	 */
	private GregorianCalendar date;
	
	/**
	 * Initialisation des données de test et Mocks
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		liste = new ArrayList<IPerson>();
		date = new GregorianCalendar(2015, GregorianCalendar.JANUARY, 1);
		
		person1 = mock(IPerson.class);
		person2 = mock(IPerson.class);
		person3 = mock(IPerson.class);
		person4 = mock(IPerson.class);
		
        Mockito.when(person1.getAge(Mockito.any())).thenReturn(20);
        Mockito.when(person2.getAge(Mockito.any())).thenReturn(5);
        Mockito.when(person3.getAge(Mockito.any())).thenReturn(94);
        Mockito.when(person4.getAge(Mockito.any())).thenReturn(31);
        
        liste.add(person1);
        liste.add(person2);
        liste.add(person3);
        liste.add(person4);
	}

	/**
	 * Test du max et min incohérent
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testMaxMinException() {
		assertEquals(2, OutilsPerson.getListBetween(liste, date, 50, 30).size());
	}
	
	/**
	 * Test de la fonction getListBetween
	 */
	@Test
	public void testListBetween() {
		assertEquals(2, OutilsPerson.getListBetween(liste, date, 20, 40).size());
	}
	
	/**
	 * Test de la fonction getAgePlus
	 */
	@Test
	public void testAgePlus() {
		assertEquals(94, OutilsPerson.getPlusAge(liste, date));
	}
	
	/**
	 * Test anonyme sur les noms et prenoms
	 */
	@Test
	public void testAnonyme() {
		assertEquals(94, OutilsPerson.getPlusAge(liste, date));
		
        Mockito.verify(person1, never()).getName();
        Mockito.verify(person1, never()).getFirstName();
    }
}
