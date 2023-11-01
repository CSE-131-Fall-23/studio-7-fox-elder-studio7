package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length1, double width1) {
		length = length1;
		width = width1;
	}
	public void setLength(double newLength) {
		length = newLength;
	}
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double area() {
		return this.length * this.width;
	}
	public double perimeter() {
		return 2*this.length + 2*this.width;
	}
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isBigger(Rectangle x) {
		if(this.area() > x.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
