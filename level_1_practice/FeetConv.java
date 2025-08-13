package level_1_practice;
import java.util.* ;

public class FeetConv {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter distance in feet: ");
	        double distanceFeet = input.nextDouble();
	        
	        double yards = distanceFeet / 3;
	        double miles = yards / 1760;
	        
	        System.out.println("The distance is " + yards + " yards and " + miles + " miles for the given " + distanceFeet + " feet");
	        
	        input.close();
	    }
}
