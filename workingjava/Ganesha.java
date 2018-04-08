package workingjava;

public class Ganesha {	
	String color; // instance
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ganesha raghuGanesha = new Ganesha();
		raghuGanesha.name = "Ekadanta";
		raghuGanesha.color = "Red";
		
		Ganesha SuryaGanesha = new Ganesha();
		SuryaGanesha.name = "Lambodhara";
		SuryaGanesha.color = "Green";
		
		Ganesha JayashreeGanesha = new Ganesha();
		JayashreeGanesha.name = "Gajanana";
		JayashreeGanesha.color = "Yellow";
		
		Ganesha SunithaGanesha = new Ganesha();
		SunithaGanesha.name = "Vignaraja";
		SunithaGanesha.color = "Violet";
				
		System.out.println("Ganesha in Sunitha's house: Name " +SunithaGanesha.name + " Color : " +SunithaGanesha.color );
		
		

	}

}
