package persons;

import java.util.GregorianCalendar;

import people.Personne;

public class PersonneAdapteur extends Personne implements IPerson {

	public PersonneAdapteur(String name, String surname, int year, int month, int day) {
		super(name, surname, year, month, day);
	}

	public boolean wasBorn(GregorianCalendar date) {
		if(this.dateNaissance.compareTo(date) > 0)
			return false;
		else
			return true;
	}
}
