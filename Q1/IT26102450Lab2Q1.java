public class  IT26102450Lab2Q1 {

public static void main (String[] args) {

	int perimeter = 100;
	
	double width_ratio = 0.75;

	double length = perimeter/ (2 * (1+width_ratio));
	double width = length * width_ratio;

	System.out.println("Length of the fence:" +length);
	System.out.println("Width of the fence:" +width);
}
}
