
public class methodoverloading {
	
	//void abc(StringBuffer a) {
	//	System.out.println("i am int method");
		
//	}
	static void abc(String b) {
		System.out.println("i am string method");
		
	}
	void abc(int a) { 
		
	}
	
	public static void main(String[] args) {
		methodoverloading a=new methodoverloading();
		//a.abc("abc");
	//	a.abc(new StringBuffer("XYZ"));
		main();
	}
	
	public static void main() {
		System.out.println("user defined method");
		
	}
	final int pqr(String b) {
		int a=10;
		return a;
		
	}
	final String pqr(int a) {
		String c="A";
		return "A";
		
	}
	
	

}
