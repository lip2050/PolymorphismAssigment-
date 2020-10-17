package polymorphismAssignment;

public class Case4 {
	
	float mymethod(int a, float b) {
		
		System.out.println("First myMethod of class Demo");
		return a+b;
		
	}
	float mymethod(float var1, int var2) {
		
		System.out.println("Second myMethod of class Demo");
		return var2 - var1;
		
	}

	public static void main(String[] args) {
		
		  Case4 C4= new Case4();
	      float result = C4.mymethod(10,10.0f);
	      float result2 = C4.mymethod(20.0f,12);
	      
	      System.out.println(result);
	      System.out.println(result2);
		

	}

}
