class Shape {

	int sides;
	
	Shape() {
		System.out.println("Sphere");
	}
	
	Shape(int x, int y) {
	
		if ( x == y ) {
			System.out.println("Square");
		}
		else
			System.out.println("Rectangle");			
	}
	
	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape(2,2);
		Shape s3 = new Shape(2,5);
	}
	
}