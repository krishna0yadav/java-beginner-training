package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import equalscomparison.Client;

public class LambdaDemo {
	
	public static void main(String args[]) {
		List<Client> clients = Arrays.asList(
				new Client(13,"wipro","Bangalore"),
				new Client(11,"wipro","Bangalore"),
				new Client(1,"wipro","Bangalore"),
				new Client(51,"wipro","Bangalore"),
				new Client(18,"wipro","Bangalore")
				);
		
		Collections.sort(clients);
		
		clients.stream().map(p -> p.getName()).;
		
	}

}
