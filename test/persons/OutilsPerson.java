package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class OutilsPerson {
	
	public static ArrayList<IPerson> getListeEntre(ArrayList<IPerson> p_liste, GregorianCalendar p_date, int p_ageMin, int p_ageMax) {
		
		if(p_ageMin > p_ageMax)
			throw new IllegalArgumentException();
		
		int agePerson;
		ArrayList<IPerson> r_liste = new ArrayList<IPerson>();
		for(IPerson person : p_liste) {
			agePerson = person.getAge(p_date);
			if(agePerson >= p_ageMin && agePerson <= p_ageMax)
				r_liste.add(person);
		}
		
		return r_liste;
	}
	
	public static int getPlusAge(ArrayList<IPerson> p_liste, GregorianCalendar p_date) {
		
		int agePerson;
		int ageMax = 0;
		for(IPerson person : p_liste) {
			agePerson = person.getAge(p_date);
			if(agePerson > ageMax)
				ageMax = agePerson;
		}
		
		return ageMax;
	}
}
