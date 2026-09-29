public class IT26102529Lab1Q2
{
   public static void main (String[]args)
    {
      int perimeter=100; // given perimeter in the fence
	  double length;
	  double width;
	
	 double width_ratio=0.75;
	 
	 
	 length =perimeter / (2*(1+width_ratio));
	 width=width_ratio*length;
	 
	 System.out.println("length of the fence: "+length);
	 System.out.println("width of the fence: "+width);
    }
}