package lambdas;

//default method
//static method

public interface Cab {
	void book(String source, String destinaton);
	
	public default void show() {
		System.out.println("Cab default method.");
		
	}
	
	public static void disp() {
		System.out.println("Cab static method.");
	}

}
