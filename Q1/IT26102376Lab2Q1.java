public class IT26102376Lab2Q1 {

    public static void main(String[] args) {
		
		double perameter = 100;
		double length ;
		double width ;
		
		double width_ratio = 0.75;
		
		length = perameter/(2 * (1 + width_ratio));
		width = width_ratio * length;
		

        System.out.println("Length of fence:" + length);
		System.out.println("Width of fence:" + width);
		
	    

    }
}