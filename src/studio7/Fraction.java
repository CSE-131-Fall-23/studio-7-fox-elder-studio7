package studio7;

public class Fraction {

	private int num;
	private int den;
	
	public Fraction(int num1, int den1) {
		num = num1;
		den = den1;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public Fraction add(Fraction f) {
		int num1 = this.getNum() * f.getDen();
		int den1 = this.getDen() * f.getDen();
		int num2 = f.getNum() * this.getDen();
		int den2 = f.getDen() * this.getDen();
		Fraction a = new Fraction(num1 + num2, den1 + den2);
		return a;
	}
	
	public Fraction multiply(Fraction f) {
		int num1 = this.getNum() * f.getNum();
		int den1 = this.getDen() * f.getDen();
		Fraction a = new Fraction(num1, den1);
		return a;
	}
	
	public Fraction reciprocal() {
		Fraction a = new Fraction(this.getDen(), this.getNum());
		return a;
	}
	
	public Fraction simplify() {
		if (this.getDen()>this.getNum()) {
			for(int i = this.getNum(); i >= 1; i--) {
				if((this.getNum() % i == 0) && (this.getDen() % i ==0))
				{this.setNum(this.getNum()/i);
				 this.setDen(this.getDen())
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
