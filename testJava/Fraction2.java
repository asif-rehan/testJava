package testJava;

public class Fraction2 extends Number implements Comparable<Fraction2>{
	
	private Integer numerator;
	private Integer denominator;

	/*Creates new instances of Fraction2*/
	
	public Fraction2(Integer num, Integer denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public Fraction2 (Integer num) {
		this.numerator = num;
		this.denominator = 1;
	}
	
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
	
	public Fraction2 add(Fraction2 other) {
		Integer newNum, newDenom, common;
		newNum = this.numerator*other.getDenominator() 
				+ this.denominator*other.getNumerator();  
		newDenom = this.denominator*other.getDenominator();
		common = gcd(newNum, newDenom);
		return new Fraction2(newNum/common, newDenom/common);
	}
	
	public Fraction2 add(Integer other) {
		return add(new Fraction2(other));
	}
	
	public String toString() {
		return numerator.toString()+"/"+denominator.toString();
	}
	
	public boolean equals(Fraction2 other) {
		Integer lhs, rhs;
		lhs = this.numerator * other.getDenominator();
		rhs = this.denominator * other.getNumerator();
		if (lhs == rhs) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Fraction2 other) {
		Integer lhs, rhs;
		lhs = this.numerator * other.getDenominator();
		rhs = this.denominator * other.getNumerator();
		return lhs-rhs;
	}
	
	@Override
	public int intValue() {
		return numerator.intValue()/denominator.intValue();
	}
	
	@Override
	public long longValue() {
		return numerator.longValue()/denominator.longValue();
	}
	
	@Override
	public float floatValue() {
		return numerator.floatValue()/denominator.floatValue();
	}
	
	@Override
	public double doubleValue() {
		return numerator.doubleValue()/denominator.doubleValue();
	}
	
	private static Integer gcd(Integer m, Integer n) {
		while (m%n != 0) {
			Integer oldm = m;
			Integer oldn = n;
			m = oldn;
			n = oldm % oldn;
		}
		return n;
	}
	
	public static void main(String[] args) {
		Fraction2 f1 = new Fraction2(2, 5);
		Fraction2 f2 = new Fraction2(4, 7);
		System.out.println(f1.add(f2));
		System.out.println(f1.equals(f2));
		System.out.println(f1.compareTo(f2));
	}

}
