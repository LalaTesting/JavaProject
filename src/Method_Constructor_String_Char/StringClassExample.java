package Method_Constructor_String_Char;

import java.awt.geom.Area;

public class StringClassExample {

	public static void main(String[] args) {
		
	//what is string?
		// string is gruop of character.
		
		//Ans:- String is a class which is present  in lang package once you have create an objcet you can not change the state of object.
		
		String name ="helloJava";// sample string
		
		System.out.println(name);
		
		//How many types we can create an objcet in string class?
		
		String s1="Attra"; // this is string littral
		String s2 =new String("Attra"); // with the help of new keywork
		
		//what is difference in both of them?
		
		//Si=Attra is saving in scp Area.class
		//if we use new keywork then string object will be created on the heap.
		
		//why string is immutable?
		String s="Attra";
	   s=  s.concat("Infotech");
	    System.out.println(s);
	
		
		
		
		
		
		



	}

}
