public class it26102502Lab2Q2 {
	
	 public static void main (String[] args){
		 // Given side length of the square fence 
		 double sidelength = 10.0;
		 
		 // calcu;late the perimeter of the square fence
		 double perimetersquare = 4 * sidelength; //4 * length
		 
		 // caculate the radius of the circular fence using the same perimeter 
		 //4 * length = 2 * PI * radius
		 // radius = ( 4 * length / 2 * PI)
		 double radius = perimetersquare / (2 * 3.14);
		  
		  // output the calculated radius
		  System.out.println("radius of the circular fence: " + radius);
		 
		 
	 }

}