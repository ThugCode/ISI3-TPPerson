package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Classe de recherche dans les listes de IPerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class OutilsPerson {
	
	/**
	 * Trouver le sous ensemble de IPerson qui ont un age borné 
	 * à une date donnée dans un ensemble de IPerson
	 * 
	 * @param p_liste
	 * @param p_date
	 * @param p_ageMin
	 * @param p_ageMax
	 * @return r_liste ArrayList<IPerson> Liste de IPerson
	 */
	public static ArrayList<IPerson> getListBetween(ArrayList<IPerson> p_liste, GregorianCalendar p_date, int p_ageMin, int p_ageMax) {
		
		//Déclenche une exception si les bornes sont incohérentes
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
	
	/**
	 * Trouver l'age le plus élevé à une date donnée dans une liste de IPerson
	 * 
	 * @param p_liste
	 * @param p_date
	 * @return ageMax int Age maximum
	 */
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
