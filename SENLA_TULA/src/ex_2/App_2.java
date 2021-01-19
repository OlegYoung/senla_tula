package ex_2;

import java.util.Scanner;


public class App_2 {
	  
	  
    public static void main(String args[]){
     
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number to find GCD and LCM");
        int number1 = scanner.nextInt();
        System.out.println("enter second number to find GCD and LCM");
        int number2 = scanner.nextInt();
        
       
      
        System.out.println("GCD of two numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2));
        System.out.println("LCM of two numbers " + number1 +" and " + number2 +" is :" + findLCM(number1,number2));
        
        
        } catch(Exception e) {
        	
            System.err.println("This  number doesn't fit");
            
        }
       
      
      
    }

    
    private static int findGCD(int number1, int number2) {
     
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
    
    private static int findLCM(int number1, int number2) {
    	
    	int number3 = number1*number2;
    	return number3/findGCD(number1,number2);
    	
    	
      }
    	
    
    
  
}

