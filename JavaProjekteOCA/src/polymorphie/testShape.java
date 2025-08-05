package polymorphie;

class Shape {

	public void draw() {

		System.out.println("Drawing a Shape");
	}
	}
	

	class Circle extends Shape {
		@Override
		public void draw() {
			System.out.println("Drawing a circle");
		}
	}

	class Square extends Shape {
		@Override
		public void draw() {
			System.out.println("Drawing a Square");
		}
	}



public class testShape {

	public static void main(String[] args) {

		Shape myShape = new Shape();
		Shape myCircle = new Circle();  // Upcating
		Shape mySquare = new Square();  // Upcating

		myShape.draw();
		myCircle.draw(); 
		mySquare.draw();

	}

}
