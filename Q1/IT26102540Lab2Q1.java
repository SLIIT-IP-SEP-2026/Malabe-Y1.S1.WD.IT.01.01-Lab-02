public class IT26102540Lab2Q1{
	public static void main(String []args){
		double perimeter=100.0;
		double width;
		double length=1;
		double x;
			
		x = 2*(length + length*3/4);
		length = perimeter/x;
		width= length*3/4;
		
		System.out.println("Length of the fence:" + length);
		System.out.println("width of the fence:" + width);
	}
}