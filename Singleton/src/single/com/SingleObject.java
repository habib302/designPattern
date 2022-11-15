package single.com;

public class SingleObject {
	
		
	   //step 1:
	   //create an object of SingleObject with private & static
	   private static SingleObject instance = new SingleObject();

	   //step 2:
	   //make the constructor private so that this class cannot be instantiated
	   private SingleObject(){
		   
	   }

	   //step 3:
	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("this is a singleton object");
	   }
}
