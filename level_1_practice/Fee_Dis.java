package level_1_practice;
import java.util.* ;


public class Fee_Dis {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Fee Amount");
		double Amount = sc.nextDouble() ;
		System.out.println("Enter Your Discount Percentage");
		double Disc = sc.nextDouble();
		double Dp = Disc/100 ;
		double Disc_Pr = Amount * Dp ;
		double Disc_Fee = Amount - Disc_Pr ;
		
		System.out.println("The discount amount is INR "+Disc_Pr+" and final discounted fee is INR "+Disc_Fee);
	}

}
