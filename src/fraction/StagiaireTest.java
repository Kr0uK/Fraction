package fraction;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class StagiaireTest {
	
	private final SimpleDateFormat DATENAISSANCE = new SimpleDateFormat("dd/MM/yyyy", Locale.FRENCH);
	Stagiaire stagiaire = null;

	@Test
	public void testAjouterNote() {
		
		
		try {
			stagiaire = new Stagiaire("Jonathan", "MATHIEU", DATENAISSANCE.parse("30/07/1989"));
			
			stagiaire.ajouterNote(new Note(20));
			stagiaire.ajouterNote(new Note(0));
			
			assertTrue(stagiaire.getNotes().get(0).getNumerateur() == 20 && stagiaire.getNotes().get(1).getNumerateur() == 0);
			
		} catch (ParseException e1) {
			e1.printStackTrace();
			fail("Exception");
		}catch(NoteNegativeExeption e){
			e.printStackTrace();
			fail("Exception");
		}	
		
	}

	@Test
	public void testModifierNote() {
		
		try {
			stagiaire = new Stagiaire("Jonathan", "MATHIEU", DATENAISSANCE.parse("30/07/1989"));
			Note n1 = new Note(20);
			Note n2 = new Note(0);
			stagiaire.ajouterNote(n1);
			stagiaire.ajouterNote(n2);
			
			stagiaire.modifierNote(n1, n2);
			
			assertTrue(stagiaire.getNotes().get(0).getNumerateur() == 0);
			
		} catch (ParseException e1) {
			e1.printStackTrace();
			fail("Exception");
		}catch(NoteNegativeExeption e){
			e.printStackTrace();
			fail("Exception");
		}
		
	}

	@Test
	public void testMoyenne() {
		
		try {
			stagiaire = new Stagiaire("Jonathan", "MATHIEU", DATENAISSANCE.parse("30/07/1989"));
			Note n1 = new Note(20);
			Note n2 = new Note(0);
			stagiaire.ajouterNote(n1);
			stagiaire.ajouterNote(n2);
			
			Note moyenne = stagiaire.moyenne();
			
			assertTrue(moyenne.getNumerateur() == 10);
			
		} catch (ParseException e1) {
			e1.printStackTrace();
			fail("Exception");
		}catch(NoteNegativeExeption e){
			e.printStackTrace();
			fail("Exception");
		}
	}

}
