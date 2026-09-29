public class IT26102367Lab2Q1{
    public static void main(String[]args){
     int perimeter = 100;
	 double lenght;
	 double width;
	
	 double width_ratio = 0.75;
	
	 lenght = perimeter / (2*(1 + width_ratio));
	 width = width_ratio * lenght;
	 
	 System.out.println("Lenght of the fence:" + lenght);
	 System.out.println("width of the fence:" + width);
	 
	}
}