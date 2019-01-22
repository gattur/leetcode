package problems;

public class PalindromeNumber {

	static public boolean isPalindrome(int x) {
    int temp=x;
	if(x<0)
    	return false;
    int a=0;
    while(x!=0) {
    	int rem=x%10;
    	x=x/10;
    	a=a*10+rem;
    }
    if(temp==a)
    	return true;
    return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
}
