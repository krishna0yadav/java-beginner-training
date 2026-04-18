package class1706;

public class UDE extends Exception{
	
	UDE(String s){
		super(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Throwing UDE...");
			throw new UDE("User defined exception.");
		}
		catch(Exception e) {
			System.out.println("Exception caught:");
			System.out.println(e);
		}
	}

}
