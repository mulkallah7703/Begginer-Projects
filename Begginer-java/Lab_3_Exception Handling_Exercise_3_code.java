package programmingIIlap;
import java.util.Scanner; 

public class Factorials { 
	    public static void main(String[] args) {  
	    String keepGoing = "y";  
	    Scanner scan = new Scanner(System.in);  
	    while (keepGoing.equals("y") || keepGoing.equals("Y")) {  
	    System.out.print("Enter an integer: ");  
	    int val = scan.nextInt();
		try {  
		    System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));  
		}  
		catch (IllegalArgumentException e){  
		    System.out.println("Error: " + e.getMessage());  
		}
	    System.out.print("Another factorial? k/n)");  
	    keepGoing = scan.next();  
	    }
    }
}

	// o class with factorial method //  
		class MathUtils {  
		    public static int factorial(int n) throws IllegalArgumentException {  
		    if(n < 0)  
		    throw new IllegalArgumentException("-ve number not allowed...");  
		    else if(n > 16)  
		    throw new IllegalArgumentException("-Enter a number between 0 and 16...");  
		    int fac = 1;  
		    for (int i=n; i>0; i--)  
		    fac *= i;  
		    return fac;  


	}
}