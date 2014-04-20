class MatchBox extends Box {

	double weight;			
	
	MatchBox() {		
	}
	
	MatchBox(double w, double h, double d, double m) {	
		super(w, h, d);
		weight = m;			//mass		
	}
	
	public static void main(String args[]) {
		
		MatchBox mb1 = new MatchBox(10, 10, 10, 10);
		MatchBox mb2 = new MatchBox(0, 10, 10, 10);
		MatchBox mb3 = new MatchBox(20, 10, 10, 10);
		
		try {
			mb1.getVolume();
			mb2.getVolume();
			mb3.getVolume();
		} catch (MyBadException e) {
			System.out.println("Provide MatchBox dimensions");			
		}

/*		
		System.out.println("width of MatchBox 1 is " + mb1.width);
		System.out.println("height of MatchBox 1 is " + mb1.height);
		System.out.println("depth of MatchBox 1 is " + mb1.depth);
		System.out.println("weight of MatchBox 1 is " + mb1.weight);
*/
		
	}
	
}