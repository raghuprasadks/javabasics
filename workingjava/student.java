package workingjava;

public class student {
	
	String name;
	String admissionNumber;
	int standard;
	char section;
	String address;
	String schoolName;
	long contactNumber;

	public static void main(String[] args) {
		student nischint = new student();
		nischint.name = "Nischint";
		nischint.admissionNumber = "2018-19/10/18";
		nischint.standard = 10;
		nischint.section = 'B';
		nischint.address = "sahakar nagar";
		nischint.schoolName = "RVK";
		nischint.contactNumber =  9845547471l;
		System.out.println("Student : Nischint: Name :" +nischint.name +" :Admission Number : "+nischint.admissionNumber);

		student guru = new student();
		guru.name = "Guru";
		guru.admissionNumber = "2018-19/8/11";
		guru.standard = 8;
		guru.section = 'A';
		guru.address = "Amruthahalli";
		guru.schoolName = "Sindhi";
		guru.contactNumber =  9008663619l;
		System.out.println("Student : Guru: Name :" +guru.name +" :Admission Number : "+guru.admissionNumber);

	}

}
