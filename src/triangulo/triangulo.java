package triangulo;

class Shape {
	private String name;
	Shape(String aName) {name=aName;}
	public String getName() {return name;}
	public float calculateArea() {return 0.0f;}
	public static void main(String argv[]) {
		Circle c = new Circle("Circle C");
		Square s = new Square("Square S");
		Triangulo t = new Triangulo("Triangulo T");
		Shape shapeArray[] = {c, s, t};
		for (int i=0; i<shapeArray.length; i++) {
			System.out.println("The area of " + shapeArray[i].getName()
					+ " is " + shapeArray[i].calculateArea()+" sq. cm.\n");
		}
	}	
}

class Circle extends Shape {
	private int radius;
	Circle(String aName) {
		super(aName);
		radius = 3;
}
public float calculateArea() {
	float area;
	area = (float) (3.14 * radius * radius);
	return area;
	}
}

class Square extends Shape {
	private int side;
	Square(String aName) {
		super(aName);
		side = 3;
	}
	public float calculateArea() {
		int area;
		area = side * side;
		return area;
	}
}
// subclasse triangulo
// usando base e altura
class Triangulo extends Shape{
	private int altura;
	private int base;
	private int lado;
	Triangulo(String aName) {
		super(aName);
		altura = 3;
		base = 3;
	}
	public float calculateArea() {
		int area;
		area = altura * base / 2;
		return area;
	}
}