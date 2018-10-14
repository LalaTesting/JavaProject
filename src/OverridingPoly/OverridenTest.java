package OverridingPoly;

public class OverridenTest {

	    public static void main(String[] args) {
	    	
	    	// Created Cat class objcet that is chiled class and assign to Parant class refrence.
	    	//Then we are calling to parent refrence but in this case child class overriden method will be called 
	    	// it is decided at run time by JVM.
	    	//Tell me guys Which method should be called ?
	    	   	
	    	//As you can see, In  animal class haveing same method which we have overriden in child class
	    	//becouse of that child class method will be executed.
	        Animal a1 = new Cat();
	        a1.makeNoise(); //Prints Meowoo
	         
	        Animal a2 = new Dog();
	        a2.makeNoise(); //Prints Bark
	    }
	}

