public class IT26102749Lab2Q1 {
	
	public static void main(String[] args) {
		//given perimeter
		double perimeter = 100;
		
		//perimeter = 2 * (length + width)
		//width     = (3/4) * length
		//100       = 2 * (0.75 * length + length)
		//100       = 2 * (1.75 * length)
		//100       = 3.5 * length
		//length    = 100 / 3.5
		
		
		double length = perimeter / 3.5;
		double width  = ( 3.0/4.0) * length;
		
		
		System.out.println("Length of the fence: " + length);
		System.out.println("Width of the fence : " + width);
		
	}
	
}