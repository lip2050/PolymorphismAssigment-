package polymorphismAssignment;

public class Case3 {
	
	
	int mymethod(int a, int b) {
		
		System.out.println("First myMethod of class Demo");
		return a+b;
		
	}
	int mymethod(int num) {
		
		System.out.println("Second myMethod of class Demo");
		return num/2;
		
	}
	
	public static void main (String []args) {
		
		 Case3 C3= new Case3();
	      int result = C3.mymethod(10,10);
	      int result2 = C3.mymethod(12);
	      
	      System.out.println(result);
	      System.out.println(result2);
		
	}

}
