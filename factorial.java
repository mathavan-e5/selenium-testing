
import java.util.Scanner;
public class factorial {
	public static void main(String[] args, int fact) {
		Scanner scan=new Scanner(System.in);
		int number =scan.nextInt();
		scan.close();
		for (int i = 0; i < number; i++) {
			 fact = fact*i;
			 
			 System.out.println("factorial is"+ fact);
		
			
		}
		
		
	}

}
