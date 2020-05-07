import java.util.concurrent.TimeUnit;

public class MakeItDelay {

   /* It will make delay for 3 seconds
    */

   public static void main(String []args) {
	    try{
	    	System.out.println("Hello world");

	    	// Making 3 seconds delay
	    	TimeUnit.SECONDS.sleep(3);

	    	System.out.println("Hello world2");
		}
		catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
   }
}