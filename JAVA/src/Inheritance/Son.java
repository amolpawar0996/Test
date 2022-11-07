package Inheritance;

public class Son extends Father {
	public void Bike() {
		System.out.println("Bike");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.Bike();
		s.Car();
		s.Home();
		s.money();
	}
	
}
