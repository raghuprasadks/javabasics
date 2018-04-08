package interfacesamples;

public class sonytv implements tvremote{
	@Override
	public void on() {
	System.out.println("sonytv : on ");
	}	
	public void off() {
		System.out.println("sonytv : off ");
		
	}	
	public void changechannel(String newChannel) {
		System.out.println("sonytv : changechannel " +newChannel);
	}	
	public void changevolume(int volume) {
		System.out.println("sonytv : changevolume " +volume);
	}


}
