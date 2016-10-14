package fraction;

public interface IFraction {

	Fraction additionner(Fraction f);	
	Fraction soustraire(Fraction f);
	Fraction multiplier(Fraction f);
	Fraction diviser(Fraction f);
	
	Fraction opposer();
	Fraction inverser();
	
	double calculer();
	Fraction simplifier();
	
	
	int comparer(Fraction f);
	boolean egalite(Fraction f);
	
	public String toString();
	
}
