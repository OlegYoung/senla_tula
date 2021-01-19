package ex_3;

import java.util.Scanner;

public class App_3 {
	
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        str = str.trim();
        
        int num = count_Words(str);

        System.out.print("Number of words in the string: " + num +"\n");
       
        
        first_case(str);
      
        sort_Words(str, num);
    
    }

	 public static int count_Words(String str)
	    {
	       int count = 0;
	        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count; 
	    }
	
	 	public static void first_case(String str) {
	 		
	 		
	 		String[] words = str.split("\\s+");
	 			 	    	 	
	 		String slovo; String slovo2; char s1,s2;
	 		for (int i = 0; i < words.length; i++) {
	 		StringBuffer sb = new StringBuffer(words[i]);

	 	    slovo = words[i].substring(0, 1);
	 	    slovo2 = slovo.toUpperCase();

		    sb.replace(0, 1, slovo2);
		    System.out.print(sb+" ");
	 		    
	 		    

	 		}
	 	}
	 		
	 	public static void sort_Words(String str, int num) {	
				String[] words = str.split("\\s+");
				System.out.print("\nSorted string: ");
				int i;
				for(int j = 0; j<num; j++) {
					for(i = 1; i<num; i++) {
						if(words[i].length()>words[i-1].length()) {
							String len = words[i-1];
							words[i-1] = words[i];
							words[i] = len;
						}
				
					}
				}
				for(i = 0; i<num; i++) {
					System.out.print(words[i]+" ");
				}
				
			}
	 		


	 	}
 		
 		
 		
 		
	 
 
 
	

