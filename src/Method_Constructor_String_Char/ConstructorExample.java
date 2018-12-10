package Method_Constructor_String_Char;

public class ConstructorExample {
	
 int i;
 int j;
	
	public ConstructorExample(){
		System.out.println("hello guys this is default constructor");
	}
	
	public ConstructorExample(int A,int B){
	i=A;
	j=B;
		System.out.println(i+j);
	}

	public static void main(String[] args) 
	{
		//no arguments constructor
		ConstructorExample example=new ConstructorExample();
		//Parameterize  constructor
		ConstructorExample example1=new ConstructorExample(20,30);

	}

}
