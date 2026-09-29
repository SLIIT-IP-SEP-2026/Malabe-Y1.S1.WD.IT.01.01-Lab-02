public class IT26102472Lab2Q1 {

	public static void main(String[]args){
		double length, width, perimeter;
		double width_ratio = 0.75;
		perimeter = 100;
		length = perimeter/(2*(1+width_ratio));
		width = width_ratio*length;
		System.out.println("length of the fence : "+length);
		System.out.println("width of the fence : "+width);
	}
}