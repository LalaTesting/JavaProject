package Method_Constructor_String_Char;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="AttraInfotech";
		System.out.println(name.length());//output 13
		System.out.println(name.toLowerCase());//output=attrainfotech
		System.out.println(name.toUpperCase());
		
		System.out.println(name.charAt(5));//output=I
		System.out.println(name.equals("AttraInfotech"));//true
		System.out.println(name.indexOf("I"));//6
		System.out.println(name.substring(0, 5));//attra
		System.out.println(name.concat("Bangalore"));//attrainfotechBangalore
		System.out.println(name.contains("tech"));//true
		System.out.println(name.lastIndexOf("h"));
	

	}

}
