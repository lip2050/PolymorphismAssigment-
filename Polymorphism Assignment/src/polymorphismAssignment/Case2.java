package polymorphismAssignment;


public class Case2 {
	
	public int mymethod(int a, int b) {
		System.out.println("First myMethod of class Demo");
		return a+b;
		
	}
	public float mymethod(float var1, float var2) {
		System.out.println("Second myMethod of class Demo");
		return var2 - var1;
	}
	
	public static void main (String []args){
		
		  Case2 C2= new Case2();
	      int result = C2.mymethod(10,10);
	      float result2 = C2.mymethod(20.0f,12.0f);
	      
	      System.out.println(result);
	      System.out.println(result2);
	      
	    
	      
		
	}

}
