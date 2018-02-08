//Theodore Ruth Java Chapter 11: Exercise 5
public class Rational {

	public static void main(String[] args) {
		Rational printTester = new Rational();
		printTester.printRational();
		System.out.println(printTester);
		
		System.out.println("");
		
		Rational negateTester = new Rational(2);
		negateTester.printRational();
		System.out.println(negateTester);
		negateTester.negate();
		System.out.println(negateTester);
		
		System.out.println("");
		
		Rational invertTester = new Rational(2, 3);
		invertTester.printRational();
		System.out.println(invertTester);
		invertTester.invert();
		System.out.println(invertTester);
		
		System.out.println("");
		
		Rational doubleTester = new Rational(1, 2);
		doubleTester.printRational();
		System.out.println(doubleTester);
		System.out.println(doubleTester.toDouble());
		
		System.out.println("");
		
		Rational reduceTester = new Rational(5, 10);
		reduceTester.printRational();
		System.out.println(reduceTester);
		System.out.println(reduceTester.reduce());
		
		System.out.println("");
		
		Rational addTester1 = new Rational(5, 10);
		Rational addTester2 = new Rational(1, 2);
		addTester2.printRational();
		System.out.println(addTester1);
		System.out.println(addTester1.add(addTester2));
		


	}
	
	private int numerator;
	private int denominator;
	
	public Rational()
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational(int numerator)
	{
		this.numerator = numerator;
		this.denominator = 1;
	}
	
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void negate()
	{
		int doubled = this.numerator * 2;
		this.numerator = this.numerator - doubled;
	}
	
	public void invert()
	{
		int temp = this.numerator;
		this.numerator = this.denominator;
		this.denominator = temp;
	}
	
	public double toDouble()
	{
		double numerator = this.numerator;
		double denominator = this.denominator;
		return numerator / denominator;
	}
	
	
	public Rational reduce()
	{
		double num = this.numerator;
		double den = this.denominator;
		double r = num % den;
		while(r != 0)
		{
			num = den;
			den = r;
			r = num % den;
		}
		int GCD = (int) den;
		int newNum = this.numerator / GCD;
		int newDen = this.denominator / GCD;
		
		
		Rational reduced = new Rational (newNum, newDen);
		return reduced;
		
	}
	
	public Rational add(Rational other)
	{
		int newNum = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
		int newDen = this.denominator * other.getDenominator();
		Rational newRational = new Rational(newNum, newDen);
		newRational = newRational.reduce();
		return newRational;
	}
	
	public void printRational()
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}

}
