package problems;

public class ReverseInteger {

	static int reverse(int xa) {
		long x=xa;
		boolean neg=false;
		if(xa<0) {
			neg=true;
			//x=Math.abs(x);
			x=x*(-1);
			System.out.println(x);
		}
		long x1=0;
		while(x!=0) {
			int last=(int) (x%10);
			x=x/10;
			if(Integer.MAX_VALUE<((x1*10)+last)) {
				return 0;
			}
			if(neg) {
				System.out.println(Integer.MIN_VALUE);
				System.out.println(last);
				if(((-1)*((x1*10)+last))<Integer.MIN_VALUE)
					return 0;
			}
				
			x1=(x1*10)+last;
		}
		if(neg)
			return (int) (x1*(-1));
		
		else return (int) x1;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(-2147483648));

	}
}
