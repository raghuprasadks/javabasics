package interfacesamples;

public class testinterface {
	
	public static void main(String args[])
	{
		tvremote tvremote1 = new sonytv();
		tvremote1.on();
		tvremote1.off();
		tvremote1.changechannel("Star Sports1");
		tvremote1.changevolume(30);
		
		tvremote tvremote2 = new parasonic();
		tvremote2.on();
		tvremote2.off();
		tvremote2.changechannel("Republic");
		tvremote2.changevolume(30);

		
	}

}
