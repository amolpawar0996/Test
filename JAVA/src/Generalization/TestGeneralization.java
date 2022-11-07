package Generalization;

public class TestGeneralization {
	public static void main(String[] args) {
		System.out.println("##Features of Airtel##");
	
	Airtel a = new Airtel();
	a.audiocalling();
	a.SMS();
	a.Internet();
	a.NewFeatures();
	
	    System.out.println("##Features of Jio##");
	Jio j = new Jio();
	j.audiocalling();
	j.SMS();
	j.Internet();
	j.NewFeatures();
	
	
	}

}
