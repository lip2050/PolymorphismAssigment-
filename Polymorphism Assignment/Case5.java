package polymorphismAssignment;

public class Case5 {
	
	// This will gave an error because the methods have same number of parameters and same data types.
	int mymethod(int a, int b) {
		
		System.out.println("First myMethod of class Demo");
		return a+b;
	}

	float mymethod(int var1, int var2) {
		
		System.out.println("Second myMethod of class Demo");
		return var2 - var1;
		
	}
	

	public static void main(String[] args) {
		
		 Case5 C5= new Case5();
	      int result = C5.mymethod(10,10);
	      int result2 = C5.mymethod(20,12);
	      
	      System.out.println(result);
	      System.out.println(result2);
		


	}

}
