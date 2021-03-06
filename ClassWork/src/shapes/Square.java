package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() {
		// To be written by student
		return "Square Side: " + side + "\nArea: " + this.calculateArea() + "\nPerimeter: "
				+ this.calculatePerimeter() + "\n\n";
	}

}
