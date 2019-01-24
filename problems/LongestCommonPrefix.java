package problems;

public class LongestCommonPrefix {

	static String longestCommon(String[] strs) {
		if(strs[0]==""|| strs[1]=="")
			return "";
		int maxima=0;
	    int index_i=0;
	    int index_j=0;
	    int dp[][]=new int[strs[0].length()+1][strs[1].length()+1];
	    for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				if(i==0 || j==0)
					dp[i][j]=0;
				else if(strs[0].charAt(i-1)==strs[1].charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
					
				}
				else {
					dp[i][j]=0;
				}
				if(dp[i][j]>maxima) {
					maxima=dp[i][j];
					index_i=i-1;
					index_j=j-1;

				}
			}
	    }
	    if(maxima==0)
	    	return "";
	    char second[]=new char[maxima];
	    while(index_i>=0 && index_j>=0 && dp[index_i+1][index_j+1]!=0) {
	    	second[maxima-1]=strs[0].charAt(index_i);
	    	index_i=index_i-1;
	    	index_j=index_j-1;
	    	maxima=maxima-1;
	    }
	    String s=new String(second);
	    return s;
	}
    static public String longestCommonPrefix(String[] strs) {
   /* int len=strs.length==2?0:1;
   if(strs.length==0)
	   return "";
   if(strs.length==1)
	   return strs[0];
   
    while(len<strs.length-1) {	
    strs[0]=longestCommon(strs);
    len=len+1;
    strs[1]=strs[len];
    }*/
    if(strs.length!=3)
    	return "";
    strs[0]=longestCommon(strs);
    strs[1]=strs[2];
    return longestCommon(strs);
    }
    
    public static void main(String[] args) {
    	String str[]= {"dogc","racecar","car"};
		System.out.println(longestCommonPrefix(str));
	}
}
