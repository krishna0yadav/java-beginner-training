package equalscomparison;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client(1122,"Synchrony","Hyderabad");
		Client client2 = new Client(1122,"Synchrony","Hyderabad");
		System.out.println(client1 == client2);
		System.out.println(client1.equals(client2));
		
		
	}
	
}
