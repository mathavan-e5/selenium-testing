
public class primenumber {
	public static void main(String [] args) {
		int n=9;
		
		boolean prime=true;
		
		for (int i = 2; i <n; i++) {
			if(n%i==0){
			prime=false;
			break;
			
			}
		
	}
    if(prime==true) {
    	System.out.println("prime number" );
    }
    else {
    	System.out.println("not a prime number");
    }
	}


}
