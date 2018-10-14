package Abstraction;


// If you wan to achieve abstraction inheritance and polymorephism is required
public abstract class AbstractClassExample 
{
	
	//Basic points:- 
	
	//1) Abstract class is a class where We are declaring with abstract keyword
	//2) In Abstract class may or may not have abstract methods.
	//3)With the help of abstract class we can achieve 0 to 100 %  abstraction
	//4)It can be have all method abstract or concrete.
	//we can not create an object for abstract class because it can be abstract method as well as concrete method
	
	//5)Why we need :- When ever we don't have complete implementation then we go for abstract class
	//see below example here I am taking only the concrete method we don't have abstract method but still
	//abstract class is allowing to use abstraction
	
	public void Test1(){
		System.out.println("Hi Man I am Concreet method");
	}
	
	public void Test2(){
		System.out.println("Hi Man I am Test2 Concreet method");
	}
	
	
	// Here as you can see the test3 method do not body that is abstract method.So in subclass we can write implementation
	//of this method as the requirement.
    abstract void Test3();
    
// If you will not override all the abstract method then you have to make to the as a abstract.
    
}
