package fraction;

public class Fraction implements IFraction {
	
	private int numerateur;
	private int denominateur;
	
	//////////////////////////////////////////////////////
	// Constructeur
	/////////////////////////////////////////////////////
	public Fraction(int num, int den){
		if (den == 0){
			throw new ArithmeticException();
		}
		else{
			this.numerateur = num;
			this.denominateur = den;
		}
		
	}

	////////////////////////////////////////////////////////
	// Getters / Setters
	///////////////////////////////////////////////////////
	public int getNumerateur() {
		return numerateur;
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public int getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}

	/////////////////////////////////////////////////////
	// Méthodes Override de IFraction
	////////////////////////////////////////////////////
	@Override
	public Fraction additionner(Fraction f) {
		return new Fraction(this.numerateur * f.denominateur + f.numerateur * this.denominateur,
				this.denominateur * f.denominateur);
	}

	@Override
	public Fraction soustraire(Fraction f) {
		return new Fraction(this.numerateur * f.denominateur - f.numerateur * this.denominateur,
				this.denominateur * f.denominateur);
	}

	@Override
	public Fraction multiplier(Fraction f) {
		return new Fraction(this.numerateur * f.numerateur,
				this.denominateur * f.denominateur);
	}

	@Override
	public Fraction diviser(Fraction f) {
		return new Fraction(this.numerateur * f.denominateur,
				this.denominateur * f.numerateur);
	}

	@Override
	public Fraction opposer() {
		return new Fraction(-this.numerateur, this.denominateur);
	}

	@Override
	public Fraction inverser() {
		return new Fraction(this.denominateur, this.numerateur);
	}

	@Override
	public double calculer() {
		return (double) this.numerateur / (double) this.denominateur;
	}

	@Override
	public Fraction simplifier() {
		if (		this.numerateur < 0
					&&
					this.denominateur < 0
				
				|| 
				
					this.numerateur > 0 
					&&
					this.denominateur < 0){
			this.numerateur *= -1;
			this.denominateur *= -1;
		}
		
		int pgcd = PGCD(this.numerateur, this.denominateur);
		
		return new Fraction(this.numerateur/pgcd, this.denominateur/pgcd);
	}

	@Override
	public int comparer(Fraction f) {
		
		double a = this.calculer();
		double b = f.calculer();
		double resultat = a - b;
		
		if (resultat > 0){
			return 1;
		}else if (resultat < 0){
			return -1;
		}
		else{
			return 0;
		}
	}

	@Override
	public boolean egalite(Fraction f) {
		
		double resultat = this.calculer() - f.calculer();
		
		return resultat == 0;
	}
	
	@Override
	public String toString(){
		return this.numerateur + "/" + this.denominateur;
	}
	
	//////////////////////////////////////////////////////
	// Méthodes
	/////////////////////////////////////////////////////
	public static int PGCD(final int n1, final int n2){
		int pgcd;
		int positivetiveN1 = n1;
		int positivetiveN2 = n2;
		
		if (positivetiveN1 < 0){
			positivetiveN1 *= -1;
		}
		if (positivetiveN2 < 0){
			positivetiveN2 *= -1;
		}
		
		if (positivetiveN1 > positivetiveN2){
			pgcd = PGCD(positivetiveN1 - positivetiveN2, positivetiveN2);
		}else if (positivetiveN1 < positivetiveN2){
			pgcd = PGCD(positivetiveN2 - positivetiveN1, positivetiveN1);
		}else{
			return positivetiveN1;
		}
		return pgcd;
	}

}
