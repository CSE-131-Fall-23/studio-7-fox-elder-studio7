package studio7;

public class Die {

	private int sides;
	
	public Die(int sides1) {
		sides = sides1;
	}
	
	public void setSides(int newSides) {
		sides = newSides;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public int rollDice() {
		return ((int)(Math.random()*sides)+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die d1 = new Die(8);
		System.out.print(d1.rollDice());
	}

}
