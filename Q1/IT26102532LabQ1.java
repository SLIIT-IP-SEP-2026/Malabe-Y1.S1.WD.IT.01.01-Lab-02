public class IT26102532Lab2Q1 { 

		public static void main(String[]args){
			 
			 int perimeter = 100;
			 double length;
			 double width;
			 
			 double width_ratio = 0.75;
			 
			 
			 length = perimeter / (2 * (1 + width_ratio));
			 width = width_ratio * length;
			 
			 System.out.println("Length of the fench: " + length);
			  System.out.println("width of the fench: " + width);
		}		  
}