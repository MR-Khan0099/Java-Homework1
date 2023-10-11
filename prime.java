package Homework1;

public class prime {
		    public static void main(String[] args) {
		        int nValues = 50;
		        outerloop: for (int i = 2; i <= nValues; i++) {
		            for (int j = 2; j * j <= i; j++) {
		                if (i % j == 0) {
		                    // Not a prime, so skip to the next number
		                    continue outerloop;
		                }
		               
		            }
		            // If we reach here, it's a prime number
		            System.out.println(i);
		        }
		    }
		


	}



