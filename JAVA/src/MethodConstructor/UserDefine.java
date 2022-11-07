package MethodConstructor;

public class UserDefine {
	public static void main(String[] args) {
		Default d = new Default(); //User define Constructor //Default();
		d.M1();// calling non static method from Default class by creating object
		System.out.println("Main Method end");
		
	}

}
