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

public class TestListes {

	private ArrayList<IPerson> liste;
	private GregorianCalendar date;
	
	@Mock
    private IPerson person1, person2, person3, person4;
	
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

	@Test (expected = IllegalArgumentException.class)
	public void testMaxMinException() {
		
		assertEquals(2, OutilsPerson.getListeEntre(liste, date, 50, 30).size());
	}
	
	@Test
	public void testListeEntreValide() {

		assertEquals(2, OutilsPerson.getListeEntre(liste, date, 20, 40).size());
	}
	
	@Test
	public void testPlusAgeValide() {

		assertEquals(94, OutilsPerson.getPlusAge(liste, date));
	}
	
	@Test
	public void testAnonyme() {
		
		assertEquals(94, OutilsPerson.getPlusAge(liste, date));
		
        Mockito.verify(person1, never()).getName();
        Mockito.verify(person1, never()).getFirstName();
    }
}
