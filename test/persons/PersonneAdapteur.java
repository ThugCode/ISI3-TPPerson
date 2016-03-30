package persons;

import java.util.GregorianCalendar;

import people.Personne;

/**
 * Classe adapteur de la classe Personne
 * pour être utilisé en tant que IPerson
 * 
 * @author GERLAND - LETOURNEUR
 */
public class PersonneAdapteur extends Personne implements IPerson {

	/**
	 * Constructeur
	 * @param name
	 * @param surname
	 * @param year
	 * @param month
	 * @param day
	 */
	public PersonneAdapteur(String name, String surname, int year, int month, int day) {
		super(name, surname, year, month, day);
	}

	/**
	 * Decides whether this person was born at a given date. The person is considered to be born on her birthdate.
	 * @param date
	 * @return true if this person was born at the given date, false otherwise
	 */
	public boolean wasBorn(GregorianCalendar date) {
		if(this.dateNaissance.compareTo(date) > 0)
			return false;
		else
			return true;
	}
}
