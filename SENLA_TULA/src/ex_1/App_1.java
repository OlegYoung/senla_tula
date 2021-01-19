package ex_1;

import java.util.Scanner;

public class App_1 {

	public static void main(String[] args) {
		
		
		int user_input = Input_number(0, Integer.MAX_VALUE);
		String description = "Number " + user_input;
		
        if (isPrime(user_input)) {
        	description += " prime number and";
        }
        else 
        	if (user_input >= 2) {
        		description += " composite number and";
        	}
        if (isEven(user_input)) {
        	description += " is even";
        }
        else {
        	description += " is odd";
        }
        System.out.println(description);
		
	}
	
	 public static int Input_number(int a, int b) {
		 
	        Scanner in = new Scanner(System.in);
	        int userInput;
	        
	        while (true) {
	        	
	            System.out.println("Enter number  in range  [" + a + " .. " + b + "]: ");
	            String s = in.nextLine();
	            
	            try {
	            	
	                userInput = Integer.parseInt(s);
	                if (userInput < a || userInput > b) {
	                		                
	                    System.err.println("This  number doesn't fit");
	                    
	                }
	                else {
	                		               
	                    break;
	                    
	                }
	            } catch (NumberFormatException e) {
	            	
	                System.err.println("This  number doesn't fit");
	                
	            }
	        }
	       
	        return userInput;
	    }
	 
	 
	 
	  public static boolean isEven(int num) {
	        return num % 2 == 0 ? true : false;
	    }
	    
	    public static boolean isPrime(int num) {
	        if (num < 3) {
	        	return num == 2;
	        }
	        if (num % 2 == 0) {
	        	return false;
	        }
	        for (int i = num / 3; i >= 3; i -= 2) {
	        	
	            if (isEven(i)) i--;{
	            	if ((num % i) == 0) {
		                return false;
	            	}
	            }
	            
	        }
	        return true;
	    }

}
