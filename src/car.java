
public abstract class car {
	abstract void abc();
	static void pqr() {
		System.out.println("i am static method in car abstarct");
	}

	void lmn() {
		System.out.println(" i am instance method in car abstract");
	}
	int a;
	int b;
	String c;
	car(int x,int y, String z){
		a=x;
		b=y;
		c=z;
		System.out.println("i am paraent constructor");
		
	}
}
