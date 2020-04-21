package revision;

public class box {
	
	double width;
	double height;
	double length;
	
	box(){
		width = 10;
		height = 10;
		length = 5;
	}
	
	public box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
		
	}
	
	public double compute() {
		return width * height * length;
		
	}

	

	}

