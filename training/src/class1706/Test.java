package class1706;
/*
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(100/0);
		}
		catch(Exception e) {
			System.out.println("cannot divide by zero");
		}
		finally {
			System.out.println(500/0);
		}
	}

}*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		registerUser("Krishna","China");
		registerUser("Rahul","India");
	}
	static void registerUser(String username,String userCountry) {
		try{
			if(userCountry.equals("India"))
				System.out.println("User registration done successfully.");
			else
				throw new InvalidCountryException("User outside India cannot be registered.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
class InvalidCountryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidCountryException(String s){
		super(s);
	}
}
