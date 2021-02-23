import java.util.Scanner;
import java.lang.Math;
class lineComparison{

	float lengthofline(){
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

	void compare(float len1, float len2){
		Float objA = len1;
		Float objB = len2;
		int result = objA.compareTo(objB);
		if(result > 0){
			System.out.println("Line1 is greater than Line2");
		}
		else if(result < 0){
			System.out.println("Line1 is less than Line2");
		}
		else{
			System.out.println("Line1 is equal to Line2");
		}
	}

	public static void main(String[] args){
     	lineComparison ln = new lineComparison();
		System.out.println("For line 1");
      float length1 = ln.lengthofline();
		System.out.println("lenght of the line 1 is "+length1);
		System.out.println("For line 2");
		float length2 = ln.lengthofline();
		System.out.println("lenght of the line 2 is "+length2);
		ln.compare(length1, length2);
   }

}
