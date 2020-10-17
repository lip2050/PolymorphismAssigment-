package polymorphismAssignment;

public class Case1 {
	
	// This will gave an error because the methods have same number of parameters and same data types.
	public int mymethod (int a, int b, float c) {
		System.out.println("First myMethod of class Demo" + c);
		return a+b;
		
	}
	public int mymethod(int var1, int var2, float var3) {
		System.out.println("Second myMethod of class Demo" + var3);
		return var2 - var1;
		
	}
	
	public static void main(String []args) {
		 Case1 C1= new Case1();
	      int result = C1.mymethod(10,10,20.3f);
	      int result2 = C1.mymethod(20,12,6.0f);
	      
	      System.out.println(result);
	      System.out.println(result2);
		
	}

}
