public class IT26101227Lab2Q1 {

	public static void main(String[] args){
		
		int perimeter = 100; //Given perimeter of the fence
		double length;
		double width;
		
		// width to lenth ratio; 3/4 = 0.75
		double width_ratio = 0.75;
		
		length = perimeter / (2 * (1 + width_ratio));
		width = width_ratio * length;
		
		
		System.out.println("Length of the fence: " + length);
		System.out.println("Width of the fence: " + width);
		
		
		}

}