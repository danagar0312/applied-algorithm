package mathematics;

public class Palindrome {
	public static void main(String args[]) {
		int sum = 0, temp;
		
		int n = 454;
		temp = n;
		while(n > 0) {
			sum = (sum*10) + (n%10);
			n = n/10;
		}
		if (temp == sum)  
			System.out.println("palindrome number");    
		else    
			System.out.println("not palindrome");    
	}
}
