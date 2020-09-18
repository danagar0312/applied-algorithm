package mathematics;

public class primefactor {

	public static void primeFactor(int n) {
		if(n%2 == 0) {
			System.out.println(2 + " ");
			n = n/2;
		}
		
		for (int i = 3 ; i*i <= n; i = i+2) {
			while(n%i == 0) {
				System.out.println(i + " ");
				n = n/i;
			}
		}
		
		if(n > 2) {
			System.out.println(n);
		}
	}
	
	 public static void main(String[] args) 
	    { 
	        int n = 315; 
	        primeFactor(n); 
	    } 
}
