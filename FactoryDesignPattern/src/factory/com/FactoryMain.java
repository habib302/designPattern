package factory.com;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("factory design pattern");
		
		
		//mehtod 1
		//we can change android, windows, IOS accordingly
		OS os = new Windows();
		os.specification();
		
		
		//mehod 2
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("android");
		obj.specification();
	}
}
