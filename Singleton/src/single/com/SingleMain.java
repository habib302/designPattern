package single.com;

public class SingleMain {

	public static void main(String[] args) {
		
		System.out.println("this is singleton design pattern");
		
	    //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
		//early instantiation method
        SingleObject object = SingleObject.getInstance();

       //show the message
       object.showMessage();
		
	}

}
