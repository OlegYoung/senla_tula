package ex_4;


import java.util.Scanner; 

class App_4 { 
	
	public static void main(String args[])  
	{ 
		Scanner in = new Scanner(System.in);
	    System.out.print("Input the string: ");
	    String str = in.nextLine();
	    
	    Scanner in_w = new Scanner(System.in);
	    System.out.print("Input the word: ");
	    String word = in.nextLine(); 
	    
	    System.out.println("Number of words" + count_word(str, word)); 
	} 
  
	static int count_word(String str, String word)  { 
		int count = 0; int i = 0;
	    String a[] = str.split(" "); 
	    for ( i = 0; i < a.length; i++) {
	    	a[i] = a[i].toLowerCase();
	    }
	    
	   
	    word = word.toLowerCase();   
	     
	    for ( i = 0; i < a.length; i++)  
	    { 
	    
	    if (word.equals(a[i])) 
	        count++; 
	    } 
	  
	    return count; 
	} 
  


} 