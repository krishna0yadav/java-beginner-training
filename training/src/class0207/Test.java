package class0207;


public class Test  implements Runnable {

	public static void main(String[] args) {
		new Thread(new Test()).start();
	}

	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			if(i==6)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
			System.out.println(i);
		}
		
	}

}
