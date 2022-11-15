package builder.com;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is builder design pattern");
		
		//method 1
		//this is general way
		Phone p1 = new Phone("android",2,"QualComm",5.5,3100);
		System.out.println(p1);
		
		
		//method 2
		//using builder pattern
		Phone p2 = new PhoneBuilder().setOs("android").setRam(4).getPhone();
		System.out.println(p2);
	}

}
