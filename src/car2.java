
public class car2 extends car{

	car2(int x, int y, String z) {
		super(x, y, z);
		
	}

	@Override
	void abc() {
		System.out.println("i am abc method of abstact class ");
		
	}
public static void main(String[] args) {
	
      car2 c= new car2 (1 ,2 ,"rohit");
      car2.pqr();
      c.abc();
      c.lmn();
      

}
}
