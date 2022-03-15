package sample;

import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	    try {
	    	demo();
	    }  catch (Exception e) {
	       e.printStackTrace();
	    }
	}
		
	public static void demo() throws Exception {
			System.out.println("Hello world...!");
			int i = 1/0;
			System.out.println("Completed");
		}
		
	}
		
      //Exception handing 
             //Keywords
        //try
        //catch
        //finally
        //throws
       //throw
	



