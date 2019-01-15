package problems;

public class ZigZagConversion {

	static public String convert(String s, int numRows) {
	     char []n=new char[s.length()];
			
			int index=0;
			for (int i = 0; i < numRows; i++) {
				for (int j = i; j < s.length()+(2*(numRows-2)+2); j=j+(2*(numRows-2)+2)) {
					int k=j-(i*2);
					if(k!=j && k<s.length() && k>=0 && i!=numRows-1 && index<s.length())
						n[index++]=s.charAt(k);
					if(j<s.length() && j>=0 && index<s.length())
						n[index++]=s.charAt(j);
	                if(numRows==1)
	                    return s;
				}
			}
					
			return String.valueOf(n);
	    }
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",3));
	}
}
