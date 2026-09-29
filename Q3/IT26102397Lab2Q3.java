public class IT26102397Lab2Q3{

	public static void main(String[] args){

		double sideA, sideB, squareOfHypotenuse, hypotenuse;
		sideA= 3;
		sideB= 4;
		squareOfHypotenuse= (sideA*sideA)+(sideB*sideB);
		hypotenuse= Math.sqrt(squareOfHypotenuse);
		System.out.println("Length of hypotenuse: "+hypotenuse);

	}

}