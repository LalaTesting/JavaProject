package Abstraction;

public class AbstractTest extends AbstractClassExample {

	public static void main(String[] args) {

		AbstractClassExample test=new AbstractTest();
		test.Test1();
	//This is runtime poly.
		test.Test3();
		
		
	}
// this annotation is used for to the understand the programer like this method is overridden method
	@Override
	void Test3() {
    System.out.println("Hello guys ' I am overriding test3 method from parent class");
		
	}

}
