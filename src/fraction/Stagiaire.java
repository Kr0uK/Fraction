package fraction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Stagiaire {
	
	private String prenom;
	private String nom;
	private Date dateNaissance;
	private List<Note> notes = new ArrayList<Note>();
	
	//////////////////////////////////////////////////////
	// Constructeurs
	/////////////////////////////////////////////////////
	public Stagiaire(String prenom, String nom, Date dateNaissance, List<Note> notes) {
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.notes = notes;
	}
	
	public Stagiaire(String prenom, String nom, Date dateNaissance){
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}

	///////////////////////////////////////////////////
	// Getters
	///////////////////////////////////////////////////	
	public String getPrenom() {
		return prenom;
	}


	public String getNom() {
		return nom;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public List<Note> getNotes() {
		return notes;
	}

	////////////////////////////////////////////////////////
	// Setters
	//////////////////////////////////////////////////////
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}


	///////////////////////////////////////////////////////
	// Méthodes
	////////////////////////////////////////////////////
	public void ajouterNote(Note note){
		notes.add(note);
	}
	
	public void modifierNote(Note ancienne, Note nouvelle){
		int i = notes.indexOf(ancienne);
		
		notes.set(i, nouvelle);
	}
	
	public Note moyenne(){
		int somme = 0;
		
		for (Note note : notes) {
			somme += note.getNumerateur();
		}
		
		Note moyenne;
		try {
			moyenne = new Note(somme / notes.size());
		} catch (NoteNegativeExeption e) {
			e.printStackTrace();
			return null;
		}
		
		return moyenne;
	}

}
