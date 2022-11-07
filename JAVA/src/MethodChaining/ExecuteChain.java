package MethodChaining;

public class ExecuteChain {
	
	public static void main(String[] args) {
		Gamma a = new Gamma();
		Beta b=a.memo();
		Alpha c=b.Demo();
		c.test();
		
		a.memo().Demo().test();
	}

}
