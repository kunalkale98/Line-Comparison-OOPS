import java.util.Scanner;
import java.lang.Math;
class lineComparison{

	public float lengthofline(){
		System.out.println("Enter coordinates of point to get the length");
      Scanner sc = new Scanner(System.in);
      System.out.print("x1: ");
      int x1 = sc.nextInt();
      System.out.print("y1: ");
      int y1 = sc.nextInt();
      System.out.print("x2: ");
      int x2 = sc.nextInt();
      System.out.print("y2: ");
      int y2 = sc.nextInt();
		float length = (float)Math.sqrt( Math.pow( (x2-x1),2 ) + Math.pow( (y2-y1),2 ) );
		return length;
	}

	 public static void main(String[] args){
      lineComparison ln = new lineComparison();
      float length1 = ln.lengthofline();
		System.out.println("lenght of the line is "+length1);
   }

}
