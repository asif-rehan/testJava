package testJava;

public class Fraction {
	private Integer numerator;
	private Integer denominator;
	
	public Integer getNumerator() {
		return numerator;
	}
	public void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}
	public Integer getDenominator() {
		return denominator;
	}
	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
	}
	public Fraction(Integer num, Integer den) {
		this.numerator = num;
		this.denominator = den;
	}
	public Fraction(Integer num){
		this.numerator = num;
		this.denominator = 1;
	}
	public Fraction add(Fraction other){
		Integer newNum, newDenom, common;
		newNum = other.getDenominator()*this.numerator + 
				this.denominator*other.getNumerator();
		newDenom = this.denominator*other.getDenominator();
		common = gcd(newNum, newDenom);
		return new Fraction(newNum/common, newDenom/common);
	}
	public Fraction add(Integer other) {
		return add(new Fraction(other));
	}
	public Fraction mul(Fraction other) {
		Integer newNum, newDenom, common;
		newNum = this.numerator*other.getNumerator();
		newDenom = this.denominator*other.getNumerator();
		common = gcd(newNum, newDenom);
		return new Fraction(newNum/common, newDenom/common);
	}
	public Fraction mul(Integer other) {
		return mul(other);
	}
	private static Integer gcd(Integer m, Integer n) {
		while (m  % n == 0 ) {
			Integer oldm = m;
			Integer oldn = n;
			m = oldn;
			n = oldm % oldn;
		}
		return n;
	}
	public String toString() {
		return numerator.toString() + "/" + denominator.toString();
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(2, 3);
		System.out.println(f1.mul(f2));
		System.out.println(f1.add(f2));
	}
}
