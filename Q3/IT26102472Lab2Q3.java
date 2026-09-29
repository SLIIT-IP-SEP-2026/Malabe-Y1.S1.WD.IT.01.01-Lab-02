public class IT26102472Lab2Q3{
	
	public static void main(String[]args){
		
		double hypotenuse, sideA, sideB, squareOfHypotenuse;
		sideA = 3;
		sideB = 4;
		squareOfHypotenuse = (sideA*sideA)+(sideB*sideB);
		hypotenuse = Math.sqrt(squareOfHypotenuse);
		System.out.println("Length of hypotenuse: "+hypotenuse);
	}
}