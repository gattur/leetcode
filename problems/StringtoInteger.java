package problems;

import java.math.BigInteger;

public class StringtoInteger {

	static public int myAtoi(String str) {
        int index=0;
        boolean added=false;
        boolean number=false;
        while(index<str.length() && str.charAt(index)==' ') {
        	index=index+1;
        }
        if(index>=str.length() || Character.isLetter(str.charAt(index)))
        	return 0;
        StringBuilder sb=new StringBuilder();
        if(str.charAt(index)=='-' || str.charAt(index)=='+') {
        	sb.append(str.charAt(index));
        	index=index+1;
        }
        if(index>=str.length() || Character.isLetter(str.charAt(index)))
        	return 0;
        while(index<str.length() && ( Character.isDigit(str.charAt(index)) || str.charAt(index)=='.' || str.charAt(index)=='+')) {
        	if(str.charAt(index)=='.') {
        		return 0;
        	}
        	if(str.charAt(index)=='-' || str.charAt(index)=='+') {
        		if(added)
        			return 0;
        		sb.setLength(0);
        	}
        	if(sb.length()>=14) {
        		if(Long.parseLong(sb.toString())<Integer.MIN_VALUE)
                	return Integer.MIN_VALUE;
                
                if(Long.parseLong(sb.toString())>Integer.MAX_VALUE)
                	return Integer.MAX_VALUE;
        	}
        	sb.append(str.charAt(index));
        	added=true;
        	if(Character.isDigit(str.charAt(index)))
        		number=true;
        	index=index+1;
        }
        System.out.println(sb.toString());
        if(!number) {
        	return 0;
        }
        if(Long.parseLong(sb.toString().trim())<Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        
        if(Long.parseLong(sb.toString().trim())>Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        
        return Integer.parseInt(sb.toString().trim());
    }
	
	public static void main(String[] args) {
		System.out.println(myAtoi("3.14159"));
	}
}
