package Method_Constructor_String_Char;

public class ConstructorChaning {
// what is constructor chaning?
	
	//Ans:- calling consructor in side  to another constructor
	
	public ConstructorChaning(){
		this("John");
		System.out.println("hi my name without arguments constructor");
	}
	
	
	public ConstructorChaning(String name){
		this(25, 47000, "EC2");
		System.out.println("My Name is "+name);
	}
	
	public ConstructorChaning(int age,int sal,String office)
	{
		System.out.println("hi  see my detailsr ::::::::::::"+age+" " +sal+" " +office);
	}
	
	public static void main(String[] args) {
		new ConstructorChaning();
		
	}
}