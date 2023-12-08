
public class account {
	void show() {
		System.out.println("1");
	
	}
	void show(int a) {
		System.out.println("2");
		}
void abc(int a,String c) {
			System.out.println("hi");
			}
			void abc(String c) {
				System.out.println("bye");
			}
		
	
	public static void main(String[] args) {
		System.out.println("i am rohit");
		account a=new account();
		a.show();//above methods are in same class ,same name,also arguments are also different so this is overloading type
		a.show(1);
		//a.abc("a");
		a.abc(2,"a");
		
		
	}

}
