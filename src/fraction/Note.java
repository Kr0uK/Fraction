package fraction;

public class Note extends Fraction{
	
	private final static int NOTEMAX = 20;
	private final static int NOTEMIN = 0;
	
	
	//////////////////////////////////////////////////////
	// Constructeur
	/////////////////////////////////////////////////////
	public Note (int numerateur) throws NoteNegativeExeption
	{
		super(numerateur, NOTEMAX);
		
		if (numerateur < 0){
			throw new NoteNegativeExeption("Une note ne peut être négative");
		}
		
		this.setNumerateur(numerateur);
	}
	
	//////////////////////////////////////////////////////
	// Setters
	/////////////////////////////////////////////////////
	@Override
	public void setNumerateur(int numerateur) {
		if (numerateur < NOTEMIN){
			super.setNumerateur(NOTEMIN);
		}else if (numerateur > NOTEMAX){
			super.setNumerateur(NOTEMAX);
		}
	}
	
	@Override
	public void setDenominateur(int denominateur) {
		// Exeption à faire
		super.setDenominateur(NOTEMAX);
	}

}
