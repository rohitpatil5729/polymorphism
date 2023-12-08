
public class methodoverriding1 extends overriding {

	public static void abc(int a,int b){
		System.out.println("i am child class method");
	}
   void abc(int a) throws InterruptedException{
		System.out.println("i am instance child class method");
	}
    void xyz() {
    	//overriding d=new overriding();
    	//d.xyz();
    
    	System.out.println("i am xyz in methodoverriding1");
    	super.xyz(1,2,3);
   }
public static void main(String[] args) throws Exception{
	//overriding.abc();// static method call by class name
  //  methodoverriding1.abc(1,2);//static method call by using class name
	methodoverriding1 a=new methodoverriding1();
	//a.abc();
	a.xyz();

	//overriding b=new overriding();
	//b.abc(0);
		
	//b.lmn();
	//a.lmn();
	
}
//String lmn() {
	//System.out.println("I AM string lmn method and my parent methodis object ");
	//return "abc";
	//}
//Character lmn() {
	// System.out.println("i am character lmn method and my parent isobject method always wider");
	//return 'a';
     //}
 Boolean lmn() {
	System.out.println("i am Boolean lmn method and my parent is object method always wider");
		return false;	
}
}
