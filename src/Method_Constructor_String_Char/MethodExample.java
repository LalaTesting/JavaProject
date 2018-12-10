package Method_Constructor_String_Char;

public class MethodExample

{
	public void sample(){
		System.out.println("Hi man This is sample method");
	}
	//without arguments 
	public int add(){
		int i=10;
		int j=20;
		
		int c=i+j;
		return c;
	}
	
	public String nameOfCity(String city){
	
		return city;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample method=new MethodExample();
		method.sample();
		int value=method.add();
		System.out.println(value);
		String cithname=method.nameOfCity("Bangalore");
		System.out.println(cithname);
	}

}
