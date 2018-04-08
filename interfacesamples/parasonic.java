package interfacesamples;

public class parasonic implements tvremote{

	@Override
	public void on() {
		System.out.println("parasonic : on ");
		
	}

	@Override
	public void off() {
		System.out.println("parasonic : off ");
		
	}

	@Override
	public void changechannel(String newChannel) {
		System.out.println("parasonic : changechannel " +newChannel);
		
	}

	@Override
	public void changevolume(int volume) {
		System.out.println("parasonic : changechannel " +volume);
		
	}

}
