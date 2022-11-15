package factory.com;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		
		if(str.equals("android")) {
			return new Android();
		}
		else if(str.equals("windows")) {
			return new Windows();
		}
		else {
			return new IOS();
		}
	}
}
