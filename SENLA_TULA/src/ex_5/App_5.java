package ex_5;

import java.util.Scanner;

public class App_5 {
	
	public static void main(String[] args) {
		int N= 0;
		do
		{
		 Scanner in = new Scanner(System.in);
	     System.out.print("Input a number: ");
	     N = in.nextInt();
		} while(N>=100 || N < 0);
		
		
		
		
	        for (Integer x = 0;x < N;x++) { 
	            if (isPalindrome(x)) System.out.println(x);
	        }
	    } 
	
	public static boolean isPalindrome(Integer x) {
        String s = x.toString();
        int len = s.length();
        for (int i = 0;i<len;i+=2) {
            if (s.charAt(i) != s.charAt(len-i-1)) return false;
        }
        return true;
    }


}
