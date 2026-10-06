public class it26102502Lab2Q3 {
	
	 public static void main (String[] args){
		 // Given length of the twolegs of the triangle
		 
		 double sideA = 3.0;
		 double sideB = 4.0;
		 
		 
		 //calculate the length of the hypotenuse using the pythagorean theorem
		 // c = squareroot (sideA^2 + sideB^2)
		 double hypotenuse = Math.sqrt(sideA * sideA + sideB* sideB);
		 
		 
		 // output the calculated hypotenuse
		 System.out.println("length of the hypotenuse: " + hypotenuse);
	 }

}