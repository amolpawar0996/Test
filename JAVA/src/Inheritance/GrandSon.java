package Inheritance;

public class GrandSon extends Son {
	public void Bicycle(){
		System.out.println("Bicycle");
	}
	public static void main(String[] args) {
		GrandSon g = new GrandSon();
		g.Bicycle();
		g.Bike();
		g.Car();
		g.Home();
		g.money();
	}
}
	
