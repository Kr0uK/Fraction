package fraction;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

	@Test
	public void testAdditionner() {
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		Fraction resultat = f1.additionner(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == 7) && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test première fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.additionner(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == 1) && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test deuxième fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(1, 2);
		
		resultat = f1.additionner(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == -1) && (resultat.getDenominateur() == 6));

	}

	@Test
	public void testSoustraire() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		Fraction resultat = f1.soustraire(f2);
		
		assertTrue((resultat.getNumerateur() == 1) && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test première fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.soustraire(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == 7) && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test deuxième fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(1, 2);
		
		resultat = f1.soustraire(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == -7) && (resultat.getDenominateur() == 6));
		
	}

	@Test
	public void testMultiplier() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		Fraction resultat = f1.multiplier(f2);
		
		assertTrue((resultat.getNumerateur()) == 2 && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test première fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.multiplier(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == -2) && (resultat.getDenominateur() == 6));
		
		/////////////////////////////////////////////////////////////////////////////////		
		// Test deuxième fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(1, 2);
		
		resultat = f1.multiplier(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == -2) && (resultat.getDenominateur() == 6));
	}

	@Test
	public void testDiviser() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		Fraction resultat = f1.diviser(f2);
		
		assertTrue((resultat.getNumerateur()) == 4 && (resultat.getDenominateur() == 3));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test première fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.diviser(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == 4) && (resultat.getDenominateur() == -3));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test deuxième fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(1, 2);
		
		resultat = f1.diviser(f2);
		
		Assert.assertTrue((resultat.getNumerateur() == -4) && (resultat.getDenominateur() == 3));
	}

	@Test
	public void testOpposer() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		
		Fraction resultat = f1.opposer();
		
		assertTrue((resultat.getNumerateur()) == -2 && (resultat.getDenominateur() == 3));
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test fraction négative
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		
		resultat = f1.opposer();
		
		Assert.assertTrue((resultat.getNumerateur() == 2) && (resultat.getDenominateur() == 3));
	}

	@Test
	public void testInverser() {
		Fraction f1 = new Fraction(2, 3);
		
		Fraction resultat = f1.inverser();
		
		assertTrue((resultat.getNumerateur()) == 3 && (resultat.getDenominateur() == 2));
	}

	@Test
	public void testCalculer() {
		Fraction f1 = new Fraction(1, 2);
		
		double resultat = f1.calculer();
		
		assertTrue(resultat == 0.5);
	}

	@Test
	public void testSimplifier() {
		Fraction f1 = new Fraction(4, 6);
		
		Fraction resultat = f1.simplifier();
		
		assertTrue((resultat.getNumerateur()) == 2 && (resultat.getDenominateur() == 3));
	}

	@Test
	public void testComparer() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		int resultat = f1.comparer(f2);
		
		assertTrue(resultat == 1);
		
		f1 = new Fraction(1, 2);
		f2 = new Fraction(2, 3);
		
		resultat = f1.comparer(f2);
		
		assertTrue(resultat == -1);
		
		f1 = new Fraction(2, 3);
		f2 = new Fraction(2, 3);
		
		resultat = f1.comparer(f2);
		
		assertTrue(resultat == 0);
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test une fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue( resultat == 1);
		
		f1 = new Fraction(-1, 2);
		f2 = new Fraction(2, 3);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue(resultat == -1);
		
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-2, 3);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue(resultat == 1);
		
		//////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions négatives
		//////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue(resultat == -1);
		
		f1 = new Fraction(-1, 2);
		f2 = new Fraction(-2, 3);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue(resultat == 1);
		
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(-2, 3);
		
		resultat = f1.comparer(f2);
		
		Assert.assertTrue(resultat == 0);
	}

	@Test
	public void testEgalite() {
		/////////////////////////////////////////////////////////////////////////////////////
		// Test 2 fractions positives
		////////////////////////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		
		boolean resultat = f1.egalite(f2);
		
		assertFalse(resultat);
		
		
		f2 = new Fraction(2, 3);
		
		resultat = f1.egalite(f2);
		
		assertTrue(resultat);
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test première fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		
		f1 = new Fraction(2, 3);
		f2 = new Fraction(-1, 2);
		
		resultat = f1.egalite(f2);
		
		Assert.assertFalse(resultat);
		
		/////////////////////////////////////////////////////////////////////////////////////
		// Test deuxième fraction positive
		////////////////////////////////////////////////////////////////////////////////////
		f1 = new Fraction(-2, 3);
		f2 = new Fraction(1, 2);
		
		resultat = f1.egalite(f2);
		
		Assert.assertFalse(resultat);
	}

	@Test
	public void testPGCD(){
		
		int resultat = Fraction.PGCD(96, 36);
		
		assertTrue(resultat == 12);
		
		resultat = Fraction.PGCD(-18, 6);
		
		assertTrue(resultat == 6);
	}


}
