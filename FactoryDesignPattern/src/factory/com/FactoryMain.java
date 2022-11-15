package factory.com;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello factory design pattern");
		
		OS os = new Windows();
		os.specification();
	}
}
