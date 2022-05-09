
public class amstrong {
	public static void main(String[] args) {
		int a=223;
		int sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(a==sum) {
			System.out.println("amstrong number");
			
		}
		else {
			System.out.println("not a amstrong");
		}
		
	}

}
