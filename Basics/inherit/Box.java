class Box {

	double width;
	double height;
	double depth;
	
	Box() {
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	void getVolume() throws MyBadException {
	
		if(width == 0 || height == 0 || depth == 0) {
			throw new MyBadException();
		} else {
			System.out.println("Volume is : " + width * height * depth);
		}
	}
	
}