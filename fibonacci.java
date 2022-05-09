

public class fibonacci {

	public static void main(String[] args) {
		
			
	int n1=0;
	int n2=1;
	int n = 8;
	for(int i=2;i<=n;i++) {
		System.out.println(n1+n2);
		int sum1=n1+n2;
		n1=n2;
		n2=sum1;
	} 
	
	
	}

	
	
	
}
