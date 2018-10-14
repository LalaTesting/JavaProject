package OverridingPoly;


// Here We have created Animal class 
public class Animal {
	
	// makeNiose method is 
	
	    public void makeNoise()
	    {
	        System.out.println("Some sound");
	    }
	}
	 
	class Dog extends Animal{
	    public void makeNoise()
	    {
	        System.out.println(" Dog is barking :---Bark");
	    }
	}
	 
	class Cat extends Animal{
	    public void makeNoise()
	    {
	        System.out.println("Cat is sounding :---Meawoo");
	    }
	}


