package ca.utoronto.utm.labweek04;
public class UnderstandInheritance {

	public static void main(String[] args) {
		// 6) Review class Square, understand what happens when we execute the following:
		// that is, which methods are called and when...
		
		System.out.println("Starting");
		Square s=new Square(); 
		// The line above calls the Square() constructor
		// which executes this("blue", 10, 100, 100); which calls
		// the Square(String c, int width, int x, int y) constructor
		// which executes super(c, width, width, x, y); which calls
		// the parent Rectangle() constructor, which executes
		// super(c,x,y); which calls the grandparent Shape() constructor (parent of Rectangle).
		System.out.println(s.toString());
		// The line above calls the toString() method of the Rectangle parent class,
		// which executes the super.toString(), the getWidth() and the getHeight() methods.
		// The super.toString() calls for to.String() method from the grandparent class (parent class of Rectangle class).
		s.setWidth(20);
		//The line above calls the setWidth() method from the Rectangle parent class.
		s.setX(10);
		//The line above calls the setX() method from Shape grandparent class (parent of Rectangle).
		// Because the Rectangle class inherites from Shape, its methods can also be inherited by
		// the Square class
	}
}
